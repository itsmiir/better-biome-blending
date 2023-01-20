package com.miir.betterbiomeblending.mixin;

import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(MultiNoiseBiomeSource.class)
public abstract class MultiNoiseBiomeSourceMixin {
//    @Overwrite
//    public RegistryEntry<Biome> getBiome(int x, int y, int z, MultiNoiseUtil.MultiNoiseSampler noise) {
//        return BetterBiomeBlending.getBiomeEntry(((MultiNoiseBiomeSource)(Object) this), x, y, z, noise);
//    }
}
