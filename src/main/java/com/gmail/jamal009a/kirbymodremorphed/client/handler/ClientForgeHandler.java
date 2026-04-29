package com.gmail.jamal009a.kirbymodremorphed.client.handler;

import com.gmail.jamal009a.kirbymodremorphed.KirbyModRemorphed;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.AbilityClass;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import com.gmail.jamal009a.kirbymodremorphed.util.MethodRunOnce;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import com.gmail.jamal009a.kirbymodremorphed.client.ModKeybindings;
import com.gmail.jamal009a.kirbymodremorphed.network.ModMessages;
import com.gmail.jamal009a.kirbymodremorphed.network.packet.SecondaryAbilityC2SPacket;
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
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.Objects;

@Mod.EventBusSubscriber(modid = KirbyModRemorphed.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeHandler {
    public static int holdTimeSecondary = 0;

    public static int holdTimePrimary = 0;

    public static int stageOneTickLength = 40;
    public static int stageTwoTickLength = 80;
    public static int stageThreeTickLength = 120;

    public static String lastAnimationPlayed;
    public static void playerAnimationPlay(AbstractClientPlayer player, String animationName){
        var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData(player).get(new ResourceLocation(KirbyModRemorphed.MODID, "animation"));
        assert animation != null;
        if (!Objects.equals(lastAnimationPlayed, animationName)) {
            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", animationName)))));
        } else {
            if (animation.isActive()){return;}
            animation.setAnimation(new KeyframeAnimationPlayer(Objects.requireNonNull(PlayerAnimationRegistry.getAnimation(new ResourceLocation("kirbymodremorphed", animationName)))));
        }
        lastAnimationPlayed = animationName;
    }


    static MethodRunOnce PrimaryOnce0 = new MethodRunOnce();
    static MethodRunOnce PrimaryOnce1 = new MethodRunOnce();
    static MethodRunOnce PrimaryOnce2 = new MethodRunOnce();
    static MethodRunOnce PrimaryOnce3 = new MethodRunOnce();
    static MethodRunOnce PrimaryAbilityOnce = new MethodRunOnce();

    static MethodRunOnce SecondaryOnce0 = new MethodRunOnce();
    static MethodRunOnce SecondaryOnce1 = new MethodRunOnce();
    static MethodRunOnce SecondaryOnce2 = new MethodRunOnce();
    static MethodRunOnce SecondaryOnce3 = new MethodRunOnce();
    static MethodRunOnce SecondaryAbilityOnce = new MethodRunOnce();

    public static int PrimaryStage = 0;
    public static int SecondaryStage = 0;

    @SubscribeEvent
    public static void clientTick(TickEvent.ClientTickEvent event){
        Minecraft minecraft = Minecraft.getInstance();
        var player = minecraft.player;

        boolean isPrimaryCurrentlyHeld = ModKeybindings.INSTANCE.primaryAbilityUse.isDown();
        boolean isPrimaryCurrentlyPressed = ModKeybindings.INSTANCE.primaryAbilityUse.consumeClick();

        boolean isSecondaryCurrentlyHeld = ModKeybindings.INSTANCE.secondaryAbilityUse.isDown();
        boolean isSecondaryCurrentlyPressed = ModKeybindings.INSTANCE.secondaryAbilityUse.consumeClick();

        assert player != null;

        if (minecraft.screen != null) {return;}
        if (!player.hasItemInSlot(EquipmentSlot.HEAD)) {return;}
        if (!AbilityClass.class.isAssignableFrom(player.getItemBySlot(EquipmentSlot.HEAD).getItem().getClass())){return;}
        AbilityClass currentAbility = (AbilityClass) player.getItemBySlot(EquipmentSlot.HEAD).getItem();

        if (isPrimaryCurrentlyPressed && currentAbility.PrimaryCharges){ holdTimePrimary++; PrimaryAbilityOnce.reset();
            if ((holdTimePrimary <= stageOneTickLength) && (holdTimePrimary != 0)) {PrimaryOnce0.run(() -> player.displayClientMessage(Component.literal("§0_ _ _"), true)); PrimaryStage = 0;}
            if ((holdTimePrimary >= stageOneTickLength) && (holdTimePrimary < stageTwoTickLength)){ PrimaryOnce1.run(() -> {
                    currentAbility.PrimaryChargeAnimation(player);
                    player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_1.get(), SoundSource.NEUTRAL, 1, 1, false);
                    player.displayClientMessage(Component.literal("§1● _ _"), true);
                    PrimaryStage = 1;
                }); }
            if ((holdTimePrimary >= stageTwoTickLength) && (holdTimePrimary < stageThreeTickLength)){ PrimaryOnce2.run(() -> {
                    player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_2.get(), SoundSource.NEUTRAL, 1, 1, false);
                    player.displayClientMessage(Component.literal("§3● ● _"), true);
                    PrimaryStage = 2;
                }); }
            if (holdTimePrimary >= stageThreeTickLength){ PrimaryOnce3.run(() -> {
                    player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_3.get(), SoundSource.NEUTRAL, 1, 1, false);
                    player.displayClientMessage(Component.literal("§b● ● ●"), true);
                    PrimaryStage = 3;
                }); }
        }
        if (isPrimaryCurrentlyPressed && !currentAbility.PrimaryCharges) {ModMessages.sendToServer(new PrimaryAbilityC2SPacket());}
        if (!isPrimaryCurrentlyHeld){
            PrimaryAbilityOnce.run(() -> ModMessages.sendToServer(new PrimaryAbilityC2SPacket()));

            holdTimePrimary = 0;
            PrimaryOnce0.reset(); PrimaryOnce1.reset(); PrimaryOnce2.reset(); PrimaryOnce3.reset();
        }

        if (isSecondaryCurrentlyPressed && currentAbility.SecondaryCharges){ holdTimeSecondary++; SecondaryAbilityOnce.reset();
            if ((holdTimeSecondary <= stageOneTickLength) && (holdTimeSecondary != 0)) {SecondaryOnce0.run(() -> player.displayClientMessage(Component.literal("§0_ _ _"), true)); SecondaryStage = 0;}
            if ((holdTimeSecondary >= stageOneTickLength) && (holdTimeSecondary < stageTwoTickLength)){ SecondaryOnce1.run(() -> {
                currentAbility.SecondaryChargeAnimation(player);
                player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_1.get(), SoundSource.NEUTRAL, 1, 1, false);
                player.displayClientMessage(Component.literal("§4● _ _"), true);
                SecondaryStage = 1;
            }); }
            if ((holdTimeSecondary >= stageTwoTickLength) && (holdTimeSecondary < stageThreeTickLength)){ SecondaryOnce2.run(() -> {
                player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_2.get(), SoundSource.NEUTRAL, 1, 1, false);
                player.displayClientMessage(Component.literal("§6● ● _"), true);
                SecondaryStage = 2;
            }); }
            if (holdTimeSecondary >= stageThreeTickLength){ SecondaryOnce3.run(() -> {
                player.level().playLocalSound(player.getX(), player.getY(), player.getZ(), ModSounds.ABILITY_CHARGE_3.get(), SoundSource.NEUTRAL, 1, 1, false);
                player.displayClientMessage(Component.literal("§e● ● ●"), true);
                SecondaryStage = 3;
            }); }
        }
        if (isSecondaryCurrentlyPressed && !currentAbility.SecondaryCharges) {ModMessages.sendToServer(new SecondaryAbilityC2SPacket());}
        if (!isSecondaryCurrentlyHeld){
            SecondaryAbilityOnce.run(() -> ModMessages.sendToServer(new SecondaryAbilityC2SPacket()));

            holdTimeSecondary = 0;
            SecondaryOnce0.reset(); SecondaryOnce1.reset(); SecondaryOnce2.reset(); SecondaryOnce3.reset();
        }
    }
}
