package com.gmail.jamal009a.kirbymodremorphed.item.weapon.KirbyAbilityItems;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;

public class KirbyAbilitySwordItem extends SwordItem {
    public KirbyAbilitySwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
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
            amountOfInvTicks = 0;}
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
    }

    @Override
    public boolean onDroppedByPlayer(ItemStack item, Player player) {
        player.getInventory().removeItem(item);
        return true;
    }
}
