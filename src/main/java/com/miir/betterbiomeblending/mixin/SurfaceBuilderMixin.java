package com.miir.betterbiomeblending.mixin;

import com.miir.betterbiomeblending.BetterBiomeBlending;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.BiomeAccess;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.gen.HeightContext;
import net.minecraft.world.gen.chunk.ChunkNoiseSampler;
import net.minecraft.world.gen.noise.NoiseConfig;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;
import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

import java.util.function.Function;

@Mixin(SurfaceBuilder.class)
public class SurfaceBuilderMixin {
    @ModifyArgs(
            method = "buildSurface",
            at = @At(
                    value = "INVOKE",
                    target = "Lnet/minecraft/world/gen/surfacebuilder/MaterialRules$MaterialRuleContext;<init>(Lnet/minecraft/world/gen/surfacebuilder/SurfaceBuilder;Lnet/minecraft/world/gen/noise/NoiseConfig;Lnet/minecraft/world/chunk/Chunk;Lnet/minecraft/world/gen/chunk/ChunkNoiseSampler;Ljava/util/function/Function;Lnet/minecraft/registry/Registry;Lnet/minecraft/world/gen/HeightContext;)V")
    )
    private void betterbiomeblending_blendSurface(
            Args args, NoiseConfig nc, BiomeAccess access, Registry<Biome> br, boolean b, HeightContext hc, final Chunk c, ChunkNoiseSampler cns, MaterialRules.MaterialRule mr) {
        args.<Function<BlockPos, RegistryEntry<Biome>>>set(4, (pos) -> access.getBiome(BetterBiomeBlending.shuffle(pos, BetterBiomeBlending.SURFACE_BLEND_RADIUS, BetterBiomeBlending.SURFACE_BLEND_Y_RADIUS)));
    }

}
