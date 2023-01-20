package com.miir.betterbiomeblending.mixin;

import com.miir.betterbiomeblending.BetterBiomeBlending;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.gen.chunk.ChunkGenerator;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;

@Mixin(ChunkGenerator.class)
public class ChunkGeneratorMixin {
//    @ModifyArgs(
//            method = "generateFeatures",
//            at = @At(value = "INVOKE", target = "Lnet/minecraft/util/math/ChunkPos;stream(Lnet/minecraft/util/math/ChunkPos;I)Ljava/util/stream/Stream;"))
//    private void betterbiomeblending_shuffleFeatureBiomes(Args args) {
//        ChunkPos pos = args.get(0);
//        pos = BetterBiomeBlending.shuffleChunkPos(pos, BetterBiomeBlending.FEATURE_CHUNK_BLEND_RADIUS);
//        args.set(0, pos);
//    }
}
