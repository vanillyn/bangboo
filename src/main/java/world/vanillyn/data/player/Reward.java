package world.vanillyn.data.player;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import world.vanillyn.data.entity.BangbooEntityData;

import java.util.Random;

public class Reward {
    /**
     * @param user       The player entity.
     * @param isCrtReward  CRT rewards drop the items on the ground, instead of placing them in your inventory.
     * @param shouldRewardDennies Whether or not the item rewards Dennies.
     * @param rewards    A list of items for rewards.
     * @param minItems   The minimum amount of items to be rewarded.
     * @param maxItems   The maximum amount of items to be rewarded.
     * @param minDennies The minimum amount of Dtems to be rewarded
     * @param maxDennies The maximum amount of Dennies to be rewarded.
     */
    public Reward(PlayerEntity user, boolean isCrtReward, boolean shouldRewardDennies, Item[] rewards, int minItems, int maxItems, int minDennies, int maxDennies) {
        Random rewardItems = new Random();
        Random rewardDennies = new Random();
        if (shouldRewardDennies) {
            int count = rewardDennies.nextInt(maxDennies - minDennies) + minDennies;
            BangbooEntityData.DENNIES.get(user).add(count);
        }
        for (Item item : rewards) {
            int count;
            if (maxItems == 1) {
                count = 1;
            } else {
                count = rewardItems.nextInt(maxItems - minItems) + minItems;
            }
            ItemStack stack = new ItemStack(item, count);

            if (isCrtReward) {
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
