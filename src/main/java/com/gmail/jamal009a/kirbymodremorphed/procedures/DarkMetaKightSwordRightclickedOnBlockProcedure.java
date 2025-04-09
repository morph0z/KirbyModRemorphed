package com.gmail.jamal009a.kirbymodremorphed.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

public class DarkMetaKightSwordRightclickedOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y+1, z), Blocks.SOUL_FIRE.defaultBlockState(), 3);

	}
}
