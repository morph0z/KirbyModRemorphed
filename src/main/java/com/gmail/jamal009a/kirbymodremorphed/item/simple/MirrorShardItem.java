
package com.gmail.jamal009a.kirbymodremorphed.item.simple;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import java.util.List;

public class MirrorShardItem extends Item {
	public MirrorShardItem() {
		super(new Properties().stacksTo(8).fireResistant().rarity(Rarity.RARE));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("§7a shard of the Dimention Mirror"));
	}
}
