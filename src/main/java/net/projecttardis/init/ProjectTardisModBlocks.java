/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.projecttardis.init;

import net.projecttardis.block.TungstenoreBlock;
import net.projecttardis.block.SunCoreBlock;
import net.projecttardis.block.NavArrayBlock;
import net.projecttardis.ProjectTardisMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.block.Block;

public class ProjectTardisModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectTardisMod.MODID);
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	public static final RegistryObject<Block> NAV_ARRAY = REGISTRY.register("nav_array", () -> new NavArrayBlock());
	public static final RegistryObject<Block> SOLAR_CORE = REGISTRY.register("solar_core", () -> new SunCoreBlock());

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			NavArrayBlock.registerRenderLayer();
			SunCoreBlock.registerRenderLayer();
		}
	}
}
