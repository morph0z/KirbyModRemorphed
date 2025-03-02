package com.gmail.jamal009a.kirbymodremorphed.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;

public class UnfinishedJambaHeartOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double stage = 0;
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		KirbyModRemorphed.queueServerWork(20, () -> {
			world.setBlock(BlockPos.containing(x, y, z), ModBlocks.JAMBA_HEART.get().defaultBlockState(), 3);
		});
	}
}
