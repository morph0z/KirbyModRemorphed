package com.gmail.jamal009a.kirbymodremorphed.entity.custom.waddledee;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AnimatedMob;
import com.gmail.jamal009a.kirbymodremorphed.sound.ModSounds;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
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

public class WaddleDeeEntity extends AnimatedMob {

    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public WaddleDeeEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel, false, 5);
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 5D)
                .add(Attributes.ATTACK_DAMAGE, 0f)
                .add(Attributes.ATTACK_SPEED, 1.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.2f).build();
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1,  new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(2, new FloatGoal(this));
    }

    public final RawAnimation land = RawAnimation.begin().then("land", Animation.LoopType.PLAY_ONCE);

    public final RawAnimation wave = RawAnimation.begin().then("wave", Animation.LoopType.PLAY_ONCE);
    public final RawAnimation cheer = RawAnimation.begin().then("cheer", Animation.LoopType.PLAY_ONCE);

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        super.registerControllers(controllerRegistrar);
        MainAnimationController.triggerableAnim("wave", wave);
        MainAnimationController.triggerableAnim("cheer", cheer);
        MainAnimationController.triggerableAnim("land", land);
    }

    public @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        //Give parasol to waddle dee
        //ItemStack itemstack = pPlayer.getItemInHand(pHand);
        //if (itemstack.is(Items.BUCKET)) {
        //return InteractionResult.sidedSuccess(this.level().isClientSide);
        //} else {

        if (this.getRandom().nextFloat() < 0.5F) triggerAnim("Main", "wave");
        else triggerAnim("Main", "cheer");

        playSound(ModSounds.WADDLE_DEE_PASSIVE_4.get());

        return super.mobInteract(pPlayer, pHand);
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        triggerAnim("Main", "land");
        return false;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        int rand = random.nextIntBetweenInclusive(0,4);

        if (rand == 0) return ModSounds.WADDLE_DEE_PASSIVE_1.get();
        else if (rand == 1) return ModSounds.WADDLE_DEE_PASSIVE_2.get();
        else if (rand == 2) return ModSounds.WADDLE_DEE_PASSIVE_3.get();
        else if (rand == 3) return ModSounds.WADDLE_DEE_PASSIVE_4.get();
        else if (rand == 4) return ModSounds.WADDLE_DEE_PASSIVE_5.get();

        return null;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}
}
