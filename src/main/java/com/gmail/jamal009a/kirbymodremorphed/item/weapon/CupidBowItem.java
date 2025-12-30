package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.CupidArrowProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems.KirbyAbilityBowItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

import java.util.function.Predicate;

public class CupidBowItem extends KirbyAbilityBowItem {
    public CupidBowItem(){
        this(new Properties().durability(50));
    }
    public CupidBowItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void releaseUsing(ItemStack stack, Level level, LivingEntity entity, int timeLeft) {
        if (!(entity instanceof Player player)) return;
        if (level.isClientSide) return;

        int charge = this.getUseDuration(stack) - timeLeft;
        float power = BowItem.getPowerForTime(charge);

        if (power < 0.1F) return;

        CupidArrowProjectileEntity projectile = new CupidArrowProjectileEntity(player, level);
        projectile.shootFromRotation(
                player,
                player.getXRot(),
                player.getYRot(),
                0.0F,
                power * 0.5F, // velocity
                1.0F          // inaccuracy
        );

        level.addFreshEntity(projectile);

        stack.hurtAndBreak(1, player, p -> p.broadcastBreakEvent(player.getUsedItemHand()));
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        player.startUsingItem(hand);
        return InteractionResultHolder.consume(stack);
    }

    @Override
    public Predicate<ItemStack> getAllSupportedProjectiles() {
        return stack -> false;
    }
}
