package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CupidAbilityRenderer;
import com.google.common.collect.Iterables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.function.Consumer;

public class CupidAbility extends AbilityClass implements GeoItem {
    public CupidAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pMaterial, pType, pProperties);
        TextColor = "\u00A7d";

        HasPrimary = true;
        PrimaryCharges = false;
        HasSecondary = true;
        SecondaryCharges = true;
        HasPassive = true;

        PrimaryName = "Love Bow";
        SecondaryName = "Wing Fly";
        PassiveName = "Regeneration";

        HasFallingAnimation = false;
    }

    @Override
    public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
        if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
            player.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 1, 0, true, false));
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
                    this.renderer = new CupidAbilityRenderer();

                // This prepares our GeoArmorRenderer for the current render frame.
                // These parameters may be null however, so we don't do anything further with them
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);

                return this.renderer;
            }
        });
    }

    @Override
    public boolean PrimaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage != 0) {return true;}
        return giveItem(player, new ItemStack(ModItems.CUPID_BOW.get()));
    }

    public void CupidFly(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "cupidfly");
        ClientPlayer.addDeltaMovement(new Vec3(0, power,0));
        player.addEffect(new MobEffectInstance(MobEffects.LEVITATION, (int) ((power+1)*10), 3, false, false));
        level.sendParticles(ParticleTypes.CLOUD,
                player.getX() + 0, player.getY() + 0, player.getZ() + 0,
                Math.round(5*power), 0, -0.3, 0, 0.4);
    }

    float secondaryLaunchPower = 5;
    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        ClientForgeHandler.playerAnimationPlay(Minecraft.getInstance().player, "cupidfly");
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;
        assert ClientPlayer != null;

        if (stage == 1){CupidFly(ClientPlayer, player, level, 0);}
        if (stage == 2){CupidFly(ClientPlayer, player, level, secondaryLaunchPower/2);}
        if (stage == 3){CupidFly(ClientPlayer, player, level, (float) (secondaryLaunchPower * 1.5));}
        return true;
    }
}
