package world.vanillyn.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
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
            Ether ether = new Ether(null);
            user.damage(ether, 20f);
        }
    }
}
