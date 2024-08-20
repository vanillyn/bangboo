package world.vanillyn.entity.Bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;
import world.vanillyn.items.BangbooItems;


public class Eous extends Bangboo {
    public Eous(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }
    private long lastHelp = 0;
    private static final int HELP_COOLDOWN = 120000;


//    @Override
//    protected void initGoals() {
//        this.goalSelector.add(1, new MeleeAttackGoal(this, 0.8, true));
//        this.goalSelector.add(2, new FollowOwnerGoal(this, 0.8, 2F, 20.0F));
//        this.targetSelector.add(1, new TrackOwnerAttackerGoal(this));
//        this.targetSelector.add(2, new AttackWithOwnerGoal(this));
//        this.targetSelector.add(3, new ActiveTargetGoal<>(this, HostileEntity.class, true));
//        this.goalSelector.add(3, new HelpProxy(this));
//    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        if ((System.currentTimeMillis() - this.lastHelp) > HELP_COOLDOWN) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 20));
            this.lastHelp = System.currentTimeMillis();
        } else {
            player.sendMessage(Text.literal("Ne-nu nana-noo! (Please wait a moment!)"));
        }
        return this.handleInteractMob(player, hand, new ItemStack(BangbooItems.BANGBOO_CORE_EOUS));
    }

    public static DefaultAttributeContainer.Builder  createMobAttributes() {
        return TameableEntity.createLivingAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 5.0D)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.8D)
                .add(EntityAttributes.GENERIC_ARMOR, 4D)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 35.00D);
    }

//    public static class HelpProxy extends Goal {
//        private final Eous eous;
//
//        public HelpProxy(Eous eous) {
//            this.eous = eous;
//            this.setControls(EnumSet.of(Goal.Control.MOVE, Control.LOOK));
//        }
//
//        @Override
//        public boolean canStart() {
//            PlayerEntity proxy = (PlayerEntity) eous.getOwner();
//            return proxy != null && proxy.isAlive() && proxy.getHealth() < 10 &&
//                    (System.currentTimeMillis() - eous.lastHelp) > HELP_COOLDOWN;
//        }
//
//        @Override
//        public void start() {
//            PlayerEntity proxy = (PlayerEntity) eous.getOwner();
//            if (proxy != null) {
//                eous.getNavigation().startMovingTo(proxy, 1.0);
//            }
//        }
//
//        @Override
//        public void tick() {
//            PlayerEntity proxy = (PlayerEntity) eous.getOwner();
//            if (proxy != null && eous.squaredDistanceTo(proxy) <= 2.0D) {
//                proxy.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 40));
//                eous.lastHelp = System.currentTimeMillis();
//            }
//        }
//
//        @Override
//        public boolean shouldContinue() {
//            return false;
//        }
//    }
    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/eous/eous.png");
    }
}