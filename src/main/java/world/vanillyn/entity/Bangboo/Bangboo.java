package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;


public abstract class Bangboo extends TameableEntity {
    public Bangboo(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    /**
     * @return the BangbooType this instance of Bangboo corresponds to.
     */
    public abstract BangbooType<?> type();

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return ActionResult.PASS; //TODO?
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
