package com.gmail.jamal009a.kirbymodremorphed.world.entity;

import com.gmail.jamal009a.kirbymodremorphed.world.damagesource.ModDamageSource;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;

public class ModEntity extends Entity {
    public ModEntity(EntityType<?> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public boolean modIsInvulnerableTo(ModDamageSource pSource) {
        return this.isRemoved() || this.isInvulnerable() && !pSource.isCreativePlayer();
    }
    public boolean modHurt(ModDamageSource pSource, float pAmount) {
        if (this.modIsInvulnerableTo(pSource)) {
            return false;
        } else {
            this.markHurt();
            return false;
        }
    }

    @Override
    protected void defineSynchedData() {

    }

    @Override
    protected void readAdditionalSaveData(CompoundTag compoundTag) {

    }

    @Override
    protected void addAdditionalSaveData(CompoundTag compoundTag) {

    }
}
