package world.vanillyn.entity.bangboo;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;


public class Eous extends Bangboo {
    private long lastHelp = 0;
    private static final int HELP_COOLDOWN = 120000;

    public Eous(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public BangbooType<?> type() {
        return BangbooType.EOUS;
    }



    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if ((System.currentTimeMillis() - this.lastHelp) > HELP_COOLDOWN && player.isSneaking()) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 20));
            this.lastHelp = System.currentTimeMillis();
        } else {
            player.sendMessage(Text.literal("Ne-nu nana-noo! (Please wait a moment!)"));
        }
        // return this.handleInteractMob(player, hand, new ItemStack(type().coreItem()));
        return ActionResult.SUCCESS;
    }

    public static DefaultAttributeContainer.Builder createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 50.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 1.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.3D)
                .add(EntityAttributes.GENERIC_ARMOR, 1D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 50D);
    }

}
