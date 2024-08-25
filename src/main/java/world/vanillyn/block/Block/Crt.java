package world.vanillyn.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import world.vanillyn.data.player.Reward;

import java.util.Random;

import static world.vanillyn.items.BangbooItems.*;

public class Crt extends Block {
    Item boopon;

    public Crt(Settings settings, Item boopon) {
        super(settings);
        this.boopon = boopon;
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        ItemStack heldItem = player.getMainHandStack();
        Random random = new Random();
        if (heldItem.getItem() == boopon) {
            char rating;
            int reward = random.nextInt(3);

            switch (reward) {
                case 1:
                    rating = 'c';
                    new Reward(player, true, true, new Item[]{ETHER_ELECTROLYTE, ENERGY_TRANSFER_FLUID, BANGBOO_SOFTWARE_PATCH, BANGBOO_ALGORITHM_MODEL}, 10, 64, 5000, 50000);
                    break;
                case 2:
                    rating = 'a';
                    new Reward(player, true, false, new Item[]{BANGBOO_CORE}, 1, 1, 0, 0);
                    break;
                case 3:
                    rating = 's';
                    new Reward(player, true, false, new Item[]{BANGBOO_CORE}, 1, 1, 0, 0);
                    break;
                default:
                    rating = 'c';
                    new Reward(player, true, true, new Item[]{ETHER_ELECTROLYTE, ENERGY_TRANSFER_FLUID, BANGBOO_SOFTWARE_PATCH, BANGBOO_ALGORITHM_MODEL}, 10, 64, 5000, 50000);
                    break;
            }

            player.sendMessage(Text.literal("Acquired rating " + rating), true);

        }
        return ActionResult.SUCCESS;
    }
}
