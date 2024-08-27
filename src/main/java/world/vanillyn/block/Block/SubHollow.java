package world.vanillyn.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import world.vanillyn.data.damage.BangbooDamage;

public class SubHollow extends Block {
    public SubHollow(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            DamageSource ether = BangbooDamage.of(world, BangbooDamage.ETHER);
            player.damage(ether, 20f);
        }
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            DamageSource ether = BangbooDamage.of(world, BangbooDamage.ETHER);
            player.damage(ether, 20.0f);
        }
        return ActionResult.SUCCESS;
    }
}
