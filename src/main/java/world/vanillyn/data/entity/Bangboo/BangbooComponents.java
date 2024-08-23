package world.vanillyn.data.entity.Bangboo;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.nbt.NbtCompound;

import java.util.Optional;

public record BangbooComponents(Optional<NbtCompound> nbt) {
    public static final Codec<BangbooComponents> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            NbtCompound.CODEC.optionalFieldOf("compound").forGetter(BangbooComponents::nbt)
    ).apply(instance, BangbooComponents::new));
}
