package world.vanillyn.entity.bangboo;

import io.wispforest.owo.ui.component.LabelComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemScatterer;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.data.BangbooEntityData;
import world.vanillyn.entity.data.bangboo.BangbooComponents;

import java.util.Optional;
import java.util.UUID;


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

    public static void dropBangbooAsItem(ServerWorld world, UUID bangbooID) {
        var compound = new NbtCompound();
        if (world.getEntity(bangbooID) instanceof Bangboo bangboo) {
            bangboo.saveSelfNbt(compound);
            Item core = bangboo.type().coreItem();
            ItemStack stack = new ItemStack(core);
            stack.set(BangbooEntityData.ENTITY_STORAGE, new BangbooComponents(Optional.of(compound)));
            BangbooMod.LOGGER.info(String.valueOf(stack));
            ItemScatterer.spawn(world, bangboo.getX(), bangboo.getY(), bangboo.getZ(), stack);
            bangboo.remove(RemovalReason.KILLED);
        } else {
            BangbooMod.LOGGER.error("Incorrect Entity or UUID.");
        }
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
