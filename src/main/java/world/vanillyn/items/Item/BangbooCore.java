package world.vanillyn.items.Item;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;


public class BangbooCore extends Item {
    private final EntityType<?> entityType;

    public BangbooCore(Settings settings, EntityType<?> entityType, char rating) {
        super(settings);
        this.entityType = entityType;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!context.getWorld().isClient) {
            BlockPos pos = context.getBlockPos().offset(context.getSide());
            PlayerEntity player = context.getPlayer();
            context.getStack().decrement(1);
            TameableEntity bangboo = (TameableEntity) entityType.create(context.getWorld());
            if (bangboo != null && player != null) {
                // bangboo.shouldRenderName();
                bangboo.setOwner(player);
                bangboo.isTamed();
                bangboo.refreshPositionAndAngles(player.getX() + 1, player.getY() + 1, player.getZ(), player.getYaw(), player.getPitch());
                context.getWorld().spawnEntity(bangboo);
            }
            context.getWorld().playSound(null, pos, SoundEvents.ENTITY_ARROW_HIT_PLAYER, SoundCategory.BLOCKS, 1.0F, 1.0F);

            return ActionResult.SUCCESS;
        }
        return ActionResult.PASS;
    }
}