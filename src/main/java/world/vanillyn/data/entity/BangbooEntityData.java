package world.vanillyn.data.entity;

import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;
import world.vanillyn.BangbooMod;
import world.vanillyn.data.entity.Bangboo.BangbooComponents;
import world.vanillyn.data.player.Dennies;

import java.util.function.UnaryOperator;

public class BangbooEntityData implements EntityComponentInitializer {

    public static final ComponentKey<Dennies> DENNIES =
            ComponentRegistry.getOrCreate(BangbooMod.id("dennies"), Dennies.class);

    public static final ComponentType<BangbooComponents> ENTITY_STORAGE =
            register("entity_storage", builder -> builder
                    .codec(BangbooComponents.CODEC)
                    .cache());

    private static <T> ComponentType<T> register(String id, UnaryOperator<ComponentType.Builder<T>> builderOperator) {
        return Registry.register(Registries.DATA_COMPONENT_TYPE, BangbooMod.id(id), (builderOperator.apply(ComponentType.builder())).build());
    }

    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(DENNIES, Dennies::new, RespawnCopyStrategy.LOSSLESS_ONLY);
    }
}
