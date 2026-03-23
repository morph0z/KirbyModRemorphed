package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class BeamWaveProjectileEntity extends AbstractAbilityProjectile implements GeoEntity {

    LivingEntity shooter;

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public BeamWaveProjectileEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public BeamWaveProjectileEntity(EntityType<? extends AbstractAbilityProjectile> pEntityType, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        super(pEntityType, pShooter, pOffsetX, pOffsetY, pOffsetZ, pLevel);
        shooter = pShooter;
    }

    public BeamWaveProjectileEntity(EntityType<? extends AbstractAbilityProjectile> type, Level worldIn, double x, double y, double z) {
        super(type, worldIn, x, y, z);
    }

    public BeamWaveProjectileEntity(LivingEntity pShooter, Level pLevel, double pOffsetX, double pOffsetY, double pOffsetZ) {
        super(ModEntities.BEAM_WAVE_PROJECTILE.get(), pShooter.getX(), pShooter.getY(), pShooter.getZ(), pOffsetX, pOffsetY, pOffsetZ, pLevel);
        this.setOwner(pShooter);
        shooter = pShooter;
    }

    public BeamWaveProjectileEntity(EntityType<? extends AbstractAbilityProjectile> pEntityType, double pX, double pY, double pZ, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        super(pEntityType, pX, pY, pZ, pOffsetX, pOffsetY, pOffsetZ, pLevel);
    }

    int deleteTimer = 0;
    int deleteTimerEnd = 20;
    @Override
    public void tick() {
        super.tick();

        deleteTimer++;
        if (!this.level().isClientSide) {
            if (deleteTimer >= deleteTimerEnd) {this.discard();}
        }

        if (shooter == null) {return;}
        //System.out.println(shooter.yHeadRot);
        setPos(shooter.position());
        setRotation(45, shooter.getXRot());
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
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}
}
