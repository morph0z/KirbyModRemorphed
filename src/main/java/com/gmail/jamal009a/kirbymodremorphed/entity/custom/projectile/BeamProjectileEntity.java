package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class BeamProjectileEntity extends AbstractAbilityProjectile implements GeoEntity {

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    float DamageMultiplier;
    Vec3 Position = new Vec3(0,0,0);

    public BeamProjectileEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public BeamProjectileEntity(LivingEntity pShooter, Level pLevel, Vec3 Position, int damage) {
        this(ModEntities.BEAM_WAVE_PROJECTILE.get(), Position, pLevel, damage);
        this.setOwner(pShooter);
    }

    public BeamProjectileEntity(EntityType<? extends AbstractAbilityProjectile> pEntityType, Vec3 pos, Level pLevel, int damage) {
        super(pEntityType, pLevel);
        this.DamageMultiplier = damage;
        this.Position = pos;
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {

    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.beammodel.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}

}
