package world.vanillyn.data;

import org.ladysnake.cca.api.v3.component.ComponentKey;
import org.ladysnake.cca.api.v3.component.ComponentRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentFactoryRegistry;
import org.ladysnake.cca.api.v3.entity.EntityComponentInitializer;
import org.ladysnake.cca.api.v3.entity.RespawnCopyStrategy;
import world.vanillyn.BangbooMod;
import world.vanillyn.data.items.BangbooStorage;
import world.vanillyn.data.player.Dennies;

public class BangbooData implements EntityComponentInitializer {

    public static final ComponentKey<Dennies> DENNIES =
            ComponentRegistry.getOrCreate(BangbooMod.id("dennies"), Dennies.class);

    public static final ComponentKey<BangbooStorage> BANGBOO_STORAGE =
            ComponentRegistry.getOrCreate(BangbooMod.id("bangboo_storage"), BangbooStorage.class);
    @Override
    public void registerEntityComponentFactories(EntityComponentFactoryRegistry registry) {
        registry.registerForPlayers(DENNIES, Dennies::new, RespawnCopyStrategy.LOSSLESS_ONLY);
    }
}
