package com.gmail.jamal009a.kirbymodremorphed.entity.custom;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.abstractclasses.AnimatedMob;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageSources;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.Animation;
import software.bernie.geckolib.core.animation.RawAnimation;

public class JambelieverEntity extends AnimatedMob {

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);


    public JambelieverEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel, false, 3);
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 7.000000D)
                .add(Attributes.ATTACK_DAMAGE, 2f)
                .add(Attributes.ATTACK_SPEED, 1f)
                .add(Attributes.MOVEMENT_SPEED, 0.200000f).build();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1,  new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new FloatGoal(this));
        this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));


        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.0D, false));
        this.goalSelector.addGoal(5, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, Player.class, true));
    
    }



    public final RawAnimation land = RawAnimation.begin().then("land", Animation.LoopType.PLAY_ONCE);

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        super.registerControllers(controllerRegistrar);
        MainAnimationController.triggerableAnim("land", land);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        triggerAnim("Main", "land");
        return false;
    }


    @Override
    public void swing(InteractionHand pHand) {
        hurt(this.damageSources().generic(), 1);
        super.swing(pHand);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}

}
