package com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals;

import java.util.EnumSet;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.target.TargetGoal;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;

public class BuddyHurtTarget extends TargetGoal {
    private final KirbyEntity kirby;
    private LivingEntity ownerLastHurt;
    private int timestamp;

    public BuddyHurtTarget(KirbyEntity pKirby) {
        super(pKirby, false);
        this.kirby = pKirby;
        this.setFlags(EnumSet.of(Goal.Flag.TARGET));
    }

    public boolean canUse() {
        if (this.kirby.isTame() && !this.kirby.isOrderedToSit()) {
            LivingEntity livingentity = this.kirby.getOwner();
            if (livingentity == null) return false;
            else {
                this.ownerLastHurt = livingentity.getLastHurtMob();
                int i = livingentity.getLastHurtMobTimestamp();
                return i != this.timestamp && this.canAttack(this.ownerLastHurt, TargetingConditions.DEFAULT) && this.kirby.wantsToAttack(this.ownerLastHurt, livingentity);
            }
        } else return false;
    }

    public void start() {
        this.mob.setTarget(this.ownerLastHurt);
        LivingEntity livingentity = this.kirby.getOwner();
        if (livingentity != null) this.timestamp = livingentity.getLastHurtMobTimestamp();

        super.start();
    }
}