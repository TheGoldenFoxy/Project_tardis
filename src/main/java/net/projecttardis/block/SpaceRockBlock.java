
package net.projecttardis.block;

import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

public class SpaceRockBlock extends Block {
	public SpaceRockBlock() {
		super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(10f, 50f).setRequiresTool().harvestLevel(1).harvestTool(ToolType.PICKAXE));
	}

	@Override
	public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
		return 15;
	}
}
