package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.JetAbilityRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
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

    @Override
    public boolean PrimaryAbility(ClientLevel level, AbstractClientPlayer player){
        if (amountPressed <= 3) {
            if (holdTimePrimary <= 10) {
                if (player.getDirection() == Direction.NORTH) {
                    player.addDeltaMovement(new Vec3(0, 0.5, -1));
                } else if (player.getDirection() == Direction.SOUTH) {
                    player.addDeltaMovement(new Vec3(0, 0.5, 1));
                } else if (player.getDirection() == Direction.EAST) {
                    player.addDeltaMovement(new Vec3(1, 0.5, 0));
                } else if (player.getDirection() == Direction.WEST) {
                    player.addDeltaMovement(new Vec3(-1, 0.5, 0));
                }
                playerAnimationPlay(player, "jetdashmove");
                level.addParticle(ParticleTypes.FLAME, player.getX(), player.getY() + 1, player.getZ(), 0, 0, 0);
                level.addParticle(ParticleTypes.FLAME, player.getX() + 1, player.getY() + 1, player.getZ(), 0, 0, 0);
                level.addParticle(ParticleTypes.FLAME, player.getX() - 1, player.getY() + 1, player.getZ(), 0, 0, 0);
                level.addParticle(ParticleTypes.FLAME, player.getX(), player.getY() + 1, player.getZ() + 1, 0, 0, 0);
            }
        }
        if (amountPressed > 3){
            if (holdTimePrimary >= 50) {
                amountPressed = 0;
            }
        }
        return true;
    }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player){
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 10, 3, false, false));
        level.sendParticles(ParticleTypes.FLAME,
                player.getX() + 0, player.getY() + 0, player.getZ() + 0,
                5, 0, -0.3, 0, 0.4);
        return true;
    }
}
