package world.vanillyn.entity.data.damage;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;

public class BangbooDamage {
    public static final RegistryKey<DamageType> ETHER = RegistryKey.of(RegistryKeys.DAMAGE_TYPE, BangbooMod.id("ether"));

    public static DamageSource of(World world, RegistryKey<DamageType> key) {
        return new DamageSource(world.getRegistryManager().get(RegistryKeys.DAMAGE_TYPE).entryOf(key));
    }
}
