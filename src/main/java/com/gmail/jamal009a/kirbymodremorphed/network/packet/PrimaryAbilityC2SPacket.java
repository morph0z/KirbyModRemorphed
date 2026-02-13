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

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.*;

public class PrimaryAbilityC2SPacket {
    private static final Logger log = LoggerFactory.getLogger(PrimaryAbilityC2SPacket.class);
    public static boolean abilityActive;

    public PrimaryAbilityC2SPacket(){

    }

    public PrimaryAbilityC2SPacket(boolean ActivateAbility){
        abilityActive = ActivateAbility;
    }

    public PrimaryAbilityC2SPacket(FriendlyByteBuf buf){

    }

    public void toBytes(FriendlyByteBuf buf){

    }

    public boolean handle(Supplier<NetworkEvent.Context> supplier){
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
            if (playersHead.PrimaryAbility(level, player, -1)) {
                playersHead.PrimaryAbility(level, player, -1);
                if ((holdTimePrimary <= stageOneTickLength) && (holdTimePrimary != 0)) {
                    playersHead.PrimaryAbility(level, player, 1);
                }
                if ((holdTimePrimary >= stageOneTickLength) && (holdTimePrimary < stageTwoTickLength)) {
                    playersHead.PrimaryAbility(level, player, 2);
                }
                if (holdTimePrimary >= stageTwoTickLength) {
                    playersHead.PrimaryAbility(level, player, 3);
                }
                holdTimePrimary = 0;

                playPrimaryFirstSoundOnce = false;
                playPrimarySecondSoundOnce = false;
                playPrimaryThirdSoundOnce = false;
            }
        });
        return true;
    }

    public static void serverExplotion(){}
}
