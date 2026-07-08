package com.gmail.jamal009a.kirbymodremorphed.entity.custom.kirby;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AnimatedMob;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals.*;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.players.OldUsersConverter;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.animal.Wolf;
import net.minecraft.world.entity.animal.horse.AbstractHorse;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Ghast;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;

import javax.annotation.Nullable;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public class KirbyEntity extends AnimatedMob implements OwnableEntity {

    public boolean suckTexture = false;
    private final AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);

    public  KirbyEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    public static AttributeSupplier setAttributes() {
        return Animal.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 16D)
                .add(Attributes.ATTACK_DAMAGE, 3.0f)
                .add(Attributes.ATTACK_SPEED, 1.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.2f).build();
    }


    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(1, new FloatGoal(this));
        this.goalSelector.addGoal(2, new KirbySuckGoal(this, 1.0D, true));
        this.goalSelector.addGoal(3, new KirbySitGoal(this));
        this.goalSelector.addGoal(4,  new WaterAvoidingRandomStrollGoal(this, 1.0D));
        this.goalSelector.addGoal(5, new KirbyFollowBuddy(this, 1.0D, 10.0F, 2.0F));
        this.goalSelector.addGoal(6, new SpecialAnimationGoal(this, 0.5F));

        this.targetSelector.addGoal(1, new BuddyHurtTarget(this));
    }

    public final RawAnimation wave = RawAnimation.begin().then("wave", Animation.LoopType.PLAY_ONCE);
    public final RawAnimation cheer = RawAnimation.begin().then("cheer", Animation.LoopType.PLAY_ONCE);
    public final RawAnimation land = RawAnimation.begin().then("land", Animation.LoopType.PLAY_ONCE);

    public final RawAnimation sit = RawAnimation.begin().then("sit", Animation.LoopType.PLAY_ONCE).thenLoop("sitting");
    public final RawAnimation sitting = RawAnimation.begin().thenLoop("sitting");
    public final RawAnimation stand_up = RawAnimation.begin().then("stand_up", Animation.LoopType.PLAY_ONCE);

    public final RawAnimation suck = RawAnimation.begin().then("suck", Animation.LoopType.HOLD_ON_LAST_FRAME);
    public final RawAnimation swallow = RawAnimation.begin().then("swallow", Animation.LoopType.PLAY_ONCE);

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        super.registerControllers(controllerRegistrar);
        MainAnimationController.triggerableAnim("wave", wave);
        MainAnimationController.triggerableAnim("cheer", cheer);
        MainAnimationController.triggerableAnim("land", land);

        MainAnimationController.triggerableAnim("sit", sit);
        MainAnimationController.triggerableAnim("sitting", sitting);
        MainAnimationController.triggerableAnim("stand_up", stand_up);

        MainAnimationController.triggerableAnim("suck", suck);
        MainAnimationController.triggerableAnim("swallow", swallow);
    }


    public float hover;
    public float hoverSpeed;
    public float oHoverSpeed;
    public float oHover;
    public float hovering = 1.0F;

    public void aiStep() {
        super.aiStep();
        this.oHover = this.hover;
        this.oHoverSpeed = this.hoverSpeed;
        this.hoverSpeed += (this.onGround() ? -1.0F : 4.0F) * 0.3F;
        this.hoverSpeed = Mth.clamp(this.hoverSpeed, 0.0F, 1.0F);
        if (!this.onGround() && this.hovering < 1.0F) {
            this.hovering = 1.0F;
        }

        this.hovering *= 0.9F;
        Vec3 vec3 = this.getDeltaMovement();
        if (!this.onGround() && vec3.y < 0.0D) {
            this.setDeltaMovement(vec3.multiply(1.0D, 0.6D, 1.0D));
        }

        this.hover += this.hovering * 2.0F;
    }

    @Override
    public boolean causeFallDamage(float pFallDistance, float pMultiplier, DamageSource pSource) {
        triggerAnim("Main", "land");
        return false;
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return cache;}

    boolean shouldShowDeathMessage = !this.level().isClientSide && this.level().getGameRules().getBoolean(GameRules.RULE_SHOWDEATHMESSAGES) && this.getOwner() instanceof ServerPlayer;

    @Override
    public void die(@NotNull DamageSource pDamageSource) {
        net.minecraft.network.chat.Component deathMessage = this.getCombatTracker().getDeathMessage();
        if (this.dead) if (shouldShowDeathMessage) Objects.requireNonNull(this.getOwner()).sendSystemMessage(deathMessage);
        super.die(pDamageSource);
    }

    private int interactCounter = 0;
    public @NotNull InteractionResult mobInteract(@NotNull Player pPlayer, @NotNull InteractionHand pHand) {
        //ItemStack itemstack = pPlayer.getItemInHand(pHand);
        //if (itemstack.is(Items.BUCKET)) {
        //return InteractionResult.sidedSuccess(this.level().isClientSide);
        //} else {
        InteractionResult interactionresult = super.mobInteract(pPlayer, pHand);

        if (!isTame()) {

            if (this.getRandom().nextFloat() < 0.5F) triggerAnim("Main", "wave");
            else triggerAnim("Main", "cheer");

            interactCounter++;

            if (interactCounter > 4) tame(pPlayer);
        }
        else if (!interactionresult.consumesAction() && this.isOwnedBy(pPlayer)){
            this.setOrderedToSit(!this.isOrderedToSit());
            return InteractionResult.SUCCESS;
        }
        else return interactionresult;
        return super.mobInteract(pPlayer, pHand);
    }


    //TAMEABLILITY OF KIRBY


    protected static final EntityDataAccessor<Byte> DATA_FLAGS_ID = SynchedEntityData.defineId(TamableAnimal.class, EntityDataSerializers.BYTE);
    protected static final EntityDataAccessor<Optional<UUID>> DATA_OWNERUUID_ID = SynchedEntityData.defineId(TamableAnimal.class, EntityDataSerializers.OPTIONAL_UUID);

    private boolean orderedToSit;

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(DATA_FLAGS_ID, (byte)0);
        this.entityData.define(DATA_OWNERUUID_ID, Optional.empty());
    }

    public void addAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.addAdditionalSaveData(pCompound);
        if (this.getOwnerUUID() != null) pCompound.putUUID("Owner", this.getOwnerUUID());

        pCompound.putBoolean("Sitting", this.orderedToSit);
    }
    public void readAdditionalSaveData(@NotNull CompoundTag pCompound) {
        super.readAdditionalSaveData(pCompound);
        UUID uuid;
        if (pCompound.hasUUID("Owner")) uuid = pCompound.getUUID("Owner");
        else {
            String s = pCompound.getString("Owner");
            uuid = OldUsersConverter.convertMobOwnerIfNecessary(Objects.requireNonNull(this.getServer()), s);
        }

        if (uuid == null) return;
        try {
            this.setOwnerUUID(uuid);
            this.setTame(true);
        }
        catch (Throwable throwable) {this.setTame(false);}

        this.orderedToSit = pCompound.getBoolean("Sitting");
        this.setInSittingPose(this.orderedToSit);
    }

    public boolean canBeLeashed(@NotNull Player pPlayer) { return false; }
    protected void spawnTamingParticles(boolean pTamed) {
        ParticleOptions particleoptions = ParticleTypes.HEART;
        for(int i = 0; i < 7; ++i) {
            double d0 = this.random.nextGaussian() * 0.02D;
            double d1 = this.random.nextGaussian() * 0.02D;
            double d2 = this.random.nextGaussian() * 0.02D;
            this.level().addParticle(particleoptions, this.getRandomX(1.0D), this.getRandomY() + 0.5D, this.getRandomZ(1.0D), d0, d1, d2);
        }

    }

    public boolean isTame() {return (this.entityData.get(DATA_FLAGS_ID) & 4) != 0;}
    public void setTame(boolean pTamed) {
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (pTamed) this.entityData.set(DATA_FLAGS_ID, (byte)(b0 | 4));
        else this.entityData.set(DATA_FLAGS_ID, (byte)(b0 & -5));
    }

    public boolean isInSittingPose() {return (this.entityData.get(DATA_FLAGS_ID) & 1) != 0;}
    public boolean isOrderedToSit() {return this.orderedToSit;}
    public void setOrderedToSit(boolean pOrderedToSit) {this.orderedToSit = pOrderedToSit;}
    public void sittingData(boolean sitting){
        byte b0 = this.entityData.get(DATA_FLAGS_ID);
        if (sitting) this.entityData.set(DATA_FLAGS_ID, (byte)(b0 | 1));
        else this.entityData.set(DATA_FLAGS_ID, (byte)(b0 & -2));
    }

    public void setInSittingPose(boolean pSitting) {
        sittingData(pSitting);
        if(pSitting) this.triggerAnim("Main", "sit");
        else this.triggerAnim("Main", "stand_up");
    }


    @Nullable
    public UUID getOwnerUUID() {return this.entityData.get(DATA_OWNERUUID_ID).orElse((UUID)null);}
    public void setOwnerUUID(@Nullable UUID pUuid) {this.entityData.set(DATA_OWNERUUID_ID, Optional.ofNullable(pUuid));}

    public void tame(Player pPlayer) {
        this.setTame(true);
        this.spawnTamingParticles(true);
        this.setOwnerUUID(pPlayer.getUUID());
        if (pPlayer instanceof ServerPlayer) CriteriaTriggers.TAME_ANIMAL.trigger((ServerPlayer)pPlayer, this);
    }

    public boolean isOwnedBy(LivingEntity pEntity) {return pEntity == this.getOwner();}

    public boolean wantsToAttack(LivingEntity pTarget, LivingEntity pOwner) {
        if (pTarget instanceof KirbyEntity) return false;
        if (!(pTarget instanceof Creeper) && !(pTarget instanceof Ghast)) {
            if (pTarget instanceof Wolf wolf) return !wolf.isTame() || wolf.getOwner() != pOwner;
            else if (pTarget instanceof Player && pOwner instanceof Player && !((Player)pOwner).canHarmPlayer((Player)pTarget)) return false;
            else if (pTarget instanceof AbstractHorse && ((AbstractHorse)pTarget).isTamed()) return false;
            else return !(pTarget instanceof TamableAnimal) || !((TamableAnimal)pTarget).isTame();
        }
        else return false;
    }
}
