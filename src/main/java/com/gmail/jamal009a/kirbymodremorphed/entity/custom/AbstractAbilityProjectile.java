package com.gmail.jamal009a.kirbymodremorphed.entity.custom;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.BeamWaveProjectileEntity;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.ProjectileUtil;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.util.Objects;

public abstract class AbstractAbilityProjectile extends Projectile {

    protected AbstractAbilityProjectile(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.reapplyPosition();
    }

    @Override
    public void tick() {
        super.tick();
    }

    public void setRotation(float xRotation, float yRotation){
        setRot(yRotation, xRotation);

        setXRot(xRotation);
        setYRot((yRotation % 360) * -1);

        xRotO = xRotation;
        yRotO = yRotation;
    }

    public Vec2 getRotation(){
        return new Vec2(getXRot(), getYRot());
    }

    protected abstract void onHitEntity(EntityHitResult result);
}
