package world.vanillyn.items;


import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;

import static world.vanillyn.entity.BangbooEntities.*;


public class BangbooItems implements ItemRegistryContainer {

    // Bangboo Cores
    public static final Item BANGBOO_CORE = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BLANKBOO);
    public static final Item BANGBOO_CORE_EOUS = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_EOUS);
    public static final Item BANGBOO_CORE_SHARKBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SHARKBOO);
    public static final Item BANGBOO_CORE_BAGBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BAGBOO);
    public static final Item BANGBOO_CORE_AMILLION = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_AMILLION);
    public static final Item BANGBOO_CORE_LUCKYBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_LUCKYBOO);
    public static final Item BANGBOO_CORE_EXPLOREBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_EXPLOREBOO);
    public static final Item BANGBOO_CORE_MAGNETIBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_MAGNETIBOO);
    public static final Item BANGBOO_CORE_OFFICER_CUI = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_OFFICER_CUI);
    public static final Item BANGBOO_CORE_SAFETY = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SAFETY);
    public static final Item BANGBOO_CORE_BUTLER = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BUTLER);
    public static final Item BANGBOO_CORE_AVOCABOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_AVOCABOO);
    public static final Item BANGBOO_CORE_BOOLSEYE = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BOOLSEYE);
    public static final Item BANGBOO_CORE_CRYBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_CRYBOO);
    public static final Item BANGBOO_CORE_DEVILBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_DEVILBOO);
    public static final Item BANGBOO_CORE_ELECTROBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_ELECTROBOO);
    public static final Item BANGBOO_CORE_PAPERBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PAPERBOO);
    public static final Item BANGBOO_CORE_PLUGBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PLUGBOO);
    public static final Item BANGBOO_CORE_PENGUINBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PENGUINBOO);
    public static final Item BANGBOO_CORE_SUMOBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SUMOBOO);

    //
    public static final Item COOLING_FLUID = new CoolingFluid(new Item.Settings().maxCount(99));
}
