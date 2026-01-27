package com.gmail.jamal009a.kirbymodremorphed.network.packet;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.AbilityClass;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.network.NetworkEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class PrimaryAbilityC2SPacket {
    private static final Logger log = LoggerFactory.getLogger(PrimaryAbilityC2SPacket.class);

    public PrimaryAbilityC2SPacket(){

    }

    public PrimaryAbilityC2SPacket(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    int stageOneTickLength = 40;
    int stageTwoTickLength = 80;

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            //SERVER SIDE SHENANIGANS
            ServerPlayer player = context.getSender();
            ServerLevel level = (ServerLevel) context.getSender().level();
            assert player != null;
            if (player.hasItemInSlot(EquipmentSlot.HEAD)) {
                if (AbilityClass.class.isAssignableFrom(player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass())) {
                    AbilityClass playersHead = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                    if (playersHead.PrimaryAbility(level, player, -1)) {
                        playersHead.PrimaryAbility(level, player, -1);
                        if (ClientForgeHandler.holdTimePrimary <= stageOneTickLength) {
                            System.out.println("Stage 1");
                            playersHead.PrimaryAbility(level, player, 1);
                        }
                        if ((ClientForgeHandler.holdTimePrimary >= stageOneTickLength) && (ClientForgeHandler.holdTimePrimary < stageTwoTickLength)) {
                            System.out.println("Stage 2");
                            playersHead.PrimaryAbility(level, player, 2);
                        }
                        if (ClientForgeHandler.holdTimePrimary >= stageTwoTickLength) {
                            System.out.println("Stage 3");
                            playersHead.PrimaryAbility(level, player, 3);
                        }
                    }
                }
            }
        });
        return true;
    }

    public static void serverExplotion(){}
}
