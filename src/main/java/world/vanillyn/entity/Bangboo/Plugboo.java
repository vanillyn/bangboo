package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.BangbooItems;


public class Plugboo extends Bangboo {
    public Plugboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // this.goalSelector.add(1, new MeowEntities.FollowPlayerGoal(this, 1.0D));
    }
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return this.handleInteractMob(player, hand, new ItemStack(BangbooItems.BANGBOO_CORE_PLUGBOO));
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1D)
                .add(EntityAttributes.GENERIC_ARMOR, 0.5D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20D);
    }
    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/plugboo/plugboo.png");
    }
}
