package com.gmail.jamal009a.kirbymodremorphed.world.damagesource;

import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;

public class ModDamageSource{
    private final Holder<ModDamageType> type;
    @Nullable
    private final Entity causingEntity;
    @Nullable
    private final Entity directEntity;
    @Nullable
    private final Vec3 damageSourcePosition;

    public String toString() {
        return "DamageSource (" + this.type().msgId() + ")";
    }

    public float getFoodExhaustion() {
        return this.type().exhaustion();
    }

    public boolean isIndirect() {
        return this.causingEntity != this.directEntity;
    }

    public ModDamageSource(Holder<ModDamageType> pType, @Nullable Entity pDirectEntity, @Nullable Entity pCausingEntity, @Nullable Vec3 pDamageSourcePosition) {
        this.type = pType;
        this.causingEntity = pCausingEntity;
        this.directEntity = pDirectEntity;
        this.damageSourcePosition = pDamageSourcePosition;
    }

    public ModDamageSource(Holder<ModDamageType> pType, @Nullable Entity pCausingEntity, @Nullable Entity pDirectEntity) {
        this(pType, pCausingEntity, pDirectEntity, (Vec3)null);
    }

    public ModDamageSource(Holder<ModDamageType> pType, Vec3 pDamageSourcePosition) {
        this(pType, (Entity)null, (Entity)null, pDamageSourcePosition);
    }

    public ModDamageSource(Holder<ModDamageType> pType, @Nullable Entity pEntity) {
        this(pType, pEntity, pEntity);
    }

    public ModDamageSource(Holder<ModDamageType> pType) {
        this(pType, (Entity)null, (Entity)null, (Vec3)null);
    }

    @Nullable
    public Entity getDirectEntity() {
        return this.directEntity;
    }

    @Nullable
    public Entity getEntity() {
        return this.causingEntity;
    }

    public Component getLocalizedDeathMessage(LivingEntity pLivingEntity) {
        String $$1 = "death.attack." + this.type().msgId();
        if (this.causingEntity == null && this.directEntity == null) {
            LivingEntity $$5 = pLivingEntity.getKillCredit();
            String $$6 = $$1 + ".player";
            return $$5 != null ? Component.translatable($$6, new Object[]{pLivingEntity.getDisplayName(), $$5.getDisplayName()}) : Component.translatable($$1, new Object[]{pLivingEntity.getDisplayName()});
        } else {
            Component $$2 = this.causingEntity == null ? this.directEntity.getDisplayName() : this.causingEntity.getDisplayName();
            Entity var6 = this.causingEntity;
            ItemStack var10000;
            if (var6 instanceof LivingEntity) {
                LivingEntity $$3 = (LivingEntity)var6;
                var10000 = $$3.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            ItemStack $$4 = var10000;
            return !$$4.isEmpty() && $$4.hasCustomHoverName() ? Component.translatable($$1 + ".item", new Object[]{pLivingEntity.getDisplayName(), $$2, $$4.getDisplayName()}) : Component.translatable($$1, new Object[]{pLivingEntity.getDisplayName(), $$2});
        }
    }

    public String getMsgId() {
        return this.type().msgId();
    }

    public boolean scalesWithDifficulty() {
        boolean var10000;
        switch (this.type().scaling()) {
            case NEVER -> var10000 = false;
            case WHEN_CAUSED_BY_LIVING_NON_PLAYER -> var10000 = this.causingEntity instanceof LivingEntity && !(this.causingEntity instanceof Player);
            case ALWAYS -> var10000 = true;
            default -> throw new IncompatibleClassChangeError();
        }

        return var10000;
    }

    public boolean isCreativePlayer() {
        Entity var2 = this.getEntity();
        boolean var10000;
        if (var2 instanceof Player $$0) {
            if ($$0.getAbilities().instabuild) {
                var10000 = true;
                return var10000;
            }
        }

        var10000 = false;
        return var10000;
    }

    @Nullable
    public Vec3 getSourcePosition() {
        if (this.damageSourcePosition != null) {
            return this.damageSourcePosition;
        } else {
            return this.directEntity != null ? this.directEntity.position() : null;
        }
    }

    @Nullable
    public Vec3 sourcePositionRaw() {
        return this.damageSourcePosition;
    }

    public boolean is(TagKey<ModDamageType> pDamageTypeKey) {
        return this.type.is(pDamageTypeKey);
    }

    public boolean is(ResourceKey<ModDamageType> pDamageTypeKey) {
        return this.type.is(pDamageTypeKey);
    }

    public ModDamageType type() {
        return (ModDamageType)this.type.value();
    }

    public Holder<ModDamageType> typeHolder() {
        return this.type;
    }
}
