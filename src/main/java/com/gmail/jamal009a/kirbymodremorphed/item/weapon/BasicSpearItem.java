
package com.gmail.jamal009a.kirbymodremorphed.item.weapon;

import com.gmail.jamal009a.kirbymodremorphed.item.weapon.client.BasicSpearItemRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.animation.RawAnimation;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;

public class BasicSpearItem extends SwordItem implements GeoItem {
	private static final RawAnimation IDLE_ANIM = RawAnimation.begin().thenPlay("misc.idle");
	private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
	public BasicSpearItem() {
		super(new Tier() {
			public int getUses() {
				return 100;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 3f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.RAW_IRON), new ItemStack(Items.IRON_INGOT));
			}
		}, 3, -3.2f, new Properties());
	}

	@Override
	public void initializeClient(Consumer<IClientItemExtensions> consumer) {
		consumer.accept(new IClientItemExtensions() {
			private BasicSpearItemRenderer renderer;

			@Override
			public BlockEntityWithoutLevelRenderer getCustomRenderer() {
				if (this.renderer == null)
					this.renderer = new BasicSpearItemRenderer();

				return this.renderer;
			}
		});
	}

	@Override
	public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
		controllers.add(new AnimationController<>(this, "Idling", 0, state -> PlayState.STOP)
				.triggerableAnim("idle", IDLE_ANIM));
		// We've marked the "activate" animation as being triggerable from the server
	}

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return this.cache;
	}
}
