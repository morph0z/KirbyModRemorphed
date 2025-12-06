package com.gmail.jamal009a.kirbymodremorphed.world.damagesource;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.world.damagesource.DamageEffects;
import net.minecraft.world.damagesource.DamageScaling;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DeathMessageType;

public record ModDamageType(String msgId, DamageScaling scaling, float exhaustion, DamageEffects effects, DeathMessageType deathMessageType){
    public static final Codec<DamageType> CODEC = RecordCodecBuilder.create((p_270460_) -> p_270460_.group(Codec.STRING.fieldOf("message_id").forGetter(DamageType::msgId), DamageScaling.CODEC.fieldOf("scaling").forGetter(DamageType::scaling), Codec.FLOAT.fieldOf("exhaustion").forGetter(DamageType::exhaustion), DamageEffects.CODEC.optionalFieldOf("effects", DamageEffects.HURT).forGetter(DamageType::effects), DeathMessageType.CODEC.optionalFieldOf("death_message_type", DeathMessageType.DEFAULT).forGetter(DamageType::deathMessageType)).apply(p_270460_, DamageType::new));

    public ModDamageType(String pMsgId, DamageScaling pScaling, float pExhaustion) {
        this(pMsgId, pScaling, pExhaustion, DamageEffects.HURT, DeathMessageType.DEFAULT);
    }

    public ModDamageType(String pMsgId, DamageScaling pScaling, float pExhaustion, DamageEffects pEffects) {
        this(pMsgId, pScaling, pExhaustion, pEffects, DeathMessageType.DEFAULT);
    }

    public ModDamageType(String pMsgId, float pExhaustion, DamageEffects pEffects) {
        this(pMsgId, DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, pExhaustion, pEffects);
    }

    public ModDamageType(String pMsgId, float pExhaustion) {
        this(pMsgId, DamageScaling.WHEN_CAUSED_BY_LIVING_NON_PLAYER, pExhaustion);
    }

    public ModDamageType(String msgId, DamageScaling scaling, float exhaustion, DamageEffects effects, DeathMessageType deathMessageType) {
        this.msgId = msgId;
        this.scaling = scaling;
        this.exhaustion = exhaustion;
        this.effects = effects;
        this.deathMessageType = deathMessageType;
    }

    public String msgId() {
        return this.msgId;
    }

    public DamageScaling scaling() {
        return this.scaling;
    }

    public float exhaustion() {
        return this.exhaustion;
    }

    public DamageEffects effects() {
        return this.effects;
    }

    public DeathMessageType deathMessageType() {
        return this.deathMessageType;
    }
}
