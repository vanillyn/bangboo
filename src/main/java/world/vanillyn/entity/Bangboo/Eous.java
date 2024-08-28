package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;


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
        // return this.handleInteractMob(player, hand, new ItemStack(type().coreItem()));
        return ActionResult.SUCCESS;
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
