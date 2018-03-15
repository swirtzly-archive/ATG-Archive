package com.lcm.doctorwho;

import com.lcm.doctorwho.common.capabilities.CapabilityTileTardis;
import com.lcm.doctorwho.common.capabilities.ITardis;
import com.lcm.doctorwho.common.dimension.ATGDims;
import com.lcm.doctorwho.common.superpower.TimelordSuperpower;
import com.lcm.doctorwho.common.tiles.tardis.TileEntityTardis;
import com.lcm.doctorwho.common.tiles.tardis.tardis_1963.TileEntity1963Chair;
import com.lcm.doctorwho.common.tiles.tardis.tardis_1963.TileEntity1963Rotor;
import com.lcm.doctorwho.events.ATGCommonProxy;
import com.lcm.doctorwho.networking.ATGNetwork;
import com.lcm.doctorwho.utils.ATGConfig;
import com.lcm.doctorwho.utils.DebugCommand;

import com.lcm.doctorwho.utils.JsonGenUtil;
import lucraft.mods.lucraftcore.utilities.items.ItemInjection;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.io.IOException;

@Mod(modid = AcrossTheGalaxy.MODID, name = AcrossTheGalaxy.NAME, version = AcrossTheGalaxy.VERSION, dependencies = "required:forge@[14.23.1.2574,); required-after:lucraftcore@[1.12-2.0.4,)", acceptedMinecraftVersions = "1.12, 1.12.1, 1.12.2")
@EventBusSubscriber
public class AcrossTheGalaxy {
	@SidedProxy(serverSide = "com.lcm.doctorwho.events.ATGServerProxy", clientSide = "com.lcm.doctorwho.events.ATGClientProxy")
	
	public static ATGCommonProxy proxy;
	
	public static final String MODID = "lcm-atg";
	public static final String NAME = "Doctor who - Across the galaxy";
	public static final String VERSION = "1.0";
	public static final ResourceLocation ICONS = new ResourceLocation(MODID, "textures/gui/ability_icons.png");
	
	@Mod.Instance("lcm-atg")
	public static AcrossTheGalaxy instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
        setUpTiles();
	    ATGConfig.init(new Configuration(event.getSuggestedConfigurationFile()));
		proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) throws IOException {
		ATGNetwork.init();
		MinecraftForge.EVENT_BUS.register(proxy);
		proxy.init(event);
		CapabilityManager.INSTANCE.register(ITardis.class, new CapabilityTileTardis.Storage(), CapabilityTileTardis.class);
		ATGDims.dimSetup();
	}

	public static void setUpTiles() {
		GameRegistry.registerTileEntity(TileEntityTardis.class, AcrossTheGalaxy.MODID + ":tardis");
        GameRegistry.registerTileEntity(TileEntity1963Rotor.class, AcrossTheGalaxy.MODID + ":1963rotor");
        GameRegistry.registerTileEntity(TileEntity1963Chair.class, AcrossTheGalaxy.MODID + ":1963chair");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		ItemInjection.registerInjection(new TimelordSuperpower.Injection(), TimelordSuperpower.INSTANCE.getRegistryName());
		proxy.postInit(event);
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event) {
		event.registerServerCommand(new DebugCommand());
	}
	
}
