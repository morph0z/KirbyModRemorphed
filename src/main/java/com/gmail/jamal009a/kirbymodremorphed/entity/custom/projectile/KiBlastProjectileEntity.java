package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import com.gmail.jamal009a.kirbymodremorphed.util.MethodRunOnce;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
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

    public double xPower;
    public double yPower;
    public double zPower;

    public KiBlastProjectileEntity(EntityType<KiBlastProjectileEntity> pEntityType, Level pLevel) {super(pEntityType, pLevel);}

    float DamageMultiplier;
    public KiBlastProjectileEntity(EntityType<KiBlastProjectileEntity> pEntityType, Vec3 pos, double dirX, double dirY, double dirZ, Level pLevel, float Damage) {
        super(pEntityType, pLevel);
        this.DamageMultiplier = Damage;

        this.moveTo(pos.x, pos.y, pos.z, this.getYRot(), this.getXRot());
        this.reapplyPosition();
        double d0 = Math.sqrt(dirX * dirX + dirY * dirY + dirZ * dirZ);
        if (d0 != (double)0.0F) {
            this.xPower = dirX / d0 * 0.1;
            this.yPower = dirY / d0 * 0.1;
            this.zPower = dirZ / d0 * 0.1;
        }
    }

    public KiBlastProjectileEntity(Vec3 pos, double dirX, double dirY, double dirZ, Level pLevel, float Damage){
        this(ModEntities.KI_BLAST_PROJECTILE.get(), pos , dirX, dirY, dirZ, pLevel, Damage);
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {

        Entity target = result.getEntity();
        Entity owner = this.getOwner();

        DamageSource source = this.damageSources().indirectMagic(this, owner);

        float damage = 4.0F * DamageMultiplier; // your damage value here

        target.hurt(source, damage);
    }

    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {this.discard();}
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


    MethodRunOnce setRotOnce = new MethodRunOnce();
    public void tick() {
        Entity shooter = this.getOwner();
        setRotOnce.run(() -> {if (shooter != null){setRotation(shooter.getXRot(), shooter.getYHeadRot());}});
        if (this.level().isClientSide || (shooter == null || !shooter.isRemoved()) && this.level().hasChunkAt(this.blockPosition())) {
            super.tick();

            HitResult hitresult = ProjectileUtil.getHitResultOnMoveVector(this, this::canHitEntity);
            if (hitresult.getType() != HitResult.Type.MISS && !net.minecraftforge.event.ForgeEventFactory.onProjectileImpact(this, hitresult)) {this.onHit(hitresult);}

            this.checkInsideBlocks();
            Vec3 velocity = this.getDeltaMovement();
            double OffsetX = this.getX() + velocity.x;
            double OffsetY = this.getY() + velocity.y;
            double OffsetZ = this.getZ() + velocity.z;
            
            float inertia = this.getInertia();
            if (this.isInWater()) {
                for(int i = 0; i < 4; ++i) {
                    float f1 = 0.25F;
                    this.level().addParticle(ParticleTypes.BUBBLE,
                            OffsetX - velocity.x * 0.25D,
                            OffsetY - velocity.y * 0.25D,
                            OffsetZ - velocity.z * 0.25D,
                            velocity.x, velocity.y, velocity.z);
                }

                inertia = 0.8F;
            }

            this.setDeltaMovement(velocity.add(this.xPower, this.yPower, this.zPower).scale(inertia));
            this.level().addParticle(this.getTrailParticle(), OffsetX, OffsetY + 0.5D, OffsetZ, 0.0D, 0.0D, 0.0D);
            this.setPos(OffsetX, OffsetY, OffsetZ);
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
