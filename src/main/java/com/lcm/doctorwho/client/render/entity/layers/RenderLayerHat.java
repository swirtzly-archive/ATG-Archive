package com.lcm.doctorwho.client.render.entity.layers;

import com.lcm.doctorwho.common.items.ItemHatOutline;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;

public class RenderLayerHat implements LayerRenderer<EntityLivingBase> {

    @Override
    public void doRenderLayer(EntityLivingBase entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        ItemStack item = entity.getItemStackFromSlot(EntityEquipmentSlot.HEAD);

            if(!item.isEmpty() && item.getItem() instanceof ItemHatOutline)
            {
                ItemHatOutline hat = (ItemHatOutline)item.getItem();
                hat.getModel().render(entity, limbSwing,limbSwingAmount,ageInTicks,netHeadYaw,headPitch,scale);
            }
    }

    @Override
    public boolean shouldCombineTextures() {
        return false;
    }
}