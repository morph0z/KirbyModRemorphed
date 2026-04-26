package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.subAbility;

import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.phys.Vec3;

public interface FlyAbility {
    default void Fly(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power,
                    ParticleOptions particle, float particleOffsetX, float particleOffsetY, float particleOffsetZ, int particleAmountMult, double particleSpeed,
                    SoundEvent sound){
        ClientPlayer.addDeltaMovement(new Vec3(0, power,0));
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int) ((power+1)*10), 3, false, false));
        level.sendParticles(particle,
                player.getX() + particleOffsetX, player.getY() + particleOffsetY, player.getZ() + particleOffsetZ,
                Math.round(particleAmountMult*power), 0, 0, 0, particleSpeed);

        level.playLocalSound(player.getX(), player.getY(), player.getZ(), sound, SoundSource.PLAYERS, 1, 1, false);
        ClientPlayer.playSound(sound, 1, 1);
    }
}
