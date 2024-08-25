package world.vanillyn.items.Item;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.Random;

import static world.vanillyn.items.BangbooItems.*;

public class SupplyBox extends Item {
    char rating;
    public SupplyBox(Settings settings, char rating) {
        super(settings);
        this.rating = rating;
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (rating == 's') {
            Reward(user, false, new Item[]{BANGBOO_ALGORITHM_MODEL, BANGBOO_SOFTWARE_PATCH, ETHER_ELECTROLYTE, ENERGY_TRANSFER_FLUID}, 10, 64, 5000, 50000);
        } else if (rating == 'a') {
            Reward(user, false, new Item[]{BANGBOO_SOFTWARE_PATCH, ETHER_ELECTROLYTE}, 5, 32, 500, 5000);
        } else {
            user.sendMessage(Text.literal("Broken item."));
        }
        return TypedActionResult.consume(user.getStackInHand(hand));
    }

    private void Reward(PlayerEntity user, boolean crtReward, Item[] rewards, int minItems, int maxItems, int minDennies, int maxDennies) {
        Random rewardItems = new Random();
        Random rewardDennies = new Random();
        for (Item item : rewards) {
            int count = rewardItems.nextInt(maxItems - minItems) + minItems;
            ItemStack stack = new ItemStack(item, count);

            if (crtReward) {
                ItemEntity drops = new ItemEntity(user.getWorld(), user.getX(), user.getY(), user.getZ(), stack);
                user.getWorld().spawnEntity(drops);
            } else {
                if (!user.getInventory().insertStack(stack)) {
                    user.dropItem(stack, false);
                }
            }
        }
    }

}
