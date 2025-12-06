package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.MicrophoneAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
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

    @Override
    public boolean PrimaryAbility(ClientLevel level, AbstractClientPlayer player){
        if (amountPressed <= 3) {
            level.explode(player, player.getX(), player.getY(), player.getZ(), 10, Level.ExplosionInteraction.MOB);
            playerAnimationPlay(player, "micshout");
            if (amountPressed == 1){
                player.playSound(ModSounds.MIC_SHOUT_1.get());
            } else if (amountPressed == 2) {
                player.playSound(ModSounds.MIC_SHOUT_2.get());
            } else if (amountPressed == 3) {
                player.playSound(ModSounds.MIC_SHOUT_3.get());
            }
        }else if (amountPressed < 3){
            //add shout animation
            player.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
            amountPressed = 0;
        }
        return true;
    }
}
