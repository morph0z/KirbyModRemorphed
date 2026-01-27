package com.gmail.jamal009a.kirbymodremorphed.entity.custom;

import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;

public abstract class AbstractAbilityProjectile extends Projectile {
    public double xPower;
    public double yPower;
    public double zPower;

    protected AbstractAbilityProjectile(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public AbstractAbilityProjectile(EntityType<? extends AbstractAbilityProjectile> pEntityType, LivingEntity pShooter, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        this(pEntityType, pShooter.getX(), pShooter.getY(), pShooter.getZ(), pOffsetX, pOffsetY, pOffsetZ, pLevel);
        this.setOwner(pShooter);
    }

    public AbstractAbilityProjectile(EntityType<? extends AbstractAbilityProjectile> type, Level worldIn, double x, double y, double z) {
        this(type, worldIn);
        setPos(x, y, z);
    }

    public AbstractAbilityProjectile(EntityType<? extends AbstractAbilityProjectile> pEntityType, double pX, double pY, double pZ, double pOffsetX, double pOffsetY, double pOffsetZ, Level pLevel) {
        this(pEntityType, pLevel);
        this.moveTo(pX, pY, pZ, this.getYRot(), this.getXRot());
        this.reapplyPosition();
        double d0 = Math.sqrt(pOffsetX * pOffsetX + pOffsetY * pOffsetY + pOffsetZ * pOffsetZ);
        if (d0 != (double)0.0F) {
            this.xPower = pOffsetX / d0 * 0.1;
            this.yPower = pOffsetY / d0 * 0.1;
            this.zPower = pOffsetZ / d0 * 0.1;
        }
    }

    public void setRotation(float yaw, float pitch) {
        // Set the yaw and pitch directly
        this.setYRot(yaw);
        this.setXRot(pitch);

        // Update the previous frame's rotation values for consistency
        this.yRotO = yaw;
        this.xRotO = pitch;
    }

    @Override
    public void tick() {
        super.tick();

        this.setYRot(this.getYRot());
        this.yRotO = this.getYRot();

        this.setXRot(this.getXRot());
        this.xRotO = this.getXRot();
    }

    protected abstract void onHitEntity(EntityHitResult result);
}
