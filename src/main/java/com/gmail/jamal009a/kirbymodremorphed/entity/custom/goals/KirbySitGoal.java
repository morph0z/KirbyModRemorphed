package com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals;
import java.util.EnumSet;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.KirbyEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

public class KirbySitGoal extends Goal {
    private final KirbyEntity kirby;

    public KirbySitGoal(KirbyEntity pMob) {
        this.kirby = pMob;
        this.setFlags(EnumSet.of(Goal.Flag.JUMP, Goal.Flag.MOVE));
    }

    public boolean canContinueToUse() {return this.kirby.isOrderedToSit();}

    public boolean canUse() {
        if (!this.kirby.isTame()) return false;
        else if (this.kirby.isInWaterOrBubble()) return false;
        else if (!this.kirby.onGround()) return false;
        else {LivingEntity livingentity = this.kirby.getOwner();
            if (livingentity == null) return true;
            else return (!(this.kirby.distanceToSqr(livingentity) < 144.0D) || livingentity.getLastHurtByMob() == null) && this.kirby.isOrderedToSit();
        }
    }

    public void start() {
        this.kirby.getNavigation().stop();
        this.kirby.setInSittingPose(true);
    }

    public void stop() {this.kirby.setInSittingPose(false);}
}