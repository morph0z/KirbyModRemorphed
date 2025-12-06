package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.ModArmorMaterials;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.FighterAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.MicrophoneAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.particle.ModParticles;
import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Player;
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

public class FighterAbility extends AbilityClass implements GeoItem {
    public FighterAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "\u00A74";

        HasPrimary = true;
        HasSecondary = true;
        HasPassive = true;

        PrimaryName = "Fighter Glove";
        SecondaryName = "Energy Shot";
        PassiveName = "Strength";

        HasFallingAnimation = true;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, 1, 0, true, false));
        }
        super.inventoryTick(itemstack, world, entity, slot, selected);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new FighterAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public boolean PrimaryAbility(ClientLevel level, AbstractClientPlayer player){
        player.addItem(new ItemStack(ModItems.FIGHTER_GLOVE.get()));
        return true;
    }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player){
        //                    KiBlastProjectileEntity projectile = new KiBlastProjectileEntity(ModEntities.KI_BLAST_PROJECTILE.get(), level);
//                    projectile.setPos(player.xo, player.yo + 0.65, player.zo);
//                    projectile.setDeltaMovement(Vec3.directionFromRotation(player.getRotationVector()));
//                    //Note: Set rotation of projectile to be player rotation
//                    projectile.setYRot(player.getYHeadRot());
        double projectileOffsetX = 0;
        double projectileOffsetY = 1;
        double projectileOffsetZ = 0;

        double d0 = player.getX();
        double d1 = player.getY();
        double d2 = player.getZ();

        double d3 = projectileOffsetX - d0;
        double d4 = projectileOffsetY - d1;
        double d5 = projectileOffsetZ - d2;
//                    KiBlastProjectileEntity kiblast = new KiBlastProjectileEntity(ModEntities.KI_BLAST_PROJECTILE.get(), player, 0, 0, 0, player.level());
//                    kiblast.setOwner(player);
//                    kiblast.setDangerous(true);
//
//                    kiblast.setPosRaw(d0, d1, d2);

        if (ClientForgeHandler.holdTimeSecondary < 80) {
            level.sendParticles(ModParticles.HADUKEN_PARTICLES.get(),
                    player.getX() + 0, player.getEyeY() - 1, player.getZ() + 0,
                    30, 0, 0, 0, 1);
        }
        if (ClientForgeHandler.holdTimeSecondary >= 80) {
            if (ClientForgeHandler.holdTimeSecondary <= 81) {
                //player.level().addFreshEntity(projectile);
                //player.level().addFreshEntity(kiblast);
            }
        }

        return true;
    }
}
