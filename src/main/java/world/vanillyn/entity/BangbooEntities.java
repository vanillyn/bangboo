package world.vanillyn.entity;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;

import java.util.EnumSet;

import static world.vanillyn.BangbooMod.LOGGER;


public class BangbooEntities {
    public static class FollowPlayerGoal extends Goal {
        private final MobEntity entity;
        private PlayerEntity targetPlayer;
        private final double speed;

        public FollowPlayerGoal(MobEntity entity, double speed) {
            this.entity = entity;
            this.speed = speed;
            this.setControls(EnumSet.of(Goal.Control.MOVE, Goal.Control.LOOK));
        }

        @Override
        public boolean canStart() {
            this.targetPlayer = this.entity.getWorld().getClosestPlayer(this.entity, 10.0D);
            return this.targetPlayer != null;
        }

        @Override
        public boolean shouldContinue() {
            return this.targetPlayer != null && this.targetPlayer.isAlive() && this.entity.squaredDistanceTo(this.targetPlayer) > 2.0D;
        }

        @Override
        public void start() {
            this.entity.getNavigation().startMovingTo(this.targetPlayer, this.speed);
        }

        @Override
        public void stop() {
            this.targetPlayer = null;
            this.entity.getNavigation().stop();
        }

        @Override
        public void tick() {
            this.entity.getLookControl().lookAt(this.targetPlayer, 30.0F, 30.0F);
            this.entity.getNavigation().startMovingTo(this.targetPlayer, this.speed);
        }
    }

    public static void init() {
        LOGGER.info("Ehen mononuh nu-nah! (Mobs initialized!)");
    }



}