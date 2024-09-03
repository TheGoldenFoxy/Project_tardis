/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.projecttardis.init;

import net.projecttardis.block.TungstenoreBlock;
import net.projecttardis.ProjectTardisMod;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.RegistryObject;

import net.minecraft.block.Block;

public class ProjectTardisModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ProjectTardisMod.MODID);
	public static final RegistryObject<Block> TUNGSTENORE = REGISTRY.register("tungstenore", () -> new TungstenoreBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
