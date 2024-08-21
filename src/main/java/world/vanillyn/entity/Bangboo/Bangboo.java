package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.BangbooItems;


public class Bangboo extends TameableEntity {

    public Bangboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    public String[] bangbooId = {"amillion", "avocaboo", "bagboo", "blankboo", "boolseye", "butler", "cryboo", "devilboo", "electroboo", "luckyboo", "magnetiboo", "officer_cui", "paperboo", "penguinboo", "plugboo", "safety", "sharkboo", "sumoboo"};
    public ActionResult handleInteractMob(PlayerEntity player, Hand hand, ItemStack itemStack) {
        if (!this.getWorld().isClient) {
            System.out.println("Interacted with " + this.getType().getName().getString());
        }
        return ActionResult.PASS;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return false;
    }


    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
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
