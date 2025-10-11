package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.item.ModArmorMaterials;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.BeamAbilityRenderer;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;
import java.util.Set;
import java.util.function.Consumer;

public class AbilityClass extends ArmorItem implements GeoItem {
    public String TextColor;

    public boolean HasPrimary;
    public String PrimaryName;

    public boolean HasSecondary;
    public String SecondaryName;

    public boolean HasPassive;
    public String PassiveName;

    public boolean HasFlyingAnimation;
    public boolean HasFallingAnimation;


    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public AbilityClass(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(ModArmorMaterials.ABILITY, pType, pProperties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            Entity entity = state.getData(DataTickets.ENTITY);
            if (HasFlyingAnimation) {
                if (!entity.onGround()) {
                    state.setAnimation(DefaultAnimations.FLY);
                } else if (entity.onGround()) {
                    state.setAnimation(DefaultAnimations.IDLE);
                }
            }
            if (HasFallingAnimation){
                if (!entity.onGround()) {
                    if (entity.fallDistance > 0) {
                        state.setAnimation(DefaultAnimations.FLY);
                    } else if (entity.onGround()) {
                        state.setAnimation(DefaultAnimations.IDLE);
                    }
                }
            }
            // We'll just have ArmorStands always animate, so we can return here
            if (entity instanceof ArmorStand)
                return PlayState.CONTINUE;

            // Play the animation if the full set is being worn, otherwise stop
            return PlayState.CONTINUE;
        }));
    }


    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }


    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        if (HasPrimary) {
            list.add(Component.literal(TextColor+"-Primary"));
            list.add(Component.literal("  "+PrimaryName));
        }

        if(HasSecondary) {
            list.add(Component.literal(TextColor+"-Secondary"));
            list.add(Component.literal("  "+SecondaryName));
        }

        if(HasPassive) {
            list.add(Component.literal(TextColor+"-Passive"));
            list.add(Component.literal("  "+PassiveName));
        }

    }

}
