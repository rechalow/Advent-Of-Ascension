package net.tslat.aoa3.structure.candyland;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class CandyCane1 extends AoAStructure { //StructureSize: 2x18x8
	private static final IBlockState redCandy = BlockRegister.candyRed.getDefaultState();
	private static final IBlockState whiteCandy = BlockRegister.candyWhite.getDefaultState();

	public CandyCane1() {
		super("CandyCane1");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 0, 0, 6, whiteCandy);
		addBlock(world, basePos, 0, 0, 7, whiteCandy);
		addBlock(world, basePos, 1, 0, 6, whiteCandy);
		addBlock(world, basePos, 1, 0, 7, whiteCandy);
		addBlock(world, basePos, 0, 1, 6, redCandy);
		addBlock(world, basePos, 0, 1, 7, redCandy);
		addBlock(world, basePos, 1, 1, 6, redCandy);
		addBlock(world, basePos, 1, 1, 7, redCandy);
		addBlock(world, basePos, 0, 2, 6, whiteCandy);
		addBlock(world, basePos, 0, 2, 7, whiteCandy);
		addBlock(world, basePos, 1, 2, 6, whiteCandy);
		addBlock(world, basePos, 1, 2, 7, whiteCandy);
		addBlock(world, basePos, 0, 3, 6, redCandy);
		addBlock(world, basePos, 0, 3, 7, redCandy);
		addBlock(world, basePos, 1, 3, 6, redCandy);
		addBlock(world, basePos, 1, 3, 7, redCandy);
		addBlock(world, basePos, 0, 4, 6, whiteCandy);
		addBlock(world, basePos, 0, 4, 7, whiteCandy);
		addBlock(world, basePos, 1, 4, 6, whiteCandy);
		addBlock(world, basePos, 1, 4, 7, whiteCandy);
		addBlock(world, basePos, 0, 5, 6, redCandy);
		addBlock(world, basePos, 0, 5, 7, redCandy);
		addBlock(world, basePos, 1, 5, 6, redCandy);
		addBlock(world, basePos, 1, 5, 7, redCandy);
		addBlock(world, basePos, 0, 6, 6, whiteCandy);
		addBlock(world, basePos, 0, 6, 7, whiteCandy);
		addBlock(world, basePos, 1, 6, 6, whiteCandy);
		addBlock(world, basePos, 1, 6, 7, whiteCandy);
		addBlock(world, basePos, 0, 7, 6, redCandy);
		addBlock(world, basePos, 0, 7, 7, redCandy);
		addBlock(world, basePos, 1, 7, 6, redCandy);
		addBlock(world, basePos, 1, 7, 7, redCandy);
		addBlock(world, basePos, 0, 8, 6, whiteCandy);
		addBlock(world, basePos, 0, 8, 7, whiteCandy);
		addBlock(world, basePos, 1, 8, 6, whiteCandy);
		addBlock(world, basePos, 1, 8, 7, whiteCandy);
		addBlock(world, basePos, 0, 9, 6, redCandy);
		addBlock(world, basePos, 0, 9, 7, redCandy);
		addBlock(world, basePos, 1, 9, 6, redCandy);
		addBlock(world, basePos, 1, 9, 7, redCandy);
		addBlock(world, basePos, 0, 10, 6, whiteCandy);
		addBlock(world, basePos, 0, 10, 7, whiteCandy);
		addBlock(world, basePos, 1, 10, 6, whiteCandy);
		addBlock(world, basePos, 1, 10, 7, whiteCandy);
		addBlock(world, basePos, 0, 11, 6, redCandy);
		addBlock(world, basePos, 0, 11, 7, redCandy);
		addBlock(world, basePos, 1, 11, 6, redCandy);
		addBlock(world, basePos, 1, 11, 7, redCandy);
		addBlock(world, basePos, 0, 12, 6, whiteCandy);
		addBlock(world, basePos, 0, 12, 7, whiteCandy);
		addBlock(world, basePos, 1, 12, 6, whiteCandy);
		addBlock(world, basePos, 1, 12, 7, whiteCandy);
		addBlock(world, basePos, 0, 13, 0, whiteCandy);
		addBlock(world, basePos, 0, 13, 1, whiteCandy);
		addBlock(world, basePos, 0, 13, 6, redCandy);
		addBlock(world, basePos, 0, 13, 7, redCandy);
		addBlock(world, basePos, 1, 13, 0, whiteCandy);
		addBlock(world, basePos, 1, 13, 1, whiteCandy);
		addBlock(world, basePos, 1, 13, 6, redCandy);
		addBlock(world, basePos, 1, 13, 7, redCandy);
		addBlock(world, basePos, 0, 14, 0, redCandy);
		addBlock(world, basePos, 0, 14, 1, redCandy);
		addBlock(world, basePos, 0, 14, 6, whiteCandy);
		addBlock(world, basePos, 0, 14, 7, whiteCandy);
		addBlock(world, basePos, 1, 14, 0, redCandy);
		addBlock(world, basePos, 1, 14, 1, redCandy);
		addBlock(world, basePos, 1, 14, 6, whiteCandy);
		addBlock(world, basePos, 1, 14, 7, whiteCandy);
		addBlock(world, basePos, 0, 15, 0, whiteCandy);
		addBlock(world, basePos, 0, 15, 1, whiteCandy);
		addBlock(world, basePos, 0, 15, 6, redCandy);
		addBlock(world, basePos, 0, 15, 7, redCandy);
		addBlock(world, basePos, 1, 15, 0, whiteCandy);
		addBlock(world, basePos, 1, 15, 1, whiteCandy);
		addBlock(world, basePos, 1, 15, 6, redCandy);
		addBlock(world, basePos, 1, 15, 7, redCandy);
		addBlock(world, basePos, 0, 16, 0, redCandy);
		addBlock(world, basePos, 0, 16, 1, redCandy);
		addBlock(world, basePos, 0, 16, 2, whiteCandy);
		addBlock(world, basePos, 0, 16, 3, redCandy);
		addBlock(world, basePos, 0, 16, 4, whiteCandy);
		addBlock(world, basePos, 0, 16, 5, redCandy);
		addBlock(world, basePos, 0, 16, 6, whiteCandy);
		addBlock(world, basePos, 0, 16, 7, whiteCandy);
		addBlock(world, basePos, 1, 16, 0, redCandy);
		addBlock(world, basePos, 1, 16, 1, redCandy);
		addBlock(world, basePos, 1, 16, 2, whiteCandy);
		addBlock(world, basePos, 1, 16, 3, redCandy);
		addBlock(world, basePos, 1, 16, 4, whiteCandy);
		addBlock(world, basePos, 1, 16, 5, redCandy);
		addBlock(world, basePos, 1, 16, 6, whiteCandy);
		addBlock(world, basePos, 1, 16, 7, whiteCandy);
		addBlock(world, basePos, 0, 17, 0, redCandy);
		addBlock(world, basePos, 0, 17, 1, redCandy);
		addBlock(world, basePos, 0, 17, 2, whiteCandy);
		addBlock(world, basePos, 0, 17, 3, redCandy);
		addBlock(world, basePos, 0, 17, 4, whiteCandy);
		addBlock(world, basePos, 0, 17, 5, redCandy);
		addBlock(world, basePos, 0, 17, 6, whiteCandy);
		addBlock(world, basePos, 0, 17, 7, whiteCandy);
		addBlock(world, basePos, 1, 17, 0, redCandy);
		addBlock(world, basePos, 1, 17, 1, redCandy);
		addBlock(world, basePos, 1, 17, 2, whiteCandy);
		addBlock(world, basePos, 1, 17, 3, redCandy);
		addBlock(world, basePos, 1, 17, 4, whiteCandy);
		addBlock(world, basePos, 1, 17, 5, redCandy);
		addBlock(world, basePos, 1, 17, 6, whiteCandy);
		addBlock(world, basePos, 1, 17, 7, whiteCandy);
	}
}
