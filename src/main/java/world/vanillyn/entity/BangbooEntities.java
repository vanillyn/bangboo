package world.vanillyn.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.Bangboo.*;

import java.util.EnumSet;

import static world.vanillyn.BangbooMod.LOGGER;


public class BangbooEntities {
    public static final EntityType<Bangboo> BANGBOO_BLANKBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("blankboo"),
            EntityType.Builder.create(Bangboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("blankboo")
    );
    public static final EntityType<Eous> BANGBOO_EOUS = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_eous"),
            EntityType.Builder.create(Eous::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_eous")
    );
    public static final EntityType<Bagboo> BANGBOO_BAGBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_bagboo"),
            EntityType.Builder.create(Bagboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_bagboo")
    );
    public static final EntityType<Sharkboo> BANGBOO_SHARKBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_sharkboo"),
            EntityType.Builder.create(Sharkboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_sharkboo")
    );
    public static final EntityType<Magnetiboo> BANGBOO_MAGNETIBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_magnetiboo"),
            EntityType.Builder.create(Magnetiboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_magnetiboo")
    );
    public static final EntityType<Luckyboo> BANGBOO_LUCKYBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_luckyboo"),
            EntityType.Builder.create(Luckyboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_luckyboo")
    );
    public static final EntityType<Exploreboo> BANGBOO_EXPLOREBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_exploreboo"),
            EntityType.Builder.create(Exploreboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_exploreboo")
    );
    public static final EntityType<Amillion> BANGBOO_AMILLION = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_amillion"),
            EntityType.Builder.create(Amillion::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_amillion")
    );
    public static final EntityType<Butler> BANGBOO_BUTLER = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_butler"),
            EntityType.Builder.create(Butler::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_butler")
    );
    public static final EntityType<Safety> BANGBOO_SAFETY = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_safety"),
            EntityType.Builder.create(Safety::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_safety")
    );
    public static final EntityType<OfficerCui> BANGBOO_OFFICER_CUI = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_officer_cui"),
            EntityType.Builder.create(OfficerCui::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_officer_cui")
    );
    public static final EntityType<Avocaboo> BANGBOO_AVOCABOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_avocaboo"),
            EntityType.Builder.create(Avocaboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_avocaboo")
    );
    public static final EntityType<Boolseye> BANGBOO_BOOLSEYE = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_boolseye"),
            EntityType.Builder.create(Boolseye::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_boolseye")
    );
    public static final EntityType<Cryboo> BANGBOO_CRYBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_cryboo"),
            EntityType.Builder.create(Cryboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_cryboo")
    );
    public static final EntityType<Devilboo> BANGBOO_DEVILBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_devilboo"),
            EntityType.Builder.create(Devilboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_devilboo")
    );
    public static final EntityType<Electroboo> BANGBOO_ELECTROBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_electroboo"),
            EntityType.Builder.create(Electroboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_electroboo")
    );
    public static final EntityType<Paperboo> BANGBOO_PAPERBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_paperboo"),
            EntityType.Builder.create(Paperboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_paperboo")
    );
    public static final EntityType<Plugboo> BANGBOO_PLUGBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_plugboo"),
            EntityType.Builder.create(Plugboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_plugboo")
    );
    public static final EntityType<Penguinboo> BANGBOO_PENGUINBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_penguinboo"),
            EntityType.Builder.create(Penguinboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_penguinboo")
    );
    public static final EntityType<Sumoboo> BANGBOO_SUMOBOO = Registry.register(
            Registries.ENTITY_TYPE,
            BangbooMod.id("bangboo_sumoboo"),
            EntityType.Builder.create(Sumoboo::new, SpawnGroup.MISC)
                    .dimensions(.6F, 1F)
                    .build("bangboo_sumoboo")
    );

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

    public static void initialize() {
        LOGGER.info("Ehen mononuh nu-nah! (Mobs initialized!)");
    }



}