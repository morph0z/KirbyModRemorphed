package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.abstractclasses.AbstractAbilityProjectile;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.*;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.PlayState;

import java.util.List;

public class BeamWaveProjectileEntity extends AbstractAbilityProjectile implements GeoEntity {

    float DamageMultiplier;
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public BeamWaveProjectileEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.refreshDimensions();
    }

    public BeamWaveProjectileEntity(LivingEntity pShooter, Level pLevel, int damage) {
        this(ModEntities.BEAM_WAVE_PROJECTILE.get(), pLevel);
        this.DamageMultiplier = damage;
        this.setOwner(pShooter);
    }

    int deleteTimer = 0;
    int deleteTimerEnd = 20;
    @Override
    public void tick() {
        super.tick();

        Entity shooter = this.getOwner();
        if (shooter != null){setRotation(0, shooter.getYHeadRot());}

        deleteTimer++;
        if (!this.level().isClientSide) {if (deleteTimer >= deleteTimerEnd) {this.discard();}}
        if (shooter == null) {return;}
        this.setPos(new Vec3(shooter.getEyePosition().x, shooter.getEyePosition().y-0.5, shooter.getEyePosition().z));

        AABB box = this.getBoundingBox();

        List<Entity> hits = this.level().getEntities(this, box, e -> e != this.getOwner());

        for (Entity target : hits) {
            if (!this.level().isClientSide) {
                target.hurt(
                        this.damageSources().indirectMagic(this, this.getOwner()),
                        4.0F * DamageMultiplier
                );
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {}

    @Override
    protected void defineSynchedData() {}

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.beamwavemodel.idle", Animation.LoopType.HOLD_ON_LAST_FRAME));
        return PlayState.CONTINUE;
    }

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {
        return EntityDimensions.scalable(2F, 2F);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}
}
