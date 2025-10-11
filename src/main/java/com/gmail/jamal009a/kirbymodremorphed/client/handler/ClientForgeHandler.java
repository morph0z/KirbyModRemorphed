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
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.level.Level;
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
    //static boolean keybindRunning = false;
    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();

        //adds one every tick
        //therefore 1giveCooldown= 1 =1tick
        giveCooldown += 1;

        //fighter ability blast timer

        var player = minecraft.player;
        assert player != null;

        if(ModKeybindings.INSTANCE.primaryAbilityUse.isDown()){holdTimePrimary += 1;} else if (!ModKeybindings.INSTANCE.primaryAbilityUse.isDown()) {holdTimePrimary = 0;}
        if(ModKeybindings.INSTANCE.primaryAbilityUse.consumeClick()){
            //give item
            if(giveCooldown >= 20) {
                ModMessages.sendToServer(new PrimaryAbilityC2SPacket());
                assert Minecraft.getInstance().level != null;
                giveCooldown = 0;
            }

            //do animation
            var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
            assert animation != null;
            if (!animation.isActive()) {
                if (animation != null) {
                    // if has jet ability
                    if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.JET_ABILITY.get()) {
                        animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetdashmove")))));
                        ModMessages.sendToServer(new PrimaryAbilityC2SPacket());
                        //launches player in direction
                        //can only be done on client side
                        if (player.getDirection() == Direction.NORTH) {
                            player.addDeltaMovement(new Vec3(0, 0.5, -1.5));
                            if (holdTimePrimary > 20) {
                                player.addDeltaMovement(new Vec3(0, 0, 2));
                                animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetdashstop")))));
                            }
                        } else if (player.getDirection() == Direction.SOUTH) {
                            player.addDeltaMovement(new Vec3(0, 0.5, 1.5));
                            if (holdTimePrimary > 20) {
                                player.addDeltaMovement(new Vec3(0, 0, -2));
                                animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetdashstop")))));
                            }
                        } else if (player.getDirection() == Direction.EAST) {
                            player.addDeltaMovement(new Vec3(1.5, 0.5, 0));
                            if (holdTimePrimary > 20) {
                                player.addDeltaMovement(new Vec3(-2, 0, 0));
                                animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetdashstop")))));
                            }
                        } else if (player.getDirection() == Direction.WEST) {
                            player.addDeltaMovement(new Vec3(-1.5, 0.5, 0));
                            if (holdTimePrimary > 20) {
                                player.addDeltaMovement(new Vec3(2, 0, 0));
                                animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetdashstop")))));
                            }
                        }
                    }
                    if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.BEAM_ABILITY.get()){
                        animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "wandwave")))));
                        ModMessages.sendToServer(new PrimaryAbilityC2SPacket());
                    }
                }
            }
        }

        //this line removes the ability to hold the second keybind
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()){holdTimeSecondary += 1;} else if (!ModKeybindings.INSTANCE.secondaryAbilityUse.isDown()) {holdTimeSecondary = 0;}
        if(ModKeybindings.INSTANCE.secondaryAbilityUse.consumeClick()) {
            ModMessages.sendToServer(new SecondaryAbilityC2SPacket());
            var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
            assert animation != null;
            //this removes the ability for a player to spam the keybind by checking if an animation is playing currently
            if (!animation.isActive()) {
                if (holdTimeSecondary <= 1) {
                    if (animation != null) {
                        // if has fighter ability
                        if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.FIGHTER_ABILITY.get()) {
                            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "haduken")))));
                        } else if ((player.getItemBySlot(EquipmentSlot.HEAD)).getItem() == ModItems.JET_ABILITY.get()) {
                            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", "jetfly")))));
                            player.addDeltaMovement(new Vec3(0,1.5,0));
                        }
                    }
                }
            }
        }
    }
}
