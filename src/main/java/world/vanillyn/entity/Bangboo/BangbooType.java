package world.vanillyn.entity.bangboo;

import com.mojang.serialization.Lifecycle;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.SimpleRegistry;
import net.minecraft.util.Identifier;
import world.vanillyn.BangbooMod;
import world.vanillyn.item.BangbooCore;

public record BangbooType<T extends Bangboo>(EntityType<T> entityType, BangbooCore<T> coreItem, Identifier texture, char rating) {
    public static final RegistryKey<Registry<BangbooType>> REGISTRY_KEY = RegistryKey.ofRegistry(BangbooMod.id("bangboo"));
    public static final Registry<BangbooType> REGISTRY = new SimpleRegistry<>(REGISTRY_KEY, Lifecycle.stable());

    public static final BangbooType<Amillion> AMILLION = register("amillion", Amillion::new, 's');
    public static final BangbooType<Avocaboo> AVOCABOO = register("avocaboo", Avocaboo::new, 's');
    public static final BangbooType<Baddieboo> BADDIEBOO = register("baddieboo", Baddieboo::new, 's');
    public static final BangbooType<Bagboo> BAGBOO = register("bagboo", Bagboo::new, 's');
    public static final BangbooType<Boollseye> BOOLLSEYE = register("boollseye", Boollseye::new, 's');
    public static final BangbooType<Butler> BUTLER = register("butler", Butler::new, 's');
    public static final BangbooType<Cryboo> CRYBOO = register("cryboo", Cryboo::new, 's');
    public static final BangbooType<Devilboo> DEVILBOO = register("devilboo", Devilboo::new, 's');
    public static final BangbooType<Electroboo> ELECTROBOO = register("electroboo", Electroboo::new, 's');
    public static final BangbooType<Eous> EOUS = register("eous", Eous::new, 's');
    public static final BangbooType<Exploreboo> EXPLOREBOO = register("exploreboo", Exploreboo::new, 's');
    public static final BangbooType<Luckyboo> LUCKYBOO = register("luckyboo", Luckyboo::new, 's');
    public static final BangbooType<Magnetiboo> MAGNETIBOO = register("magnetiboo", Magnetiboo::new, 's');
    public static final BangbooType<OfficerCui> OFFICER_CUI = register("officer_cui", OfficerCui::new, 's');
    public static final BangbooType<Paperboo> PAPERBOO = register("paperboo", Paperboo::new, 's');
    public static final BangbooType<Penguinboo> PENGUINBOO = register("penguinboo", Penguinboo::new, 's');
    public static final BangbooType<Plugboo> PLUGBOO = register("plugboo", Plugboo::new, 's');
    public static final BangbooType<Safety> SAFETY = register("safety", Safety::new, 's');
    public static final BangbooType<Sumoboo> SUMOBOO = register("sumoboo", Sumoboo::new, 's');
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
        return Registry.register(REGISTRY, BangbooMod.id(name), new BangbooType<>(entityType, coreItem, BangbooMod.id("textures/entity/bangboo/%s/%s.png".formatted(name, name)), rating));
    }
}
