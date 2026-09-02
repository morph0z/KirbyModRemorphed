package com.gmail.jamal009a.kirbymodremorphed.entity.custom.goals;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.abstractclasses.AnimatedMob;
import net.minecraft.world.entity.MoverType;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.phys.Vec3;

public class SpecialAnimationGoal extends Goal {
    private final AnimatedMob mob;
    private final float Chance;

    public SpecialAnimationGoal(AnimatedMob pMob, float chance) {this.mob = pMob; this.Chance = chance;}

    @Override
    public boolean canUse() {return (this.mob.getRandom().nextIntBetweenInclusive(1,100) < Chance)
                            && mob.onGround()
                            && mob.MainAnimationController.isPlayingTriggeredAnimation();}
    //&& !mob.isMovingOnXZ

    public void start() {
        mob.triggerAnim("Main", "special");
        mob.move(MoverType.SELF, new Vec3(0,0,0));
    }
}
