package com.gmail.jamal009a.kirbymodremorphed.procedures;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.core.BlockPos;

import com.gmail.jamal009a.kirbymodremorphed.block.ModBlocks;
import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;

public class UnfinishedJambaHeartEntityWalksOnTheBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double stage = 0;
		stage = stage;
		if (!entity.isAlive()) {
			stage = stage + 1;
			if (stage == 1) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("you need to sacrefice 2 more lifeforms"), false);
			}
			if (stage == 2) {
				if (!world.isClientSide() && world.getServer() != null)
					world.getServer().getPlayerList().broadcastSystemMessage(Component.literal("you need to sacrefice 1 more lifeforms"), false);
			}
			if (stage == 3) {
				world.destroyBlock(BlockPos.containing(x, y, z), false);
				KirbyModRemorphed.queueServerWork(20, () -> {
					world.setBlock(BlockPos.containing(x, y, z), ModBlocks.JAMBA_HEART.get().defaultBlockState(), 3);
				});
			}
		}
	}
}
