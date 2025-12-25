package com.gmail.jamal009a.kirbymodremorphed.client.handler;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.SecondaryAbilityC2SPacket;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import com.gmail.jamal009a.kirbymodremorphed.client.ModKeybindings;
import com.gmail.jamal009a.kirbymodremorphed.network.ModMessages;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.PrimaryAbilityC2SPacket;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.Objects;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    public static int holdTimeSecondary = 0;
    public static int holdTimePrimary = 0;
    static int giveCooldown = 0;


    public static void playerAnimationPlay(AbstractClientPlayer player, String animationName){
        var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
        assert animation != null;
        if (!animation.isActive()) {
            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", animationName)))));
        }
    }

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();

        //adds one every tick
        //therefore 1giveCooldown= 1 =1tick
        giveCooldown += 1;

        var player = minecraft.player;
        assert player != null;

        if(ModKeybindings.INSTANCE.primaryAbilityUse.isDown()){holdTimePrimary += 1;} else if (!ModKeybindings.INSTANCE.primaryAbilityUse.isDown()) {holdTimePrimary = 0;}
        if(ModKeybindings.INSTANCE.primaryAbilityUse.consumeClick()){
            ModMessages.sendToServer(new PrimaryAbilityC2SPacket());
        }

        //this line removes the ability to hold the second keybind
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()){holdTimeSecondary += 1;} else if (!ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()) {holdTimeSecondary = 0;}
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.consumeClick()) {
            ModMessages.sendToServer(new SecondaryAbilityC2SPacket());
        }
    }
}
