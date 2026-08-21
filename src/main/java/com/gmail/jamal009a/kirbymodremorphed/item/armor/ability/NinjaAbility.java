package com.gmail.jamal009a.kirbymodremorphed.item.armor.ability;

import ca.weblite.objc.Client;
import com.gmail.jamal009a.kirbymodremorphed.client.handler.ClientForgeHandler;
import com.gmail.jamal009a.kirbymodremorphed.entity.custom.projectile.DamageHitBoxEntity;
import com.gmail.jamal009a.kirbymodremorphed.item.ModItems;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.CupidAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.client.NinjaAbilityRenderer;
import com.gmail.jamal009a.kirbymodremorphed.item.armor.ability.subAbility.DashAbility;
import com.gmail.jamal009a.kirbymodremorphed.util.MethodRunOnce;
import com.google.common.collect.Iterables;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

public class NinjaAbility extends AbilityClass implements GeoItem, DashAbility {
    public NinjaAbility(ArmorMaterial pMaterial, Type pType, Properties pProperties) {
        super(pType, pProperties);
        TextColor = "§5";

        PrimaryCharges = false;
        SecondaryCharges = true;

        PrimaryName = "Katana";
        SecondaryName = "Slash / Suplex / Smoke bomb";
        PassiveName = "Speed / Wall Jumping";

        HasFallingAnimation = true;
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private GeoArmorRenderer<?> renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack, EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
                if (this.renderer == null)
                    this.renderer = new NinjaAbilityRenderer();

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

    public void SmokeBomb(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power){
        ClientForgeHandler.playerAnimationPlay(ClientPlayer, "smokebombthrow");
        player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, (int) ((power)*40), 0, false, false));
        level.sendParticles(ParticleTypes.CAMPFIRE_COSY_SMOKE,
                player.getX(), player.getY(), player.getZ(),
                Math.round(50*power), 0, -0.3, 0, 0.03);
    }

    public void KatanaDash(LocalPlayer ClientPlayer, ServerPlayer player, ServerLevel level, float power, int time){
        ClientForgeHandler.playerAnimationPlay(ClientPlayer, "slashthrow");
        Dash(ClientPlayer, player, level, power, false,
                ParticleTypes.SMOKE, 0, -0.3F, 0, 10, 0.8,
                SoundEvents.WOOL_STEP);

        DamageHitBoxEntity hitBox = new DamageHitBoxEntity(player, level, (int) power, time*20,
                                    new Dimension(2, 2), 0,0,0);
        level.addFreshEntity(hitBox);
    }

    public void suplex(LocalPlayer ClientPlayer, float power, List<Entity> hitEntities){
        Entity suplexReceiver = hitEntities.get(0);

        ClientForgeHandler.playerAnimationPlay(ClientPlayer, "suplexthrow");
        ClientPlayer.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 80, 4, false, false));
        suplexReceiver.addDeltaMovement(new Vec3(0, 1 * power, 0));

        if (suplexReceiver instanceof Monster)
            ((Monster) suplexReceiver).setAggressive(false);

        ClientPlayer.addDeltaMovement(new Vec3(0, 1 * power, 0));
    }

    float secondaryPower = 3;
    public boolean SecondaryAbility(ServerLevel level, ServerPlayer player, int stage){
        if (stage == 0){return true;}
        LocalPlayer ClientPlayer = Minecraft.getInstance().player;

        AABB box = player.getBoundingBox().inflate(2);
        List<Entity> hits = player.level().getEntities(player, box, e -> e != player);

        assert ClientPlayer != null;

        if (player.isHolding(ModItems.KATANA.get())) { switch (stage){
                case (1): KatanaDash(ClientPlayer, player, level, 1, 1); break;
                case (2): KatanaDash(ClientPlayer, player, level, secondaryPower / 2, 2); break;
                case (3): KatanaDash(ClientPlayer, player, level, (float) (secondaryPower), 2); break;
            }}
        else if (!hits.isEmpty()) { switch (stage) {
                case (1): suplex(ClientPlayer, 1, hits); break;
                case (2): suplex(ClientPlayer, secondaryPower / 4, hits); break;
                case (3): suplex(ClientPlayer, secondaryPower / 2, hits); break;
            }}
        else { switch (stage){
                case (1):SmokeBomb(ClientPlayer, player, level, 1); break;
                case (2):SmokeBomb(ClientPlayer, player, level, secondaryPower / 2); break;
                case (3):SmokeBomb(ClientPlayer, player, level, (float) (secondaryPower * 1.5)); break;
            }}
        return true;
    }


    @Override
    public void SecondaryChargeAnimation(AbstractClientPlayer player){
        AABB box = player.getBoundingBox().inflate(2);
        List<Entity> hits = player.level().getEntities(player, box, e -> e != player);

        if (player.isHolding(ModItems.KATANA.get())) {ClientForgeHandler.playerAnimationPlay(player, "slashcharge");}
        else if (!hits.isEmpty()) {ClientForgeHandler.playerAnimationPlay(player, "suplexcharge");}
        else{ClientForgeHandler.playerAnimationPlay(player, "smokebombcharge");}
    }

    //TODO: WALL CLING
    @Override
    public boolean PassiveAbility(Level level, Entity entity, ItemStack stack, boolean check) {
        if(check){return true;}
        if (entity instanceof ServerPlayer player && Iterables.contains(entity.getArmorSlots(), stack)) {
            player.addEffect(new MobEffectInstance(
                    MobEffects.MOVEMENT_SPEED,
                    1,
                    0,
                    true,
                    false)
            );
            WallCling(player, level);
        }
        
        return true;
    }

    void WallCling(ServerPlayer player, Level level){
        boolean wallOnXAxis = (((player.getDirection() == Direction.NORTH) || (player.getDirection() == Direction.SOUTH)) &&
                ((!level.isEmptyBlock
                        (BlockPos.of
                                (BlockPos.asLong(
                                        player.getBlockX() + 1,
                                        player.getBlockY() + 1,
                                        player.getBlockZ())
                                )
                        )
                ) || (!level.isEmptyBlock
                        (BlockPos.of
                                (BlockPos.asLong(
                                        player.getBlockX() - 1,
                                        player.getBlockY() + 1,
                                        player.getBlockZ())
                                )
                        )
                )));

        boolean wallOnZAxis = (((player.getDirection() == Direction.EAST) || (player.getDirection() == Direction.WEST)) &&
                ((!level.isEmptyBlock
                        (BlockPos.of
                                (BlockPos.asLong(
                                        player.getBlockX(),
                                        player.getBlockY() + 1,
                                        player.getBlockZ() + 1)
                                )
                        )
                ) || (!level.isEmptyBlock
                        (BlockPos.of
                                (BlockPos.asLong(
                                        player.getBlockX() ,
                                        player.getBlockY() + 1,
                                        player.getBlockZ() - 1)
                                )
                        )
                )));

        if ((wallOnXAxis || wallOnZAxis) && !player.onGround())
            player.setNoGravity(true);
        if (!(wallOnXAxis || wallOnZAxis) || player.onGround())
            player.setNoGravity(false);

    }
}


