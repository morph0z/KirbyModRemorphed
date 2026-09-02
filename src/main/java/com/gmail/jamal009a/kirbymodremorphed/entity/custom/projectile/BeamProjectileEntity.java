package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.abstractclasses.AbstractMovingAbilityProjectile;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Pose;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;


public class BeamProjectileEntity extends AbstractMovingAbilityProjectile implements GeoEntity {
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public BeamProjectileEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {super(pEntityType, pLevel);}
    public BeamProjectileEntity(Vec3 pos, double dirX, double dirY, double dirZ, Level pLevel, float Damage){
        super(ModEntities.BEAM_PROJECTILE.get(), pos , dirX, dirY, dirZ, pLevel, Damage);
    }

    @Override
    protected ParticleOptions getTrailParticle() {return ParticleTypes.FLASH;}

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));
    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.beammodel.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    private float size = 0.5F;
    @Override
    public void tick() {
        super.tick();
        this.size += 0.02F;
        this.refreshDimensions();
    }

    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {
        return EntityDimensions.scalable(size, size);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}


}
