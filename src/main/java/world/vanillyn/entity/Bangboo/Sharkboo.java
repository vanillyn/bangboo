package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.BangbooItems;


public class Sharkboo extends Bangboo {
    public Sharkboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // eventually goals will go here
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return this.handleInteractMob(player, hand, new ItemStack(BangbooItems.BANGBOO_CORE_SHARKBOO));
    }
    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/sharkboo/sharkboo.png");
    }
}
