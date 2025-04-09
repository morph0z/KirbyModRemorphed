package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
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
                KiBlastProjectileEntity projectile = new KiBlastProjectileEntity(ModEntities.KI_BLAST_PROJECTILE.get(), player, player.level());
                projectile.setPos(player.xo,player.yo-0.1,player.zo);
                projectile.setDeltaMovement(Vec3.directionFromRotation(player.getRotationVector()));
                player.level().addFreshEntity(projectile);
            }

        });
        return true;
    }
}
