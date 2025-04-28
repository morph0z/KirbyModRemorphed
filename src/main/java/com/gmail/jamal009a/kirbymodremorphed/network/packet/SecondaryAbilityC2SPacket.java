package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
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
            assert player != null;
            if (!player.level().isClientSide()) {
                if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.FIGHTER_ABILITY.get()) {
                    KiBlastProjectileEntity projectile = new KiBlastProjectileEntity(ModEntities.KI_BLAST_PROJECTILE.get(), player, player.level());
                    projectile.setPos(player.xo, player.yo - 0.01, player.zo);
                    projectile.setDeltaMovement(Vec3.directionFromRotation(player.getRotationVector()));
                    player.level().addFreshEntity(projectile);
                } else if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.JET_ABILITY.get()) {
                    //put something that will make the player go up
                }
            }

        });
        return true;
    }
}
