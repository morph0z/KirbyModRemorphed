package com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile;

import com.gmail.jamal009a.kirbymodremorphed.entity.ModEntities;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.AbstractAbilityProjectile;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.core.animation.*;

import java.awt.*;
import java.util.List;

public class DamageHitBoxEntity extends AbstractAbilityProjectile{

    float DamageMultiplier = 1;
    int deleteTimerEnd = 20;
    Dimension size = new Dimension(1,1);

    double xOffset = 0;
    double yOffset = 0;
    double zOffset = 0;

    Vec3 Offset = new Vec3(0,0,0);

    public DamageHitBoxEntity(EntityType<? extends Projectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
        this.refreshDimensions();
    }

    public DamageHitBoxEntity(LivingEntity pShooter, Level pLevel, int damage, int activeTicks, Dimension size,
                              double xOffset, double yOffset, double zOffset) {
        this(ModEntities.DAMAGE_HIT_BOX_ENTITY.get(), pLevel);
        this.DamageMultiplier = damage;
        this.deleteTimerEnd = activeTicks;
        this.size = size;

        this.xOffset = xOffset;
        this.yOffset = yOffset;
        this.zOffset = zOffset;
        this.Offset = new Vec3(this.xOffset, this.yOffset, this.zOffset);

        this.setOwner(pShooter);
    }

    int deleteTimer = 0;
    @Override
    public void tick() {
        super.tick();

        Entity shooter = this.getOwner();

        deleteTimer++;
        if (!this.level().isClientSide) {if (deleteTimer >= deleteTimerEnd) {this.discard();}}
        if (shooter == null) {return;}
        this.setPos(new Vec3(shooter.position().add(this.Offset).toVector3f()));

        AABB box = this.getBoundingBox();

        List<Entity> hits = this.level().getEntities(this, box, e -> e != this.getOwner());

        for (Entity target : hits) {
            if (!this.level().isClientSide) {
                target.hurt(
                        this.damageSources().indirectMagic(this, this.getOwner()),
                        4.0F * DamageMultiplier
                );
            }
        }
    }

    @Override
    protected void onHitEntity(EntityHitResult result) {}

    @Override
    protected void defineSynchedData() {}

    @Override
    public @NotNull EntityDimensions getDimensions(@NotNull Pose pose) {return EntityDimensions.scalable(size.width, size.height);}
}
