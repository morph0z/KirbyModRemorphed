package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CrashAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.MicrophoneAbilityRenderer;
import com.mojang.blaze3d.shaders.Effect;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.EffectInstance;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

public class CrashAbility extends AbilityClass implements GeoItem {
    public CrashAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "\u00A75";

        HasPrimary = true;
        HasSecondary = false;
        HasPassive = false;

        PrimaryName = "Explode";
        SecondaryName = "";
        PassiveName = "";

        HasFallingAnimation = false;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new CrashAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public boolean PrimaryAbility(ClientLevel level, AbstractClientPlayer player){
        int ChargeTime = 380;
        if (ClientForgeHandler.holdTimePrimary < ChargeTime) {
            player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 1, 0, true, false, false));
            ClientForgeHandler.playerAnimationPlay(player, "crashcharge");
        }
        if (ClientForgeHandler.holdTimePrimary >= ChargeTime) {
            level.explode(player, player.getX(), player.getY(), player.getZ(), 30, Level.ExplosionInteraction.NONE);
            ClientForgeHandler.playerAnimationPlay(player, "crashexplode");
            player.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
        }
        return true;
    }
}
