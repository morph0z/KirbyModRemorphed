package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.SmallFireball;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;

import java.util.function.Supplier;

public class PrimaryAbilityC2SPacket {
    public PrimaryAbilityC2SPacket(){

    }

    public PrimaryAbilityC2SPacket(FriendlyByteBuf buf){

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
            if((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.FIGHTER_ABILITY.get()){
                player.addItem(new ItemStack(ModItems.FIGHTER_GLOVE.get()));
            }
            if((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.JET_ABILITY.get()){
                ((ServerLevel)level).sendParticles(ParticleTypes.FLAME,
                        player.getX()+0,player.getY()+1,player.getZ()+0,
                        20,0,0,0,0.4);
                ((ServerLevel)level).sendParticles(ParticleTypes.FLAME,
                        player.getX()+0,player.getY()+1,player.getZ()+0,
                        20,0,0,0,0.4);
            }
            if((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.BEAM_ABILITY.get()){
                ((ServerLevel)level).sendParticles(ParticleTypes.DRAGON_BREATH,
                        player.getX()+0,player.getY()+1,player.getZ()+0,
                        20,0,0,0,0.4);
            }
        });
        return true;
    }
}
