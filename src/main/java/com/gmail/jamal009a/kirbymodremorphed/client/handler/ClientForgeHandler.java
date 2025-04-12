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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.Objects;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    static int holdTime = 0;
    static int giveCooldown = 0;
    static boolean keybindRunning = false;
    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();
        //adds one every tick
        //therefore 1giveCooldown= 1 =1tick
        giveCooldown += 1;

        var player = minecraft.player;
        assert player != null;

        if(ModKeybindings.INSTANCE.primaryAbilityUse.isDown()){holdTime = holdTime + 1;} else if (!ModKeybindings.INSTANCE.primaryAbilityUse.isDown()) {holdTime = 0;}
        if(ModKeybindings.INSTANCE.primaryAbilityUse.consumeClick()){
            if(giveCooldown >= 20) {
                ModMessages.sendToServer(new PrimaryAbilityC2SPacket());
                assert Minecraft.getInstance().level != null;
                giveCooldown = 0;
            }
        }

        //this line removes the ability to hold the second keybind
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()){holdTime = holdTime + 1;} else if (!ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()) {holdTime = 0;}
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.consumeClick()) {
            var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
            assert animation != null;
            //this removes the ability for a player to spam the keybind by checking if an animation is playing currently
            if (!animation.isActive()) {
                if (holdTime <= 1) {
                    if (animation != null) {
                        // if has fighter ability
                        if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.FIGHTER_ABILITY.get()) {
                            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "haduken")))));
                            ModMessages.sendToServer(new SecondaryAbilityC2SPacket());
                        }
                    }
                }
            }
        }
    }
}
