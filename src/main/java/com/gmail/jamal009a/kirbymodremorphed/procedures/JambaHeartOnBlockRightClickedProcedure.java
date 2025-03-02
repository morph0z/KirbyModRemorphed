package com.gmail.jamal009a.kirbymodremorphed.procedures;

import net.minecraft.world.level.LevelAccessor;
//import net.minecraft.world.entity.MobSpawnType;
//import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

//import net.mcreator.kirbymod.init.KirbyModModEntities;

public class JambaHeartOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.PORTAL, x, y, z, 5, 3, 3, 3, 1);
		//if (world instanceof ServerLevel _level) {
		//	Entity entityToSpawn = KirbyModModEntities.VOID_TERMINA_PHASE_1.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
		//	if (entityToSpawn != null) {
		//		entityToSpawn.setDeltaMovement(0, 0, 0);
		//	}
		//}
	}
}
