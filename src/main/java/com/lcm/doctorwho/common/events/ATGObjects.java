package com.lcm.doctorwho.common.events;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;

import com.lcm.doctorwho.AcrossTheGalaxy;
import com.lcm.doctorwho.client.models.RenderItemFobwatch;
import com.lcm.doctorwho.client.models.items.ModelFirstDoctorCane;
import com.lcm.doctorwho.client.models.items.sonics.Model11thDocScrewdriver;
import com.lcm.doctorwho.client.render.item.RenderItemModelBase;
import com.lcm.doctorwho.common.blocks.BlockOutline;
import com.lcm.doctorwho.common.blocks.LeavesOutline;
import com.lcm.doctorwho.common.blocks.LogsOutline;
import com.lcm.doctorwho.common.items.ItemOutline;
import com.lcm.doctorwho.common.items.ItemSonic;
import com.lcm.doctorwho.common.mobs.EntityWeepingAngel;
import com.lcm.doctorwho.common.superpower.TimelordSuperpower;
import com.lcm.doctorwho.common.traits.negative.*;
import com.lcm.doctorwho.common.traits.positive.*;
import com.lcm.doctorwho.utils.ATGSoundEvent;
import com.lcm.doctorwho.utils.ATGTabs;
import com.lcm.regeneration.util.RegenObjects;

import lucraft.mods.lucraftcore.superpowers.abilities.Ability;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.IForgeRegistryEntry;

/**
 * Created by Nictogen on 2/18/18
 */
@Mod.EventBusSubscriber
public class ATGObjects {
	public static class Items {
		public static final Item eleventhDocSonic = new ItemSonic("sonic_eleventh_doc", RegenObjects.SoundEvents.REGENERATION).setCreativeTab(ATGTabs.TABS_ITEMS_SONICS);
		public static final Item firstDocCane = new ItemOutline("cane_first_doc").setCreativeTab(ATGTabs.TABS_ITEMS_SONICS);
	}
	
	public static class Blocks {
		public static final Block creamRoundel = new BlockOutline(Material.CORAL, "cream_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block creamRoundelAlt = new BlockOutline(Material.CORAL, "cream_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block whiteRoundel = new BlockOutline(Material.CORAL, "white_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block whiteRoundelAlt = new BlockOutline(Material.CORAL, "white_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block pinkRoundel = new BlockOutline(Material.CORAL, "pink_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block pinkRoundelAlt = new BlockOutline(Material.CORAL, "pink_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block blackRoundel = new BlockOutline(Material.CORAL, "black_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block blackRoundelAlt = new BlockOutline(Material.CORAL, "black_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block blueRoundel = new BlockOutline(Material.CORAL, "blue_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block blueRoundelAlt = new BlockOutline(Material.CORAL, "blue_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block brownRoundel = new BlockOutline(Material.CORAL, "brown_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block brownRoundelAlt = new BlockOutline(Material.CORAL, "brown_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block cyanRoundel = new BlockOutline(Material.CORAL, "cyan_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block cyanRoundelAlt = new BlockOutline(Material.CORAL, "cyan_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block darkGreyRoundel = new BlockOutline(Material.CORAL, "dark_grey_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block darkGreyRoundelAlt = new BlockOutline(Material.CORAL, "dark_grey_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block greenRoundel = new BlockOutline(Material.CORAL, "green_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block greenRoundelAlt = new BlockOutline(Material.CORAL, "green_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block lightBlueRoundel = new BlockOutline(Material.CORAL, "light_blue_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block lightBlueRoundelAlt = new BlockOutline(Material.CORAL, "light_blue_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block lightGreyRoundel = new BlockOutline(Material.CORAL, "light_grey_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block lightGreyRoundelAlt = new BlockOutline(Material.CORAL, "light_grey_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block limeRoundel = new BlockOutline(Material.CORAL, "lime_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block limeRoundelAlt = new BlockOutline(Material.CORAL, "lime_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block magentaRoundel = new BlockOutline(Material.CORAL, "magenta_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block magentaRoundelAlt = new BlockOutline(Material.CORAL, "magenta_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block orangeRoundel = new BlockOutline(Material.CORAL, "orange_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block orangeRoundelAlt = new BlockOutline(Material.CORAL, "orange_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block purpleRoundel = new BlockOutline(Material.CORAL, "purple_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block purpleRoundelAlt = new BlockOutline(Material.CORAL, "purple_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block redRoundel = new BlockOutline(Material.CORAL, "red_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block redRoundelAlt = new BlockOutline(Material.CORAL, "red_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block yellowRoundel = new BlockOutline(Material.CORAL, "yellow_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block yellowRoundelAlt = new BlockOutline(Material.CORAL, "yellow_roundel_alt").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		
		public static final Block alfLog = new LogsOutline("alf_log").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block alfLeaves = new LeavesOutline("alf_leaves").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		
		public static final Block coralWall = new BlockOutline(Material.CORAL, "coral_wall").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
		public static final Block coralRoundel = new BlockOutline(Material.CORAL, "coral_roundel").setCreativeTab(ATGTabs.TABS_BLOCKS_TARDIS);
	}
	
	public static class EntityEntries {
		public static final EntityEntry weepingAngel = EntityEntryBuilder.create().entity(EntityWeepingAngel.class).id(new ResourceLocation(AcrossTheGalaxy.MODID, "weeping_angel"), 0).name("angel").tracker(80, 3, false).build();
	}

	public static class SoundEvents {
		public static final SoundEvent REGENERATION = new ATGSoundEvent("regeneration");
		public static final SoundEvent TIMEY_WIMEY = new ATGSoundEvent("timey_wimey");
	}

    public static class Superpowers {
        public static final TimelordSuperpower timelord = TimelordSuperpower.INSTANCE;
    }

    public static class AbilityEntries {
        public static final Ability.AbilityEntry bouncy = newAbilityEntry(TraitBouncy.class, "bouncy");
        public static final Ability.AbilityEntry lucky = newAbilityEntry(TraitLucky.class, "lucky");
        public static final Ability.AbilityEntry quick = newAbilityEntry(TraitQuick.class, "quick");
        public static final Ability.AbilityEntry spry = newAbilityEntry(TraitSpry.class, "spry");
        public static final Ability.AbilityEntry strong = newAbilityEntry(TraitStrong.class, "strong");
        public static final Ability.AbilityEntry sturdy = newAbilityEntry(TraitSturdy.class, "sturdy");
        public static final Ability.AbilityEntry thickSkinned = newAbilityEntry(TraitThickSkinned.class, "thickskinned");
        public static final Ability.AbilityEntry tough = newAbilityEntry(TraitTough.class, "tough");
        public static final Ability.AbilityEntry smart = newAbilityEntry(TraitSmart.class, "smart");
        public static final Ability.AbilityEntry sneaky = newAbilityEntry(TraitSneaky.class, "sneaky");
        public static final Ability.AbilityEntry clumsy = newAbilityEntry(TraitClumsy.class, "clumsy");
        public static final Ability.AbilityEntry flimsy = newAbilityEntry(TraitFlimsy.class, "flimsy");
        public static final Ability.AbilityEntry frail = newAbilityEntry(TraitFrail.class, "frail");
        public static final Ability.AbilityEntry rigid = newAbilityEntry(TraitRigid.class, "rigid");
        public static final Ability.AbilityEntry slow = newAbilityEntry(TraitSlow.class, "slow");
        public static final Ability.AbilityEntry unhealthy = newAbilityEntry(TraitUnhealthy.class, "unhealthy");
        public static final Ability.AbilityEntry unlucky = newAbilityEntry(TraitUnlucky.class, "unlucky");
        public static final Ability.AbilityEntry weak = newAbilityEntry(TraitWeak.class, "weak");
        public static final Ability.AbilityEntry dumb = newAbilityEntry(TraitDumb.class, "dumb");
        public static final Ability.AbilityEntry obvious = newAbilityEntry(TraitObvious.class, "obvious");

        private static Ability.AbilityEntry newAbilityEntry(Class<? extends Ability> ability, String name) {
            return new Ability.AbilityEntry(ability, new ResourceLocation(AcrossTheGalaxy.MODID, name));
        }
    }
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@SubscribeEvent
	public static void registerObjects(RegistryEvent event) throws Exception // FIXME update exception handling according to RegenObjects
	{
		if (event instanceof RegistryEvent.Register) {
			IForgeRegistry registry = ((RegistryEvent.Register) event).getRegistry();
			
			for (Class<?> aClass : ATGObjects.class.getDeclaredClasses())
				if (Arrays.stream(aClass.getDeclaredFields()).anyMatch(field -> registry.getRegistrySuperType().isAssignableFrom(field.getType()))) {
					ArrayList<IForgeRegistryEntry> entries = new ArrayList<>();
					
					for (Field field : aClass.getDeclaredFields())
						try {
							entries.add((IForgeRegistryEntry) field.get(null));
						} catch (IllegalAccessException e) {
							e.printStackTrace();
						}
					
					if (Arrays.stream(aClass.getDeclaredFields()).anyMatch(field -> Item.class.isAssignableFrom(field.getType()))) for (Field f : Blocks.class.getDeclaredFields()) {
						Block block = (Block) f.get(null);
						entries.add(new ItemBlock(block).setRegistryName(block.getRegistryName()).setUnlocalizedName(block.getUnlocalizedName()));
					}
					entries.forEach(registry::register);
				}
		}
	}
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent e) throws ReflectiveOperationException {
		for (Field f : Items.class.getDeclaredFields()) {
			Item item = (Item) f.get(null);
			ModelResourceLocation loc = new ModelResourceLocation(item.getRegistryName(), "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, loc);
		}
		
		for (Field f : Blocks.class.getDeclaredFields()) {
			Block block = (Block) f.get(null);
			Item item = Item.getItemFromBlock(block);
			ModelResourceLocation loc = new ModelResourceLocation(item.getRegistryName(), "inventory");
			ModelLoader.setCustomModelResourceLocation(item, 0, loc);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void onModelBake(ModelBakeEvent e) {
		for (ModelResourceLocation loc : e.getModelRegistry().getKeys()) {
			if (loc.getResourcePath().equalsIgnoreCase("sonic_eleventh_doc") && loc.getResourceDomain().equalsIgnoreCase(AcrossTheGalaxy.MODID)) e.getModelRegistry().putObject(loc, new RenderItemModelBase(null, new Model11thDocScrewdriver(), new ResourceLocation(AcrossTheGalaxy.MODID, "textures/items/sonics/11th_sonic.png")));
			if (loc.getResourcePath().equalsIgnoreCase("cane_first_doc") && loc.getResourceDomain().equalsIgnoreCase(AcrossTheGalaxy.MODID)) e.getModelRegistry().putObject(loc, new RenderItemModelBase(null, new ModelFirstDoctorCane(), new ResourceLocation(AcrossTheGalaxy.MODID, "textures/items/first_doc_cane.png")));
            if (loc.getResourcePath().equalsIgnoreCase("chameleonarch") && loc.getResourceDomain().equalsIgnoreCase(AcrossTheGalaxy.MODID)) e.getModelRegistry().putObject(loc, new RenderItemFobwatch());
        }
	}
}