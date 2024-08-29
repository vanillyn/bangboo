package world.vanillyn.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.data.bangboo.BangbooComponents;
import world.vanillyn.entity.data.BangbooEntityData;
import world.vanillyn.item.data.RatingComponent;
import world.vanillyn.entity.bangboo.Bangboo;

import java.util.Optional;

public class BangbooCore<T extends Bangboo> extends Item {
    private final EntityType<T> entityType;

    public BangbooCore(EntityType<T> entityType, char rating) {
        super(new Item.Settings()
                .maxCount(1)
                .component(RatingComponent.RATING, Character.getNumericValue(rating))
                .component(BangbooEntityData.ENTITY_STORAGE, new BangbooComponents(Optional.empty())));
        this.entityType = entityType;
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        // loads and spawns the entity contained within the item, if there is any
        if (!context.getWorld().isClient) {
            var world = context.getWorld();
            var stack = context.getStack();
            var entityStorage = stack.get(BangbooEntityData.ENTITY_STORAGE);

            if (entityStorage == null || entityStorage.nbt().isEmpty())
                return ActionResult.PASS;

            stack.set(BangbooEntityData.ENTITY_STORAGE, new BangbooComponents(Optional.empty()));

            var entity = EntityType.getEntityFromNbt(entityStorage.nbt().get(), world);

            if (entity.isPresent()) {
                var pos = context.getHitPos();
                entity.get().setPos(pos.x, pos.y, pos.z);

                if (!world.spawnEntity(entity.get())) {
                    return ActionResult.FAIL;
                }
            } else {
                BangbooMod.LOGGER.warn("Failed to read entity from offhand due to invalid NBT, entity storage component has been cleared");
                return ActionResult.FAIL;
            }
            stack.decrement(1);
            return ActionResult.SUCCESS;
        }

        return ActionResult.PASS;
    }
}