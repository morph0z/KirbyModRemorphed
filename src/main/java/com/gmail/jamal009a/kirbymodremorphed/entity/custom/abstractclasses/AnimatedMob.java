package com.gmail.jamal009a.kirbymodremorphed.entity.custom.abstractclasses;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;

public class AnimatedMob extends Animal implements GeoEntity {

    boolean extraAnimations = false;

    public final static RawAnimation walk = RawAnimation.begin().thenLoop("run");
    public final static RawAnimation idle = RawAnimation.begin().thenLoop("idle");
    public final static RawAnimation fly = RawAnimation.begin().thenLoop("fly");
    public final static RawAnimation swim = RawAnimation.begin().thenLoop("swim");

    public final static RawAnimation hurt = RawAnimation.begin().thenPlay("hit");
    public final static RawAnimation special = RawAnimation.begin().thenPlay("special");
    public final static RawAnimation death = RawAnimation.begin().thenPlayAndHold("death");



    public AnimationController<AnimatedMob> MainAnimationController = new AnimationController<>(this, "Main", state -> {
        if (state.getController().isPlayingTriggeredAnimation() ||
                state.isCurrentAnimation(death))
        {return null;}
        else {
            if (state.isMoving() && this.onGround()) {return state.setAndContinue(walk);}
            else if ((this.isSwimming() || this.isInWater()) && extraAnimations){return state.setAndContinue(swim);}
            else if ((!this.onGround())) {return state.setAndContinue(fly);}

            if (this instanceof KirbyEntity){if (((KirbyEntity) this).isInSittingPose()) return state.setAndContinue(((KirbyEntity) this).sitting);}

            return state.setAndContinue(idle);
        }
    });

    protected AnimatedMob(EntityType<? extends Animal> pEntityType, Level pLevel, boolean needsExtraAnimations, int animationTransitionTime) {
        super(pEntityType, pLevel);
        this.extraAnimations = needsExtraAnimations;
        this.MainAnimationController.transitionLength(animationTransitionTime);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        MainAnimationController.triggerableAnim("special", special);
        MainAnimationController.triggerableAnim("hurt", hurt);
        MainAnimationController.triggerableAnim("death", death);

        controllerRegistrar.add(MainAnimationController);
    }

    @Override
    protected void actuallyHurt(@NotNull DamageSource pDamageSource, float pDamageAmount) {
        if (deathAnimationStarted && extraAnimations) return;
        if (extraAnimations) triggerAnim("Main", "hurt");
        super.actuallyHurt(pDamageSource, pDamageAmount);
    }

    boolean deathAnimationStarted = false;
    @Override
    public void die(@NotNull DamageSource pDamageSource) {
        if (deathAnimationStarted || !extraAnimations) return;

        deathAnimationStarted = true;
        setDeltaMovement(0,-3,0);
        triggerAnim("Main", "death");
        setHealth(1.0F);
    }

    int deathTicks = 0;
    @Override
    public void tick() {
        super.tick();

        if (!deathAnimationStarted) return;
        deathTicks++;

        lerpMotion(0,0,0);
        setNoAi(true);
        setInvulnerable(true);

        if ((!(deathTicks >= 60)) && extraAnimations) return;

        if (level() instanceof ServerLevel)
            ((ServerLevel)level()).sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE, getX(),getY(),getZ(),20
                    ,0,0,0,0.1);
        discard();
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return null;}

    @Override
    public @Nullable AgeableMob getBreedOffspring(@NotNull ServerLevel pLevel, @NotNull AgeableMob pOtherParent) {return null;}
}
