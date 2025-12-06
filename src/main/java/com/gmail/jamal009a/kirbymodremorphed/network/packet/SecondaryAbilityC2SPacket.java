package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.AbilityClass;
import com.gmail.jamal009a.kirbymodremorphed.particle.ModParticles;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.WitherSkull;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SecondaryAbilityC2SPacket {
    public SecondaryAbilityC2SPacket() {

    }

    public SecondaryAbilityC2SPacket(FriendlyByteBuf buf) {

    }

    public void toBytes(FriendlyByteBuf buf) {

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //SERVER SIDE SHENANIGANS
            ServerPlayer player = context.getSender();
            ServerLevel level = (ServerLevel) context.getSender().level();

            assert player != null;

            AbilityClass playersHead = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();

            if (playersHead.SecondaryAbility(level, player)) {
                playersHead.SecondaryAbility(level, player);
            }
        });
        return true;
    }
}
