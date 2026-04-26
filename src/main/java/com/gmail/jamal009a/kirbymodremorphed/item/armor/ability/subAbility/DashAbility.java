package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.subAbility;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.phys.Vec3;

public interface DashAbility {
    default void Dash(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power, boolean verticalComp,
              ParticleOptions particle, float particleOffsetX, float particleOffsetY, float particleOffsetZ, int particleAmountMult, double particleSpeed,
              SoundEvent sound) {

        int verticalCompInt = (verticalComp) ? 1 : 0;
        float verticalBoost = (power/5) * verticalCompInt;
        Vec3 normLookDir = ClientPlayer.getLookAngle().normalize();
        Vec3 dashVector = new Vec3(
            normLookDir.x * power,
            verticalBoost,
            normLookDir.z * power
        );

        ClientPlayer.addDeltaMovement(dashVector);

//        if (player.getDirection() == Direction.NORTH) { ClientPlayer.addDeltaMovement(new Vec3(0, verticalBoost, -power));}
//        else if (player.getDirection() == Direction.SOUTH) {ClientPlayer.addDeltaMovement(new Vec3(0, verticalBoost, power));}
//        else if (player.getDirection() == Direction.EAST) {ClientPlayer.addDeltaMovement(new Vec3(power, verticalBoost, 0));}
//        else if (player.getDirection() == Direction.WEST) {ClientPlayer.addDeltaMovement(new Vec3(-power, verticalBoost, 0));}

        level.playLocalSound(player.getX(), player.getY(), player.getZ(), sound, SoundSource.PLAYERS, 1, 1, false);
        ClientPlayer.playSound(sound, 1, 1);
        level.sendParticles(particle,
                player.getX() + particleOffsetX, player.getY() + particleOffsetY, player.getZ() + particleOffsetZ,
                Math.round(particleAmountMult*power), 0, 0, 0, particleSpeed);
    }
}
