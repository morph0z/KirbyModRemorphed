package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.item.ModArmorMaterials;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CupidAbilityRenderer;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
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
import java.util.function.Consumer;

public abstract class AbilityClass extends ArmorItem implements GeoItem {
    public String TextColor;

    public boolean PrimaryCharges;
    public boolean SecondaryCharges;

    public String PrimaryName;
    public String SecondaryName;
    public String PassiveName;

    public boolean HasFallingAnimation;

    public int amountPrimaryPressed = 0;

    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    public AbilityClass(Type pType, Properties pProperties) {
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
            } else {state.setAnimation(DefaultAnimations.IDLE);}
            // We'll just have ArmorStands always animate, so we can return here
            if (entity instanceof ArmorStand)
                return PlayState.CONTINUE;

            // Play the animation if the full set is being worn, otherwise stop
            return PlayState.CONTINUE;
        }));
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {return this.cache;}

    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        if (entity instanceof Player){PassiveAbility(level, entity, stack, false);}
        super.inventoryTick(stack, level, entity, slot, selected);
    }

    public void appendHoverText(@NotNull ItemStack itemstack, Level world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        if (PrimaryAbility(null, null, 0)) {
            list.add(Component.literal(TextColor+"-Primary"));
            list.add(Component.literal("  "+PrimaryName));
        }

        if(SecondaryAbility(null, null, 0)) {
            list.add(Component.literal(TextColor+"-Secondary"));
            list.add(Component.literal("  "+SecondaryName));
        }

        if(PassiveAbility(null, null, null, true)) {
            list.add(Component.literal(TextColor+"-Passive"));
            list.add(Component.literal("  "+PassiveName));
        }

    }

    boolean giveItem(ServerPlayer player, ItemStack item){
        if (player.getInventory().contains(item)){return false;}
        player.addItem(item);
        return true;
    }

    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){ return false; }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){return false;}

    public boolean PassiveAbility(Level level, Entity entity, ItemStack stack, boolean check){return false;}

    public void ChargeAnimation(AbstractClientPlayer player){}
}
