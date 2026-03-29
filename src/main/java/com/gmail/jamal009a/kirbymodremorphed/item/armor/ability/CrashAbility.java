package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CrashAbilityRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
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

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.holdTimePrimary;

public class CrashAbility extends AbilityClass implements GeoItem {
    public CrashAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "§5";

        HasPrimary = true;
        PrimaryCharges = true;
        HasSecondary = false;
        SecondaryCharges = false;
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

    public void CrashOut(ServerLevel level, ServerPlayer player, float power){
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "crashexplode");
        level.explode(player, player.getX(), player.getY(), player.getZ(), 5*power, Level.ExplosionInteraction.MOB);
        player.setItemSlot(EquipmentSlot.HEAD, ItemStack.EMPTY);
    }

    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "crashcharge");
        if (stage == 1){CrashOut(level, player, 1);}
        if (stage == 2){CrashOut(level, player, 2);}
        if (stage == 3){CrashOut(level, player, 4);}
        return true;
    }

    @Override
    public void ChargeAnimation(AbstractClientPlayer player){ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "crashcharge");}
}
