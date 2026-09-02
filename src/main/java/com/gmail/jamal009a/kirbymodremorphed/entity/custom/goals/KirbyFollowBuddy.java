package com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals;
import java.util.EnumSet;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;

public class KirbyFollowBuddy extends Goal {
    public static final int TELEPORT_WHEN_DISTANCE_IS = 12;
    private static final int MIN_HORIZONTAL_DISTANCE_FROM_PLAYER_WHEN_TELEPORTING = 2;
    private static final int MAX_HORIZONTAL_DISTANCE_FROM_PLAYER_WHEN_TELEPORTING = 3;
    private static final int MAX_VERTICAL_DISTANCE_FROM_PLAYER_WHEN_TELEPORTING = 1;
    private final KirbyEntity kirby;
    private LivingEntity owner;
    private final LevelReader level;
    private final double speedModifier;
    private final PathNavigation navigation;
    private int timeToRecalcPath;
    private final float stopDistance;
    private final float startDistance;
    private float oldWaterCost;

    public KirbyFollowBuddy(KirbyEntity pKirby, double pSpeedModifier, float pStartDistance, float pStopDistance) {
        this.kirby = pKirby;
        this.level = pKirby.level();
        this.speedModifier = pSpeedModifier;
        this.navigation = pKirby.getNavigation();
        this.startDistance = pStartDistance;
        this.stopDistance = pStopDistance;
        this.setFlags(EnumSet.of(Goal.Flag.MOVE, Goal.Flag.LOOK));
        if (!(!(pKirby.getNavigation() instanceof GroundPathNavigation) && !(pKirby.getNavigation() instanceof FlyingPathNavigation))) {return;}
        throw new IllegalArgumentException("Unsupported mob type for KirbyFollowBuddy");
    }

    public boolean canUse() {
        LivingEntity livingentity = this.kirby.getOwner();
        if (livingentity == null) return false;
        else if (livingentity.isSpectator()) return false;
        else if (this.unableToMove()) return false;
        else if (this.kirby.distanceToSqr(livingentity) < (double)(this.startDistance * this.startDistance)) return false;
        else {this.owner = livingentity; return true;}
    }

    public boolean canContinueToUse() {
        if (this.navigation.isDone()) return false;
        else if (this.unableToMove()) return false;
        else return !(this.kirby.distanceToSqr(this.owner) <= (double)(this.stopDistance * this.stopDistance));
    }

    private boolean unableToMove() {return this.kirby.isOrderedToSit() || this.kirby.isPassenger() || this.kirby.isLeashed();}

    public void start() {
        this.timeToRecalcPath = 0;
        this.oldWaterCost = this.kirby.getPathfindingMalus(BlockPathTypes.WATER);
        this.kirby.setPathfindingMalus(BlockPathTypes.WATER, 0.0F);
    }

    public void stop() {
        this.owner = null;
        this.navigation.stop();
        this.kirby.setPathfindingMalus(BlockPathTypes.WATER, this.oldWaterCost);
    }

    public void tick() {
        this.kirby.getLookControl().setLookAt(this.owner, 10.0F, (float)this.kirby.getMaxHeadXRot());
        if (!(--this.timeToRecalcPath <= 0)) {return;}
        this.timeToRecalcPath = this.adjustedTickDelay(10);
        if (this.kirby.distanceToSqr(this.owner) >= 144.0D) this.teleportToOwner();
        else this.navigation.moveTo(this.owner, this.speedModifier);
    }

    private void teleportToOwner() {
        BlockPos blockpos = this.owner.blockPosition();

        for(int i = 0; i < 10; ++i) {
            int j = this.randomIntInclusive(-3, 3);
            int k = this.randomIntInclusive(-1, 1);
            int l = this.randomIntInclusive(-3, 3);
            boolean flag = this.maybeTeleportTo(blockpos.getX() + j, blockpos.getY() + k, blockpos.getZ() + l);
            if (flag) return;
        }

    }

    private boolean maybeTeleportTo(int pX, int pY, int pZ) {
        if (Math.abs((double)pX - this.owner.getX()) < 2.0D && Math.abs((double)pZ - this.owner.getZ()) < 2.0D) return false;
        else if (!this.canTeleportTo(new BlockPos(pX, pY, pZ))) return false;
        else {
            this.kirby.moveTo((double)pX + 0.5D, (double)pY, (double)pZ + 0.5D, this.kirby.getYRot(), this.kirby.getXRot());
            this.navigation.stop();
            return true;
        }
    }

    private boolean canTeleportTo(BlockPos pPos) {
        BlockPathTypes blockpathtypes = WalkNodeEvaluator.getBlockPathTypeStatic(this.level, pPos.mutable());
        if (blockpathtypes != BlockPathTypes.WALKABLE) return false;
        else {
            BlockPos blockpos = pPos.subtract(this.kirby.blockPosition());
            return this.level.noCollision(this.kirby, this.kirby.getBoundingBox().move(blockpos));
        }
    }

    private int randomIntInclusive(int pMin, int pMax) {return this.kirby.getRandom().nextInt(pMax - pMin + 1) + pMin;}
}