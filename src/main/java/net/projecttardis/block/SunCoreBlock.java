
package net.projecttardis.block;

import net.projecttardis.procedures.SunCoreItemInInventoryTickProcedure;
import net.projecttardis.init.ProjectTardisModBlocks;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

public class SunCoreBlock extends Block {
	public SunCoreBlock() {
		super(Block.Properties.create(Material.IRON).sound(SoundType.METAL).hardnessAndResistance(1.5f, 10f).notSolid().setOpaque((bs, br, bp) -> false));
	}

	@OnlyIn(Dist.CLIENT)
	public static void registerRenderLayer() {
		RenderTypeLookup.setRenderLayer(ProjectTardisModBlocks.SUN_CORE.get(), RenderType.getCutout());
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
		return true;
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 0;
	}

	@Override
	public VoxelShape getRaytraceShape(BlockState state, IBlockReader world, BlockPos pos) {
		return VoxelShapes.empty();
	}

	@Override
	public void onEntityWalk(World world, BlockPos pos, Entity entity) {
		super.onEntityWalk(world, pos, entity);
		SunCoreItemInInventoryTickProcedure.execute(world, entity);
	}
}
