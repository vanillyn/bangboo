package world.vanillyn.items;


import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;
import world.vanillyn.items.Item.BangbooCore;
import world.vanillyn.items.Item.CoolingFluid;
import world.vanillyn.items.Item.Signal.Boopon;
import world.vanillyn.items.Item.SoftwareUpdate;
import world.vanillyn.items.Item.SupplyBox;

import static world.vanillyn.entity.BangbooEntities.*;


public class BangbooItems implements ItemRegistryContainer {

    // Bangboo Cores
    public static final Item BANGBOO_CORE = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BLANKBOO, 's');
    public static final Item BANGBOO_CORE_EOUS = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_EOUS, 's');
    public static final Item BANGBOO_CORE_SHARKBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SHARKBOO, 's');
    public static final Item BANGBOO_CORE_BAGBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BAGBOO, 'a');
    public static final Item BANGBOO_CORE_AMILLION = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_AMILLION, 's');
    public static final Item BANGBOO_CORE_LUCKYBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_LUCKYBOO, 'a');
    public static final Item BANGBOO_CORE_EXPLOREBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_EXPLOREBOO, 'a');
    public static final Item BANGBOO_CORE_MAGNETIBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_MAGNETIBOO, 'a');
    public static final Item BANGBOO_CORE_OFFICER_CUI = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_OFFICER_CUI, 's');
    public static final Item BANGBOO_CORE_SAFETY = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SAFETY, 's');
    public static final Item BANGBOO_CORE_BUTLER = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BUTLER, 's');
    public static final Item BANGBOO_CORE_AVOCABOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_AVOCABOO, 'a');
    public static final Item BANGBOO_CORE_BOOLSEYE = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BOOLSEYE, 'a');
    public static final Item BANGBOO_CORE_CRYBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_CRYBOO, 'a');
    public static final Item BANGBOO_CORE_DEVILBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_DEVILBOO, 'a');
    public static final Item BANGBOO_CORE_ELECTROBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_ELECTROBOO, 'a');
    public static final Item BANGBOO_CORE_PAPERBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PAPERBOO, 'a');
    public static final Item BANGBOO_CORE_PLUGBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PLUGBOO, 'a');
    public static final Item BANGBOO_CORE_PENGUINBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_PENGUINBOO, 'a');
    public static final Item BANGBOO_CORE_SUMOBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_SUMOBOO, 'a');
    public static final Item BANGBOO_CORE_BADDIEBOO = new BangbooCore(new Item.Settings().maxCount(1), BANGBOO_BADDIEBOO, 's');
    // Ether Electrolyte
    public static final Item ETHER_ELECTROLYTE = new CoolingFluid(new Item.Settings().maxCount(99), 'c');
    public static final Item ENERGY_TRANSFER_FLUID = new CoolingFluid(new Item.Settings().maxCount(99), 'b');
    public static final Item CONCENTRATED_COOLING_FLUID = new CoolingFluid(new Item.Settings().maxCount(99), 'a');

    // Bangboo Software Patch
    public static final Item BANGBOO_SOFTWARE_PATCH = new SoftwareUpdate(new Item.Settings().maxCount(99), 'c');
    public static final Item BANGBOO_ALGORITHM_MODEL = new SoftwareUpdate(new Item.Settings().maxCount(99), 'b');
    public static final Item BANGBOO_SYSTEM_WIDGET = new SoftwareUpdate(new Item.Settings().maxCount(99), 'a');

    // Supply Box
    public static final Item SUPPLY_BOX_S = new SupplyBox(new Item.Settings().maxCount(1), 's');
    public static final Item SUPPLY_BOX_A = new SupplyBox(new Item.Settings().maxCount(1), 'a');

    // Signal Search
    public static final Item BOOPON = new Boopon(new Item.Settings().maxCount(10));
}
