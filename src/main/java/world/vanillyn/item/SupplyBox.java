package world.vanillyn.item;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import world.vanillyn.entity.data.player.Reward;

import static world.vanillyn.item.BangbooItems.*;

public class SupplyBox extends Item {
    char rating;
    public SupplyBox(Settings settings, char rating) {
        super(settings);
        this.rating = rating;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        ItemStack box = user.getStackInHand(hand);
        if (rating == 's') {
            new Reward(user, false, true, new Item[]{BANGBOO_ALGORITHM_MODEL, BANGBOO_SOFTWARE_PATCH, ETHER_ELECTROLYTE, ENERGY_TRANSFER_FLUID}, 10, 64, 5000, 50000);
        } else if (rating == 'a') {
            new Reward(user, false, true, new Item[]{BANGBOO_SOFTWARE_PATCH, ETHER_ELECTROLYTE}, 5, 32, 500, 5000);
        } else {
            user.sendMessage(Text.literal("Broken item."));
            return TypedActionResult.fail(box);
        }
        return TypedActionResult.consume(box);
    }
}
