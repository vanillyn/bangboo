package world.vanillyn.items.Item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import world.vanillyn.data.items.RatingComponent;

public class CoolingFluid extends Item {
    public CoolingFluid(Settings settings, char rating) {
        super(settings);
    }

    public static void getRating(ItemStack stack) {
        int Rating = stack.get(RatingComponent.RATING);
    }
}
