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


public class Paperboo extends Bangboo {
    public Paperboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    protected void initGoals() {
        // this.goalSelector.add(1, new MeowEntities.FollowPlayerGoal(this, 1.0D));
    }
    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return this.handleInteractMob(player, hand, new ItemStack(BangbooItems.BANGBOO_CORE_PAPERBOO));
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 10.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.2D)
                .add(EntityAttributes.GENERIC_ARMOR, 1D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20D);
    }
    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/paperboo/paperboo.png");
    }
}
