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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.*;

public class SecondaryAbilityC2SPacket {
    private static final Logger log = LoggerFactory.getLogger(SecondaryAbilityC2SPacket.class);
    public static boolean abilityActive;

    public SecondaryAbilityC2SPacket() {

    }

    public SecondaryAbilityC2SPacket(boolean ActivateAbility){
        abilityActive = ActivateAbility;
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
            if (!abilityActive){return;}
            if (!player.hasItemInSlot(EquipmentSlot.HEAD)) {return;}
            if (!AbilityClass.class.isAssignableFrom(player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass())) {return;}

            AbilityClass playersHead = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();
            if (!playersHead.SecondaryAbility(level, player, -1)) {return;}

            playersHead.SecondaryAbility(level, player, -1);
            if ((holdTimeSecondary <= stageOneTickLength) && (holdTimeSecondary != 0)) {playersHead.SecondaryAbility(level, player, 1);}
            if ((holdTimeSecondary >= stageOneTickLength) && (holdTimeSecondary < stageTwoTickLength)) {playersHead.SecondaryAbility(level, player, 2);}
            if (holdTimeSecondary >= stageTwoTickLength) {playersHead.SecondaryAbility(level, player, 3);}
            holdTimeSecondary = 0;

            playSecondaryFirstSoundOnce = false;
            playSecondarySecondSoundOnce = false;
            playSecondaryThirdSoundOnce = false;

        });
        return true;
    }
}
