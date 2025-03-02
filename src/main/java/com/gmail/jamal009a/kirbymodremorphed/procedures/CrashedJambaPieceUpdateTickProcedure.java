package com.gmail.jamal009a.kirbymodremorphed.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;

public class CrashedJambaPieceUpdateTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double check = 0;
		check = check;
		if (check == 0) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("kirbymodremorphed", "crashsite"));
				if (template != null) {
					template.placeInWorld(_serverworld, BlockPos.containing(x, y, z), BlockPos.containing(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			check = 1;
		}
	}
}
