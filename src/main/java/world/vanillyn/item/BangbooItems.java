package world.vanillyn.item;

import io.wispforest.owo.registration.reflect.ItemRegistryContainer;
import net.minecraft.item.Item;

public class BangbooItems implements ItemRegistryContainer {
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
