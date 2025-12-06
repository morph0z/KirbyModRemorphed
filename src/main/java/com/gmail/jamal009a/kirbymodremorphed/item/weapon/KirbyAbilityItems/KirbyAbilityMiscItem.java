package com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.Level;

public class KirbyAbilityMiscItem extends TieredItem {
    public KirbyAbilityMiscItem(Tier pTier, Properties pProperties) {
        super(pTier, pProperties);
    }

    //System for removing the item after a certain amount of time
    int amountOfInvTicks = 0;
    int ticksBeforeRemove = 1500;
    @Override
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        amountOfInvTicks += 1;
        if(amountOfInvTicks >= ticksBeforeRemove){
            pStack.setDamageValue(pStack.getDamageValue()-1);
            //Player player = pLevel.getNearestPlayer(pEntity,1); player.getInventory().removeItem(pStack);
            amountOfInvTicks = 0;
        }
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, Player player) {
        player.getInventory().removeItem(item);
        return true;
    }
}
