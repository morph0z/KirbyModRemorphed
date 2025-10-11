package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.particle.ModParticles;
import net.minecraft.client.gui.font.glyphs.BakedGlyph;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.commands.EffectCommands;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class SecondaryAbilityC2SPacket {
    public SecondaryAbilityC2SPacket(){

    }

    public SecondaryAbilityC2SPacket(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(()->{
            //SERVER SIDE SHENANIGANS
            ServerPlayer player = context.getSender();
            ServerLevel level = (ServerLevel) context.getSender().level();
            assert player != null;
            if (!player.level().isClientSide()) {
                if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.FIGHTER_ABILITY.get()) {
                    KiBlastProjectileEntity projectile = new KiBlastProjectileEntity(ModEntities.KI_BLAST_PROJECTILE.get(), player, player.level());
                    projectile.setPos(player.xo, player.yo + 0.65, player.zo);
                    projectile.setDeltaMovement(Vec3.directionFromRotation(player.getRotationVector()));
                    if (ClientForgeHandler.holdTimeSecondary < 80){
                        ((ServerLevel)level).sendParticles(ModParticles.HADUKEN_PARTICLES.get(),
                                player.getX()+0,player.getEyeY()-1,player.getZ()+0,
                                30,0,0,0,1);
                    }

                    if (ClientForgeHandler.holdTimeSecondary >= 80) {
                        if (ClientForgeHandler.holdTimeSecondary <= 81) {
                            player.level().addFreshEntity(projectile);
                        }
                    }

                }
                else if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.JET_ABILITY.get()) {
                    player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 3));
                    ((ServerLevel)level).sendParticles(ParticleTypes.FLAME,
                            player.getX()+0,player.getY()+0,player.getZ()+0,
                            5,0,-0.3,0,0.4);
                }
            }
        });
        return true;
    }
}
