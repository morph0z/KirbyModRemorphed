package com.gmail.jamal009a.kirbymodremorphed.client.handler;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.AbilityClass;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.SecondaryAbilityC2SPacket;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
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
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.server.ServerLifecycleEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.Objects;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    public static int holdTimeSecondary = 0;
    static boolean wasSecondaryKeyPressed = false;

    public static int holdTimePrimary = 0;
    public static boolean wasPrimaryKeyPressed = false;

    static int giveCooldown = 0;

    public static int stageOneTickLength = 40;
    public static int stageTwoTickLength = 80;

    public static boolean playPrimaryFirstSoundOnce = false;
    public static boolean playPrimarySecondSoundOnce = false;
    public static boolean playPrimaryThirdSoundOnce = false;

    public static boolean playSecondaryFirstSoundOnce = false;
    public static boolean playSecondarySecondSoundOnce = false;
    public static boolean playSecondaryThirdSoundOnce = false;

    public static String lastAnimationPlayed;
    public static void playerAnimationPlay(AbstractClientPlayer player, String animationName){
        var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
        assert animation != null;
        if (lastAnimationPlayed != animationName) {
            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", animationName)))));
        } else if (lastAnimationPlayed == animationName) {
            if (animation.isActive()){return;}
            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", animationName)))));
        }
        lastAnimationPlayed = animationName;
    }

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();

        boolean isPrimaryCurrentlyHeld = ModKeybindings.INSTANCE.primaryAbilityUse.isDown();
        boolean isPrimaryCurrentlyPressed = ModKeybindings.INSTANCE.primaryAbilityUse.consumeClick();
        boolean isSecondaryCurrentlyHeld = ModKeybindings.INSTANCE.secondaryAbilityUse.isDown();
        boolean isSecondaryCurrentlyPressed = ModKeybindings.INSTANCE.secondaryAbilityUse.consumeClick();

        if (minecraft.screen == null) {
            var player = minecraft.player;
            assert player != null;
            if (!player.hasItemInSlot(EquipmentSlot.HEAD)) {return;}
            if (!AbilityClass.class.isAssignableFrom(player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass())) {return;}
            giveCooldown += 1;

            AbilityClass currentAbility = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();

            if (isPrimaryCurrentlyPressed){ModMessages.sendToServer(new PrimaryAbilityC2SPacket(false));}
            if (isSecondaryCurrentlyPressed){ModMessages.sendToServer(new SecondaryAbilityC2SPacket(false));}

            if (isPrimaryCurrentlyHeld) {holdTimePrimary += 1;}
            if (isSecondaryCurrentlyHeld) {holdTimeSecondary += 1;}

            if (currentAbility.HasPrimary && currentAbility.PrimaryCharges) {
                if ((holdTimePrimary <= stageOneTickLength) && (holdTimePrimary != 0)) {
                    if (!playPrimaryFirstSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_1.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§1* _ _"), true);
                        //System.out.println("Stage 1");
                        playPrimaryFirstSoundOnce = true;
                    }
                }
                if ((holdTimePrimary >= stageOneTickLength) && (holdTimePrimary < stageTwoTickLength)) {
                    if (!playPrimarySecondSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_2.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§3* * _"), true);
                        //System.out.println("Stage 2");
                        playPrimarySecondSoundOnce = true;
                    }
                }
                if (holdTimePrimary >= stageTwoTickLength) {
                    if (!playPrimaryThirdSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_3.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§b* * *"), true);
                        //System.out.println("Stage 3");
                        playPrimaryThirdSoundOnce = true;
                    }
                }
            }
            if (currentAbility.HasSecondary && currentAbility.SecondaryCharges) {
                if ((holdTimeSecondary <= stageOneTickLength) && (holdTimeSecondary != 0)) {
                    if (!playSecondaryFirstSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_1.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§4* _ _"), true);
                        //System.out.println("Stage 1");
                        playSecondaryFirstSoundOnce = true;
                    }
                }
                if ((holdTimeSecondary >= stageOneTickLength) && (holdTimeSecondary < stageTwoTickLength)) {
                    if (!playSecondarySecondSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_2.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§6* * _"), true);
                        //System.out.println("Stage 2");
                        playSecondarySecondSoundOnce = true;
                    }
                }
                if (holdTimeSecondary >= stageTwoTickLength) {
                    if (!playSecondaryThirdSoundOnce) {
                        player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_3.get(), SoundSource.NEUTRAL, 1, 1, false);
                        Minecraft.getInstance().player.displayClientMessage(Component.literal("§e* * *"), true);
                        //System.out.println("Stage 3");
                        playSecondaryThirdSoundOnce = true;
                    }
                }
            }
            if (wasPrimaryKeyPressed && !isPrimaryCurrentlyHeld){ModMessages.sendToServer(new PrimaryAbilityC2SPacket(true));}
            if (wasSecondaryKeyPressed && !isSecondaryCurrentlyHeld){ModMessages.sendToServer(new SecondaryAbilityC2SPacket(true));}

            wasSecondaryKeyPressed = isSecondaryCurrentlyHeld;
            wasPrimaryKeyPressed = isPrimaryCurrentlyHeld;
        }
    }
}
