package world.vanillyn.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import world.vanillyn.items.Components.CoolingComponent;

public class CoolingFluid extends Item {
    public CoolingFluid(Settings settings) {
        super(settings);
    }

    public static void getRating(ItemStack stack) {
        int Rating = stack.get(CoolingComponent.RATING);
    }
}
