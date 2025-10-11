package com.gmail.jamal009a.kirbymodremorphed.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.Nullable;

public class HadukenParticles extends TextureSheetParticle {
    protected HadukenParticles(ClientLevel pLevel, double pX, double pY, double pZ, SpriteSet spriteSet, double pXSpeed, double pYSpeed, double pZSpeed) {
        super(pLevel, pX, pY, pZ, pXSpeed, pYSpeed, pZSpeed);

        this.friction = 0.8F;
        this.xd = xd;
        this.yd = yd;
        this.zd = zd;
        this.quadSize *= 0.85F;
        this.lifetime = 20;
        this.setSpriteFromAge(spriteSet);

        this.rCol = 0F;
        this.gCol = 2F;
        this.bCol = 3F;
    }


    @Override
    public void tick() {
        super.tick();
        fadeIn();
    }

    private void fadeIn(){
        this.alpha = ((float) lifetime / age);
    }


    @Override
    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    @OnlyIn(Dist.CLIENT)
    public static class Provider implements ParticleProvider<SimpleParticleType>{
        public final SpriteSet spites;

        public Provider(SpriteSet spites) {
            this.spites = spites;
        }


        @Override
        public @Nullable Particle createParticle(SimpleParticleType simpleParticleType, ClientLevel Level, double x, double y, double z, double dx, double dy, double dz) {
            return new HadukenParticles(Level,x,y,z,this.spites,dx,dy,dz);
        }
    }
}
