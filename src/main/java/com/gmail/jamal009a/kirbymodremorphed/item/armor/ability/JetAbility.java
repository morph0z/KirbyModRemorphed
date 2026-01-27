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
        HasSecondary = true;
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

    float primaryLaunchPower = 1;

    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage) {
        System.out.println(holdTimePrimary);
        if (stage == 1){
            LocalPlayer ClientPlayer = Minecraft.getInstance().player;
            if (player.getDirection() == Direction.NORTH) {
                ClientPlayer.addDeltaMovement(new Vec3(0, primaryLaunchPower/10, -primaryLaunchPower/5));
            } else if (player.getDirection() == Direction.SOUTH) {
                ClientPlayer.addDeltaMovement(new Vec3(0, primaryLaunchPower/10, primaryLaunchPower/5));
            } else if (player.getDirection() == Direction.EAST) {
                ClientPlayer.addDeltaMovement(new Vec3(primaryLaunchPower/5, primaryLaunchPower/10, 0));
            } else if (player.getDirection() == Direction.WEST) {
                ClientPlayer.addDeltaMovement(new Vec3(-primaryLaunchPower/5, primaryLaunchPower/10, 0));
            }
            level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1, 1, false);
            ClientPlayer.playSound(SoundEvents.FIRECHARGE_USE, 1, 1);
        }


//        if ((holdTimePrimary <= 1) && (amountPrimaryPressed <= 2)) {
//            amountPrimaryPressed ++;
//            LocalPlayer ClientPlayer = Minecraft.getInstance().player;
//            if (player.getDirection() == Direction.NORTH) {
//                ClientPlayer.addDeltaMovement(new Vec3(0, 0.5, -1));
//            } else if (player.getDirection() == Direction.SOUTH) {
//                ClientPlayer.addDeltaMovement(new Vec3(0, 0.5, 1));
//            } else if (player.getDirection() == Direction.EAST) {
//                ClientPlayer.addDeltaMovement(new Vec3(1, 0.5, 0));
//            } else if (player.getDirection() == Direction.WEST) {
//                ClientPlayer.addDeltaMovement(new Vec3(-1, 0.5, 0));
//            }
//            level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1, 1, false);
//            ClientPlayer.playSound(SoundEvents.FIRECHARGE_USE, 1, 1);
//
//            playerAnimationPlay(ClientPlayer, "jetdashmove");
//            level.sendParticles(player, ParticleTypes.FLAME, false, player.getX(), player.getY(), player.getZ(), 40, 0, 0, 0, 1);
//        } else if (amountPrimaryPressed > 2) {
//            LocalPlayer ClientPlayer = Minecraft.getInstance().player;
//            if (holdTimePrimary > 20){
//                level.playLocalSound(player.getX(), player.getY(), player.getZ(), SoundEvents.FIRECHARGE_USE, SoundSource.PLAYERS, 1, 1, false);
//                ClientPlayer.playSound(SoundEvents.FIRE_EXTINGUISH, 1, 1);
//                amountPrimaryPressed = 0;
//            }
//        }
        return true;
    }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player){
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "jetfly");
        player.addDeltaMovement(new Vec3(0, 1.5,0));
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 3, false, false));
        level.sendParticles(ParticleTypes.FLAME,
                player.getX() + 0, player.getY() + 0, player.getZ() + 0,
                5, 0, -0.3, 0, 0.4);
        return true;
    }
}
