package world.vanillyn.entity.bangboo;

import com.mojang.serialization.Lifecycle;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
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

    public static final BangbooType<Amillion> AMILLION = register("amillion", Amillion::new, Amillion.createMobAttributes(), 's');
    public static final BangbooType<Avocaboo> AVOCABOO = register("avocaboo", Avocaboo::new, Avocaboo.createMobAttributes(), 's');
    public static final BangbooType<Baddieboo> BADDIEBOO = register("baddieboo", Baddieboo::new, Baddieboo.createMobAttributes(), 's');
    public static final BangbooType<Bagboo> BAGBOO = register("bagboo", Bagboo::new, Bagboo.createMobAttributes(), 's');
    public static final BangbooType<Boollseye> BOOLLSEYE = register("boollseye", Boollseye::new, Boollseye.createMobAttributes(), 's');
    public static final BangbooType<Butler> BUTLER = register("butler", Butler::new, Butler.createMobAttributes(), 's');
    public static final BangbooType<Cryboo> CRYBOO = register("cryboo", Cryboo::new, Cryboo.createMobAttributes(), 's');
    public static final BangbooType<Devilboo> DEVILBOO = register("devilboo", Devilboo::new, Devilboo.createMobAttributes(), 's');
    public static final BangbooType<Electroboo> ELECTROBOO = register("electroboo", Electroboo::new, Electroboo.createMobAttributes(), 's');
    public static final BangbooType<Eous> EOUS = register("eous", Eous::new, Eous.createMobAttributes(), 's');
    public static final BangbooType<Exploreboo> EXPLOREBOO = register("exploreboo", Exploreboo::new, Exploreboo.createMobAttributes(), 's');
    public static final BangbooType<Luckyboo> LUCKYBOO = register("luckyboo", Luckyboo::new, Luckyboo.createMobAttributes(), 's');
    public static final BangbooType<Magnetiboo> MAGNETIBOO = register("magnetiboo", Magnetiboo::new, Magnetiboo.createMobAttributes(), 's');
    public static final BangbooType<OfficerCui> OFFICER_CUI = register("officer_cui", OfficerCui::new, OfficerCui.createMobAttributes(), 's');
    public static final BangbooType<Paperboo> PAPERBOO = register("paperboo", Paperboo::new, Paperboo.createMobAttributes(), 's');
    public static final BangbooType<Penguinboo> PENGUINBOO = register("penguinboo", Penguinboo::new, Penguinboo.createMobAttributes(), 's');
    public static final BangbooType<Plugboo> PLUGBOO = register("plugboo", Plugboo::new, Plugboo.createMobAttributes(), 's');
    public static final BangbooType<Safety> SAFETY = register("safety", Safety::new, Safety.createMobAttributes(), 's');
    public static final BangbooType<Sumoboo> SUMOBOO = register("sumoboo", Sumoboo::new, Sumoboo.createMobAttributes(), 's');
    public static final BangbooType<Sharkboo> SHARKBOO = register("sharkboo", Sharkboo::new, Sharkboo.createMobAttributes(), 's');

    public static final BangbooType<Blankboo> BLANKBOO = register("blankboo", Blankboo::new, Blankboo.createMobAttributes(), 's');

    public static <T extends Bangboo> BangbooType<T> register(String name, EntityType.EntityFactory<T> bangbooFactory, DefaultAttributeContainer.Builder defaultAttributesBuilder, char rating) {
        var entityType = Registry.register(Registries.ENTITY_TYPE,
                BangbooMod.id("bangboo_" + name),
                EntityType.Builder.create(bangbooFactory, SpawnGroup.MISC)
                        .dimensions(.6F, 1F)
                        .build(name));
        var coreItem = Registry.register(Registries.ITEM,
                BangbooMod.id("bangboo_core_" + name),
                new BangbooCore<>(entityType, rating));

        FabricDefaultAttributeRegistry.register(entityType, defaultAttributesBuilder);
        return Registry.register(REGISTRY,
                BangbooMod.id(name),
                new BangbooType<>(entityType,
                        coreItem,
                        BangbooMod.id("textures/entity/bangboo/%s/%s.png".formatted(name, name)),
                        rating));
    }
}
