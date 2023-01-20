package com.miir.betterbiomeblending;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.MultiNoiseBiomeSource;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;

import java.util.Random;

public class BetterBiomeBlending {
    public static final double SURFACE_BLEND_RADIUS = 4;
    public static final double SURFACE_BLEND_Y_RADIUS = 0;
    public static final Random RANDOM = new Random(System.currentTimeMillis());

//    public static final double BIOME_BLEND_RADIUS = 0;
//    public static RegistryEntry<Biome> getBiomeEntry(MultiNoiseBiomeSource multiNoiseBiomeSourceMixin, int x, int y, int z, MultiNoiseUtil.MultiNoiseSampler noise) {
//        Random random = new Random((long) x * y * z);
//        x += random.nextGaussian()* BIOME_BLEND_RADIUS;
//        y += random.nextGaussian()* BIOME_BLEND_RADIUS / 100;
//        z += random.nextGaussian()* BIOME_BLEND_RADIUS;
//        return multiNoiseBiomeSourceMixin.getBiomeAtPoint(noise.sample(x, y, z));
//    }

    public static BlockPos shuffle(BlockPos pos, double radius, double yRadius) {
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        x += RANDOM.nextGaussian()* radius;
        y += RANDOM.nextGaussian()* yRadius;
        z += RANDOM.nextGaussian()* radius;
        return new BlockPos(x, y, z);
    }

//    public static ChunkPos shuffleChunkPos(ChunkPos pos, double radius) {
//        int regionX = pos.getRegionX();
//        int regionZ = pos.getRegionZ();
//        int x;
//        int z;
//        do {
//            x = (int) (pos.x + RANDOM.nextGaussian() * radius);
//        } while (x >> 5 != regionX);
//        do {
//            z = (int) (pos.z + RANDOM.nextGaussian() * radius);
//        } while (regionZ != z >> 5);
//        return new ChunkPos(x, z);
//    }
}
