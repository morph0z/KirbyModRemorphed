package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.BlockHitResult;

public class CupidArrowProjectileEntity extends AbstractArrow {

    public CupidArrowProjectileEntity(EntityType<? extends AbstractArrow> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    protected CupidArrowProjectileEntity(EntityType<? extends AbstractArrow> pEntityType, double pX, double pY, double pZ, Level pLevel) {
        super(pEntityType, pX, pY, pZ, pLevel);
    }

    protected CupidArrowProjectileEntity(EntityType<? extends AbstractArrow> pEntityType, LivingEntity pShooter, Level pLevel) {
        super(pEntityType, pShooter, pLevel);
    }

    public CupidArrowProjectileEntity(LivingEntity player, Level level) {
        super(ModEntities.CUPID_ARROW.get(), player, level);
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
    }

    @Override
    protected ItemStack getPickupItem() {
        return ItemStack.EMPTY;
    }
}
