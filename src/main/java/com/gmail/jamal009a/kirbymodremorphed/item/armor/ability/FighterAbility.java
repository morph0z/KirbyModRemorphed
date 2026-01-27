package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.KiBlastProjectileEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.FighterAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.particle.ModParticles;
import com.google.common.collect.Iterables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

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
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == -1) {
            player.addItem(new ItemStack(ModItems.FIGHTER_GLOVE.get()));
        }
        return true;
    }

    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player){
        System.out.println(ClientForgeHandler.holdTimeSecondary);
        player.displayClientMessage(
                Component.literal(String.valueOf(ClientForgeHandler.holdTimeSecondary)),
                true
        );
        Vec3 playerLookDirection = player.getLookAngle();
        double lookX = playerLookDirection.x;
        double lookY = playerLookDirection.y;
        double lookZ = playerLookDirection.z;
        KiBlastProjectileEntity KiBlast = new KiBlastProjectileEntity(player, player.level(), lookX, lookY, lookZ);
        KiBlast.lerpMotion(lookX, lookY, lookZ);
        KiBlast.setOwner(player);
        //KiBlast.setDangerous(true);

        KiBlast.setPosRaw(player.getX() + lookX * 1.5,
                              player.getEyeY() - 0.1,
                              player.getZ() + lookZ * 1.5);

        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "haduken");
        if (ClientForgeHandler.holdTimeSecondary < 80) {
            level.sendParticles(ModParticles.HADUKEN_PARTICLES.get(),
                    player.getX() + 0, player.getEyeY() - 1, player.getZ() + 0,
                    30, 0, 0, 0, 1);
        }
        if (ClientForgeHandler.holdTimeSecondary >= 80) {
            if (ClientForgeHandler.holdTimeSecondary <= 81) {
                //player.level().addFreshEntity(projectile);
                for (int i = 0; i < player.yHeadRot; i++){
                    KiBlast.yRotO = i;
                }
                level.addFreshEntity(KiBlast);

            }
        }

        return true;
    }
}
