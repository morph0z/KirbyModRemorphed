package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamWaveProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.BeamAbilityRenderer;
import com.google.common.collect.Iterables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

public class BeamAbility extends AbilityClass implements GeoItem {
    public BeamAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pType, pProperties);
        TextColor = "§6";

        PrimaryCharges = true;
        SecondaryCharges = true;

        PrimaryName = "Wave Beam";
        SecondaryName = "Beam Blast";
        PassiveName = "Speed";

        HasFallingAnimation = false;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new BeamAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    public void createWaveAttack(ServerLevel level, ServerPlayer player, int power){
        BeamWaveProjectileEntity beamWave = new BeamWaveProjectileEntity(player, level, power);
        level.addFreshEntity(beamWave);
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "wandwave");
    }

    public void createBeamAttack(ServerLevel level, ServerPlayer player, int power){
        Vec3 playerLookDirection = player.getLookAngle();
        Vec3 playerPos = new Vec3(player.getX(), player.getY(), player.getZ());

        double lookX = playerLookDirection.x;
        double lookY = playerLookDirection.y;
        double lookZ = playerLookDirection.z;

        BeamProjectileEntity beam = new BeamProjectileEntity(playerPos, lookX, lookY, lookZ, level, power);
        beam.setPosRaw(player.getX() + lookX * 1.5, player.getEyeY() - 0.2, player.getZ() + lookZ * 1.5);
        level.addFreshEntity(beam);
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "wandwave");
    }

    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        if (stage == 1){createWaveAttack(level, player, 1);}
        if (stage == 2){createWaveAttack(level, player, 2);}
        if (stage == 3){createWaveAttack(level, player, 3);}
        return true;
    }

    public boolean SecondaryAbility(ServerLevel  level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        if (stage == 1){createBeamAttack(level, player, 1);}
        if (stage == 2){createBeamAttack(level, player, 2);}
        if (stage == 3){createBeamAttack(level, player, 3);}
        return true;
    }

    @Override
    public boolean PassiveAbility(Level level, Entity entity, ItemStack stack, boolean check) {
        if(check){return true;}
        if (entity instanceof Player player && Iterables.contains(entity.getArmorSlots(), stack)) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SPEED,
                    1,
                    0,
                    true,
                    false));
        }
        return true;
    }

    @Override
    public void ChargeAnimation(AbstractClientPlayer player){ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "wandcharge");}

}
