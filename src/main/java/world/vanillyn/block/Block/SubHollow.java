package world.vanillyn.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import world.vanillyn.data.damage.Ether;

public class SubHollow extends Block {
    public SubHollow(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        super.onEntityCollision(state, world, pos, entity);

        if (!world.isClient && entity instanceof PlayerEntity user) {
            Ether ether = new Ether(null, null);
            user.damage(ether, 20f);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        super.onEntityCollision(state, world, pos, player);

        if (!world.isClient) {
            Ether ether = new Ether(null, player);
            player.damage(ether, 20f);
        }
        return ActionResult.SUCCESS;
    }
}
