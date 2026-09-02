package com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals;

import java.util.EnumSet;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySelector;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.pathfinder.Path;

public class KirbySuckGoal extends Goal {
    protected final KirbyEntity mob;
    private final double speedModifier;
    private final boolean followingTargetEvenIfNotSeen;
    private Path path;
    private double pathedTargetX;
    private double pathedTargetY;
    private double pathedTargetZ;
    private int ticksUntilNextPathRecalculation;
    private int ticksUntilNextAttack;
    private final int attackInterval = 20;
    private long lastCanUseCheck;
    private static final long COOLDOWN_BETWEEN_CAN_USE_CHECKS = 20L;
    private int failedPathFindingPenalty = 0;
    private boolean canPenalize = false;

    public KirbySuckGoal(KirbyEntity pMob, double pSpeedModifier, boolean pFollowingTargetEvenIfNotSeen) {
        this.mob = pMob;
        this.speedModifier = pSpeedModifier;
        this.followingTargetEvenIfNotSeen = pFollowingTargetEvenIfNotSeen;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
    }

    public boolean canUse() {
        long i = this.mob.level().getGameTime();
        if (i - this.lastCanUseCheck < 20L) return false;
        else {
            this.lastCanUseCheck = i;
            LivingEntity livingentity = this.mob.getTarget();
            if (livingentity == null) return false;
            else if (!livingentity.isAlive()) return false;
            else {
                if (canPenalize) {
                    if (--this.ticksUntilNextPathRecalculation <= 0) {
                        this.path = this.mob.getNavigation().createPath(livingentity, 0);
                        this.ticksUntilNextPathRecalculation = 4 + this.mob.getRandom().nextInt(7);
                        return this.path != null;
                    } else return true;
                }
                this.path = this.mob.getNavigation().createPath(livingentity, 0);
                if (this.path != null) return true;
                else
                    return this.getAttackReach(livingentity) >= this.mob.distanceToSqr(livingentity.getX(), livingentity.getY(), livingentity.getZ());
            }
        }
    }

    public boolean canContinueToUse() {
        LivingEntity livingentity = this.mob.getTarget();
        if (livingentity == null) return false;
        else if (!livingentity.isAlive()) return false;
        else if (!this.followingTargetEvenIfNotSeen) return !this.mob.getNavigation().isDone();
        else if (!this.mob.isWithinRestriction(livingentity.blockPosition())) return false;
        else return !(livingentity instanceof Player) || !livingentity.isSpectator() && !((Player)livingentity).isCreative();
    }

    public void start() {
        this.mob.getNavigation().moveTo(this.path, this.speedModifier);
        this.mob.setAggressive(true);
        this.ticksUntilNextPathRecalculation = 0;
        this.ticksUntilNextAttack = 0;
    }

    public void stop() {
        LivingEntity livingentity = this.mob.getTarget();
        if (!EntitySelector.NO_CREATIVE_OR_SPECTATOR.test(livingentity))this.mob.setTarget((LivingEntity)null);
        this.mob.setAggressive(false);
        this.mob.getNavigation().stop();
    }

    public boolean requiresUpdateEveryTick() {
        return true;
    }

    public void tick() {
        mob.setDeltaMovement(0,0,0);
        LivingEntity livingentity = this.mob.getTarget();
        if (livingentity != null) {
            this.mob.getLookControl().setLookAt(livingentity, 30.0F, 30.0F);
            double distanceFromEnemy = Math.sqrt(this.mob.getPerceivedTargetDistanceSquareForMeleeAttack(livingentity));
            this.ticksUntilNextPathRecalculation = Math.max(this.ticksUntilNextPathRecalculation - 1, 0);
            if ((this.followingTargetEvenIfNotSeen || this.mob.getSensing().hasLineOfSight(livingentity)) && this.ticksUntilNextPathRecalculation <= 0 && (this.pathedTargetX == 0.0D && this.pathedTargetY == 0.0D && this.pathedTargetZ == 0.0D || livingentity.distanceToSqr(this.pathedTargetX, this.pathedTargetY, this.pathedTargetZ) >= 1.0D || this.mob.getRandom().nextFloat() < 0.05F)) {
                this.pathedTargetX = livingentity.getX();
                this.pathedTargetY = livingentity.getY();
                this.pathedTargetZ = livingentity.getZ();
                this.ticksUntilNextPathRecalculation = 4 + this.mob.getRandom().nextInt(7);
                if (this.canPenalize) {
                    this.ticksUntilNextPathRecalculation += failedPathFindingPenalty;
                    if (this.mob.getNavigation().getPath() != null) {
                        net.minecraft.world.level.pathfinder.Node finalPathPoint = this.mob.getNavigation().getPath().getEndNode();
                        if (finalPathPoint != null && livingentity.distanceToSqr(finalPathPoint.x, finalPathPoint.y, finalPathPoint.z) < 1) failedPathFindingPenalty = 0;
                        else failedPathFindingPenalty += 10;
                    } else failedPathFindingPenalty += 10;
                }
                if (distanceFromEnemy > 1024.0D) this.ticksUntilNextPathRecalculation += 10;
                else if (distanceFromEnemy > 256.0D) this.ticksUntilNextPathRecalculation += 5;

                if (!this.mob.getNavigation().moveTo(livingentity, this.speedModifier)) this.ticksUntilNextPathRecalculation += 15;

                this.ticksUntilNextPathRecalculation = this.adjustedTickDelay(this.ticksUntilNextPathRecalculation);
            }

            this.ticksUntilNextAttack = Math.max(this.ticksUntilNextAttack - 1, 0);
            this.checkAndPerformAttack(livingentity, distanceFromEnemy);
        }
    }

    protected void checkAndPerformAttack(LivingEntity pEnemy, double pDistToEnemy) {
        double reachDistance = this.getAttackReach(pEnemy);
        if ((pDistToEnemy >= reachDistance)) {
            this.resetAttackCooldown();
            pEnemy.setDeltaMovement(pEnemy.position().vectorTo(mob.position()).normalize());
            double eyeLevel = this.mob.getEyeY();
            this.mob.getLookControl().setLookAt(pEnemy.getX(), eyeLevel, pEnemy.getZ());
            this.mob.triggerAnim("Main", "suck");
            mob.kirbySuck(true);

            if(pEnemy.isAlive()) return;
            mob.kirbySuck(false);
            this.mob.triggerAnim("Main", "land");
        }
        else{
            pEnemy.remove(Entity.RemovalReason.KILLED);
            mob.kirbySuck(false);
            this.mob.triggerAnim("Main", "swallow");
        }
    }

    protected void resetAttackCooldown() {this.ticksUntilNextAttack = this.adjustedTickDelay(5);}

    protected boolean isTimeToAttack() {return this.ticksUntilNextAttack <= 0;}

    protected int getTicksUntilNextAttack() {return this.ticksUntilNextAttack;}

    protected int getAttackInterval() {return this.adjustedTickDelay(5);}

    protected double getAttackReach(LivingEntity pAttackTarget) {return 0.5;}
}
