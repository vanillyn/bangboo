package world.vanillyn.entity.Bangboo;

import com.mojang.serialization.Lifecycle;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.Item.BangbooCore;

public record BangbooType<T extends Bangboo>(EntityType<T> entityType, BangbooCore<T> coreItem, Identifier texture, char rating) {
    public static final RegistryKey<Registry<BangbooType>> REGISTRY_KEY = RegistryKey.ofRegistry(BangbooMod.id("bangboo"));
    public static final Registry<BangbooType> REGISTRY = new SimpleRegistry<>(REGISTRY_KEY, Lifecycle.stable());

    public static final BangbooType<Eous> EOUS = register("eous", Eous::new, 's');
    public static final BangbooType<Sharkboo> SHARKBOO = register("sharkboo", Sharkboo::new, 's');

    public static <T extends Bangboo> BangbooType<T> register(String name, EntityType.EntityFactory<T> bangbooFactory, char rating) {
        var entityType = Registry.register(Registries.ENTITY_TYPE,
                BangbooMod.id(name),
                EntityType.Builder.create(bangbooFactory, SpawnGroup.MISC)
                        .dimensions(.6F, 1F)
                        .build(name));
        var coreItem = Registry.register(Registries.ITEM,
                BangbooMod.id(name),
                new BangbooCore<>(entityType, rating));
        return Registry.register(REGISTRY, BangbooMod.id(name), new BangbooType<>(entityType, coreItem, BangbooMod.id("textures/entity/bangboo/%s.png".formatted(name)), rating));
    }
}
