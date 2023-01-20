package com.miir.betterbiomeblending;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.biome.Biome;

public record ClosenessInfo(RegistryEntry<Biome> closest, RegistryEntry<Biome> second, float closeness) {
//    0: no features should spawn, 1: features should spawn 50/50 (i.e., on the border of two biomes
}
