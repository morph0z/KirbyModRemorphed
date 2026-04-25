package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CupidAbilityRenderer;
import com.google.common.collect.Iterables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleOptions;
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
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.util.List;
import java.util.function.Consumer;

public class NinjaAbility extends AbilityClass implements GeoItem {
    public NinjaAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pType, pProperties);
        TextColor = "§5";

        PrimaryCharges = false;
        SecondaryCharges = true;

        PrimaryName = "Katana";
        SecondaryName = "Slash / Suplex / Smoke bomb";
        PassiveName = "Speed / Wall Jumping";

        HasFallingAnimation = false;
    }

    //TODO: REPLACE MODEL
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
        if (stage == 0) {return true;}
        return giveItem(player, new ItemStack(ModItems.KATANA.get()));
    }

    //TODO: ADD ANIMATIONS
    public void SmokeBomb(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        //ClientForgeHandler.playerAnimationPlay(ClientPlayer, "");
        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, (int) ((power+1)*40), 0, false, false));
        level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                player.getX(), player.getY(), player.getZ(),
                Math.round(50*power), 0, -0.3, 0, 0.03);
    }

    public void KatanaDash(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        Dash(ClientPlayer, player, level, power, false,
                ParticleTypes.SMOKE, 0, -0.3F, 0, 10, 0.8,
                SoundEvents.WOOL_STEP);
    }

    public void suplex(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power, List<Entity> hitEntities){
        hitEntities.get(0).addDeltaMovement(new Vec3(0, 50, 0));
        ClientPlayer.addDeltaMovement(new Vec3(0, 2, 0));
    }

    float secondaryPower = 5;
    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;

        AABB box = player.getBoundingBox().inflate(2);
        List<Entity> hits = player.level().getEntities(player, box, e -> e != player);

        assert ClientPlayer != null;
        if (player.isHolding(ModItems.KATANA.get())) {
            if (stage == 1) {KatanaDash(ClientPlayer, player, level, 0);}
            if (stage == 2) {KatanaDash(ClientPlayer, player, level, secondaryPower / 2);}
            if (stage == 3) {KatanaDash(ClientPlayer, player, level, (float) (secondaryPower * 1.5));}
        } else if (!hits.isEmpty()) {
            if (stage == 1) {suplex(ClientPlayer, player, level, 0, hits);}
            if (stage == 2) {suplex(ClientPlayer, player, level, secondaryPower / 2, hits);}
            if (stage == 3) {suplex(ClientPlayer, player, level, (float) (secondaryPower * 1.5), hits);}
        } else{
            if (stage == 1) {SmokeBomb(ClientPlayer, player, level, 0);}
            if (stage == 2) {SmokeBomb(ClientPlayer, player, level, secondaryPower / 2);}
            if (stage == 3) {SmokeBomb(ClientPlayer, player, level, (float) (secondaryPower * 1.5));}
        }
        return true;
    }

    @Override
    public boolean PassiveAbility(Level level, Entity entity, ItemStack stack, boolean check) {
        if(check){return true;}
        if (entity instanceof Player player && Iterables.contains(entity.getArmorSlots(), stack)) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SPEED,
                    1,
                    0,
                    true,
                    false));
        }
        return true;
    }
}
