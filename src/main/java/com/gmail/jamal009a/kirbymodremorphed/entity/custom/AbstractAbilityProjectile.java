package com.gmail.jamal009a.kirbymodremorphed.entity.custom;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.registries.RegistryObject;

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
        this.setRot(pShooter.getYRot(), pShooter.getXRot());
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

    protected abstract void onHitEntity(EntityHitResult result);
}
