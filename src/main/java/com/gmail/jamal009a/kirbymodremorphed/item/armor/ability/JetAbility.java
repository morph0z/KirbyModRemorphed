package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.JetAbilityRenderer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

import static com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler.*;

public class JetAbility extends AbilityClass implements GeoItem {
    public JetAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "\u00A71";

        HasPrimary = true;
        PrimaryCharges = true;
        HasSecondary = true;
        SecondaryCharges = true;
        HasPassive = false;

        PrimaryName = "Jet Dash";
        SecondaryName = "Rocket Fly";
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
                    this.renderer = new JetAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    public void JetDash(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        if (player.getDirection() == Direction.NORTH) {
            ClientPlayer.addDeltaMovement(new Vec3(0, power/5, -power));
        } else if (player.getDirection() == Direction.SOUTH) {
            ClientPlayer.addDeltaMovement(new Vec3(0, power/5, power));
        } else if (player.getDirection() == Direction.EAST) {
            ClientPlayer.addDeltaMovement(new Vec3(power, power/5, 0));
        } else if (player.getDirection() == Direction.WEST) {
            ClientPlayer.addDeltaMovement(new Vec3(-power, power/5, 0));
        }
        level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1, 1, false);
        ClientPlayer.playSound(SoundEvents.FIRECHARGE_USE, 1, 1);
        level.sendParticles(ParticleTypes.FLAME,
                player.getX() + 0, player.getY() + 0, player.getZ() + 0,
                Math.round(5*power), 0, -0.3, 0, 0.4);
    }
    public void JetFly(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        ClientPlayer.addDeltaMovement(new Vec3(0, power,0));
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int) ((power+1)*10), 3, false, false));
        level.sendParticles(ParticleTypes.FLAME,
                player.getX() + 0, player.getY() + 0, player.getZ() + 0,
                Math.round(5*power), 0, -0.3, 0, 0.4);
    }

    float primaryLaunchPower = 2;
    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage) {
        if (stage == 0){return true;}
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "jetdash");
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;

        if (stage == 1){JetDash(ClientPlayer, player, level, primaryLaunchPower/5);}
        if (stage == 2){JetDash(ClientPlayer, player, level, primaryLaunchPower/2);}
        if (stage == 3){JetDash(ClientPlayer, player, level, (float) (primaryLaunchPower * 1.5));}
        return true;
    }

    float secondaryLaunchPower = 5;
    @Override
    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "jetfly");
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;
        assert ClientPlayer != null;
        System.out.println("YO" + "| sec stage: " + stage);
        if (stage == 1){JetFly(ClientPlayer, player, level, 0);}
        if (stage == 2){JetFly(ClientPlayer, player, level, secondaryLaunchPower);}
        if (stage == 3){JetFly(ClientPlayer, player, level, (float) (secondaryLaunchPower * 1.5));}
        return true;
    }
}
