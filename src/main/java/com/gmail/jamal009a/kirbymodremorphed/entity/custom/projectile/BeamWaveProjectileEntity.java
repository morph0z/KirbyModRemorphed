package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class BeamWaveProjectileEntity extends AbstractAbilityProjectile implements GeoEntity {

    float DamageMultiplier;
    Vec3 Position = new Vec3(0,0,0);
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public BeamWaveProjectileEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public BeamWaveProjectileEntity(LivingEntity pShooter, Level pLevel, Vec3 Position, int damage) {
        this(ModEntities.BEAM_WAVE_PROJECTILE.get(), Position, pLevel, damage);
        this.setOwner(pShooter);
    }

    public BeamWaveProjectileEntity(EntityType<? extends AbstractAbilityProjectile> pEntityType, Vec3 pos, Level pLevel, int damage) {
        super(pEntityType, pLevel);
        this.DamageMultiplier = damage;
        this.Position = pos;
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
        setPos(Position);
    }


    @Override
    protected void onHitEntity(EntityHitResult result) {
        Entity target = result.getEntity();
        Entity owner = this.getOwner();

        DamageSource source = this.damageSources().indirectMagic(this, owner);

        float damage = 4.0F * DamageMultiplier;; // your damage value here

        target.hurt(source, damage);
    }

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
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}
}
