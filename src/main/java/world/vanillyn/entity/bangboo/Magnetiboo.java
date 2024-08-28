package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;


public class Magnetiboo extends Bangboo {
    public Magnetiboo(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public BangbooType<?> type() {
        return BangbooType.MAGNETIBOO;
    }


    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        return ActionResult.SUCCESS;
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.8D)
                .add(EntityAttributes.GENERIC_ARMOR, 1D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 20D);
    }
    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/magnetiboo/magnetiboo.png");
    }
}
