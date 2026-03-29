package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.item.ModArmorMaterials;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.List;

public class AbilityClass extends ArmorItem implements GeoItem {
    public String TextColor;

    public boolean HasPrimary;
    public boolean PrimaryCharges;
    public String PrimaryName;

    public boolean HasSecondary;
    public boolean SecondaryCharges;
    public String SecondaryName;

    public boolean HasPassive;
    public String PassiveName;

    public boolean HasFallingAnimation;

    public int amountPrimaryPressed = 0;

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public AbilityClass(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(ModArmorMaterials.ABILITY, pType, pProperties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, 20, state -> {
            Entity entity = state.getData(DataTickets.ENTITY);
            if (HasFallingAnimation) {
                if (!entity.onGround()) {
                    state.setAnimation(DefaultAnimations.FLY);
                } else if (entity.onGround()) {
                    state.setAnimation(DefaultAnimations.IDLE);
                }
            } else if (!HasFallingAnimation) {state.setAnimation(DefaultAnimations.IDLE);}
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

    public boolean giveItem(ServerPlayer player, ItemStack item){
        if (player.getInventory().contains(item)){return false;}
        player.addItem(item);
        return true;
    }

    /// set stage to -1 if there are no stages
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){ return false; }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){
        return false;
    }

    public void ChargeAnimation(AbstractClientPlayer player){}
}
