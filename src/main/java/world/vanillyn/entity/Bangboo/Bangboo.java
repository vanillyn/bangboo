package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.BangbooItems;


public class Bangboo extends TameableEntity {

    public Bangboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    public ActionResult handleInteractMob(PlayerEntity player, Hand hand, ItemStack itemStack) {
        if (!this.getWorld().isClient) {
            if (player.isSneaking()) {
                
                if (!player.getInventory().insertStack(itemStack)) {
                    player.dropItem(itemStack, true);
                }
                this.getWorld().playSound(null, BlockPos.ofFloored(this.getPos()), SoundEvents.ENTITY_ITEM_PICKUP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                this.remove(RemovalReason.DISCARDED);
                 return ActionResult.SUCCESS;
                }
        }
        return ActionResult.PASS;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }


    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        player.sendMessage(Text.literal("En-nhu na nhene hun nhue! (I'm a prototype Bangboo!)"));
        return this.handleInteractMob(player, hand, new ItemStack(BangbooItems.BANGBOO_CORE));
    }

    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/blankboo/blankboo.png");
    }

    @Nullable
    @Override
    public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return null;
    }
}
