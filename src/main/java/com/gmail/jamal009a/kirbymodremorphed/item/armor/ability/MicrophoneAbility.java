package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.MicrophoneAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.*;

public class MicrophoneAbility extends AbilityClass implements GeoItem {
    public MicrophoneAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "\u00A75";

        HasPrimary = true;
        HasSecondary = false;
        HasPassive = false;

        PrimaryName = "Microphone Shout";
        SecondaryName = "";
        PassiveName = "";

        HasFallingAnimation = true;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new MicrophoneAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    //Todo: always uses the third blast FIX
    public void CrashOut(ServerLevel level, LocalPlayer ClientPlayer, ServerPlayer player, float power){
        playerAnimationPlay(Minecraft.getInstance().player, "micshout");
        level.explode(player, player.getX(), player.getY(), player.getZ(), 5*power, Level.ExplosionInteraction.MOB);
        if (amountPrimaryPressed == 1) {
            ClientPlayer.playSound(ModSounds.MIC_SHOUT_1.get(), 1, 1);
        } else if (amountPrimaryPressed == 2) {
            ClientPlayer.playSound(ModSounds.MIC_SHOUT_2.get(), 1, 1);
        } else if (amountPrimaryPressed == 3) {
            ClientPlayer.playSound(ModSounds.MIC_SHOUT_3.get(), 1, 1);
            player.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
            amountPrimaryPressed = 0;
        }
    }

    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;
        if (stage == 1) {amountPrimaryPressed++; CrashOut(level, ClientPlayer, player, 1);}
        if (stage == 2){amountPrimaryPressed++; CrashOut(level, ClientPlayer, player, 2);}
        if (stage == 3){amountPrimaryPressed++; CrashOut(level, ClientPlayer, player, 3);}
        return true;
    }
}
