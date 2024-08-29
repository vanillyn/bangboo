package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class Baddieboo extends Bangboo {
    public Baddieboo(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 30.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 7.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1D)
                .add(EntityAttributes.GENERIC_ARMOR, 1D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20D);
    }


    @Override
    public BangbooType<?> type() {
        return BangbooType.BADDIEBOO;
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return ActionResult.SUCCESS;
    }

}
