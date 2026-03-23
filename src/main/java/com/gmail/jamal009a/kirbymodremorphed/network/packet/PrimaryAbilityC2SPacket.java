package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.AbilityClass;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.network.NetworkEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;
import java.util.function.Supplier;

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.*;

public class PrimaryAbilityC2SPacket {
    private static final Logger log = LoggerFactory.getLogger(PrimaryAbilityC2SPacket.class);

    public PrimaryAbilityC2SPacket(){}

    public PrimaryAbilityC2SPacket(FriendlyByteBuf buf){}

    public void toBytes(FriendlyByteBuf buf){}

    public void handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //SERVER SIDE SHENANIGANS
            ServerPlayer player = context.getSender();
            ServerLevel level = (ServerLevel) Objects.requireNonNull(context.getSender()).level();

            assert player != null;
            if (!player.hasItemInSlot(EquipmentSlot.HEAD)) {return;}
            if (!AbilityClass.class.isAssignableFrom(player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass())) {return;}

            AbilityClass playersHead = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();
            if (playersHead.PrimaryAbility(level, player, -1)) {playersHead.PrimaryAbility(level, player, PrimaryStage);}
        });
    }
}
