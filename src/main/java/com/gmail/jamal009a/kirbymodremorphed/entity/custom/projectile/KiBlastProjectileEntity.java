package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.ForgeEventFactory;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class KiBlastProjectileEntity extends AbstractAbilityProjectile implements GeoEntity {
    private static final EntityDataAccessor<Boolean> DATA_DANGEROUS = null;

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);


    public KiBlastProjectileEntity(EntityType<KiBlastProjectileEntity> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public KiBlastProjectileEntity(LivingEntity pShooter, Level pLevel, double pOffsetX, double pOffsetY, double pOffsetZ) {
        super(ModEntities.KI_BLAST_PROJECTILE.get(), pShooter.getX(), pShooter.getY(), pShooter.getZ(), pOffsetX, pOffsetY, pOffsetZ, pLevel);
        this.setOwner(pShooter);
        this.setRot(pShooter.getYRot(), pShooter.getXRot());
    }

    public KiBlastProjectileEntity(Level level) {
        super(ModEntities.KI_BLAST_PROJECTILE.get(), level);
    }


    @Override
    protected void onHitEntity(EntityHitResult result) {

        Entity target = result.getEntity();
        Entity owner = this.getOwner();

        DamageSource source = this.damageSources().indirectMagic(this, owner);

        float damage = 8.0F; // your damage value here

        target.hurt(source, damage);
    }

    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {

            this.discard();
        }
    }

    @Override
    protected void defineSynchedData() {

    }

    protected boolean shouldBurn() {
        return false;
    }

    public boolean isOnFire() {
        return false;
    }

    public void setDangerous(boolean pInvulnerable) {
        this.entityData.set(DATA_DANGEROUS, pInvulnerable);
    }

    public boolean isDangerous() {
        return (Boolean)this.entityData.get(DATA_DANGEROUS);
    }

    protected ParticleOptions getTrailParticle() {
        return ParticleTypes.SOUL_FIRE_FLAME;
    }

    protected float getInertia() {
        return 0.95F;
    }

    public void tick() {
        Entity shooter = this.getOwner();
        if (this.level().isClientSide || (shooter == null || !shooter.isRemoved()) && this.level().hasChunkAt(this.blockPosition())) {
            super.tick();

            HitResult hitresult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
            if (hitresult.getType() != HitResult.Type.MISS && !ForgeEventFactory.onProjectileImpact(this, hitresult)) {
                this.onHit(hitresult);
            }

            float f = this.getInertia();

            this.checkInsideBlocks();
            Vec3 deltaMovement = this.getDeltaMovement();
            this.setDeltaMovement(deltaMovement.add(this.xPower, this.yPower, this.zPower).scale((double)f));

            Vec3 motion = this.getDeltaMovement();

            if (motion.lengthSqr() > 0.0000001) {
                float yaw = (float)(
                        Math.atan2(motion.z, motion.x) * (180F / Math.PI)
                ) - 90F;

                float pitch = (float)(
                        Math.atan2(
                                motion.y,
                                Math.sqrt(motion.x * motion.x + motion.z * motion.z)
                        ) * (180F / Math.PI)
                );

                // This is the important part
                this.setRot(yaw, pitch);

                // Sync old rotations so rendering interpolation works
                this.yRotO = yaw;
                this.xRotO = pitch;
            }

            double d0 = this.getX() + deltaMovement.x;
            double d1 = this.getY() + deltaMovement.y;
            double d2 = this.getZ() + deltaMovement.z;

            if (this.isInWater()) {
                for(int i = 0; i < 4; ++i) {
                    this.level().addParticle(ParticleTypes.BUBBLE, d0 - deltaMovement.x * (double)0.25F,
                                                d1 - deltaMovement.y * (double)0.25F,
                                                d2 - deltaMovement.z * (double)0.25F,
                                                deltaMovement.x, deltaMovement.y, deltaMovement.z);
                }

                f = 0.8F;
            }


            this.level().addParticle(this.getTrailParticle(), d0, d1 + 0.25, d2, (double)0.0F, (double)0.0F, (double)0.0F);
            this.setPos(d0, d1, d2);
        } else {
            this.discard();
        }

    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.kiblastmodel.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}
}
