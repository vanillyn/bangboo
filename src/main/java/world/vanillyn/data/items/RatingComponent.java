package world.vanillyn.data.items;


import com.mojang.serialization.Codec;
import net.minecraft.component.ComponentType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.BangbooMod;

public class RatingComponent {
    public static final ComponentType<Integer> RATING = Registry.register(
            Registries.DATA_COMPONENT_TYPE,
            BangbooMod.id("fluid_rating"),
            ComponentType.<Integer>builder().codec(Codec.INT).build()
    );

    public static void init() {
        BangbooMod.LOGGER.info("Ehen nuh nadanade-oh nu-nah! (Cooling Fluid Components initialized!");
    }
}
