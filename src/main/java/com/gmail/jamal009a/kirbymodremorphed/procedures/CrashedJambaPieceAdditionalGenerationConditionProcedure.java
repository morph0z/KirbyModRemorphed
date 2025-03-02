package com.gmail.jamal009a.kirbymodremorphed.procedures;

import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.LevelAccessor;

public class CrashedJambaPieceAdditionalGenerationConditionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			FallingBlockEntity.fall(_level, BlockPos.containing(x, y, z), ModBlocks.CRASHED_JAMBA_PIECE.get().defaultBlockState());
	}
}
