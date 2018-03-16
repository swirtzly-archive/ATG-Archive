package com.lcm.doctorwho.client.render.tiles.tardis;

import com.lcm.doctorwho.client.boti.EntityCamera;
import com.lcm.doctorwho.client.boti.FakeWorld;
import com.lcm.doctorwho.client.models.interfaces.ITardisModel;
import com.lcm.doctorwho.common.capabilities.CapabilityTileTardis;
import com.lcm.doctorwho.common.capabilities.interfaces.ITardisTile;
import com.lcm.doctorwho.common.tiles.tardis.TileEntityTardis;
import com.lcm.doctorwho.events.ATGClientProxy;
import com.lcm.doctorwho.utils.ATGConfig;
import com.lcm.doctorwho.utils.ATGUtils;
import net.minecraft.client.renderer.BufferBuilder;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Random;

public class RenderTileTardis extends TileEntitySpecialRenderer<TileEntityTardis> {

	private ITardisModel MODEL = null;

	public RenderTileTardis() {

	}

	@Override public void render(TileEntityTardis tile, double x, double y, double z, float partialTicks, int destroyStage, float alpha) {
		ITardisTile capa = tile.getCapability(CapabilityTileTardis.TARDIS, null);
		if (capa == null)
			throw new Error("TARDIS does not have capability");
		if (capa.getModelID() <= ATGClientProxy.TARDIS_MODELS.size()) {
			MODEL = ATGClientProxy.TARDIS_MODELS.get(capa.getModelID());
		}

		if (MODEL == null) {
			MODEL = ATGClientProxy.TARDIS_MODELS.get(0);
		}

		GlStateManager.pushMatrix();

		GlStateManager.translate((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
		GlStateManager.rotate(180, 0.0F, 0.0F, 1.0F);
		MODEL.setDoorOpen(capa.isDoorOpen());
		MODEL.setLampOn(new Random().nextBoolean());

		if (MODEL.getTexture() != null) {
			ATGUtils.bindTexture(MODEL.getTexture());
		}

		MODEL.renderAll(0.0625f);
		GlStateManager.popMatrix();

		FakeWorld fakeWorld = FakeWorld.getFakeWorld(ATGConfig.tardisDIM);

		EntityCamera camera = fakeWorld.getCamera(tile, new Vec3d(0.5, 1, 0.5)); //TODO get origin

		if (camera.image != null) {
			DynamicTexture texture = new DynamicTexture(camera.image);
			GlStateManager.bindTexture(texture.getGlTextureId());
			GlStateManager.pushMatrix();

			GlStateManager.translate(x, y, z);

			GlStateManager.rotate(180f, 0, 1f, 0);
			GL11.glRotatef(180, 0.0F, 0.0F, 1.0F);
			GlStateManager.disableLighting();
			Tessellator tessellator = Tessellator.getInstance();
			BufferBuilder bufferBuilder = tessellator.getBuffer();
			bufferBuilder.begin(GL11.GL_QUADS, DefaultVertexFormats.POSITION_TEX);
			bufferBuilder.pos(0, -2.5, -0.25).tex(0.25, 0).endVertex();
			bufferBuilder.pos(1, -2.5, -0.25).tex(0.75, 0).endVertex();
			bufferBuilder.pos(1, 0, -0.25).tex(0.75, 1).endVertex();
			bufferBuilder.pos(0, 0, -0.25).tex(0.25, 1).endVertex();
			tessellator.draw();
			GlStateManager.popMatrix();
			GlStateManager.enableLighting();

			camera.image = null;
			GlStateManager.deleteTexture(texture.getGlTextureId());
		}
	}

}
