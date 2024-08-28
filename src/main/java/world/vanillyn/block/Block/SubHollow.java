package world.vanillyn.block.Block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.damage.DamageType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
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

    public void etherDamage(World world, RegistryKey<DamageType> type, Entity entity, float amount) {
        DamageSource ether = new DamageSource(
                world.getRegistryManager()
                        .get(RegistryKeys.DAMAGE_TYPE)
                        .entryOf(type));

        entity.damage(ether, amount);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!world.isClient && entity instanceof PlayerEntity player) {
            etherDamage(world, BangbooDamage.ETHER, player, 20f);
        }
    }
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (!world.isClient) {
            etherDamage(world, BangbooDamage.ETHER, player, 20f);
        }
        return ActionResult.SUCCESS;
    }
}
