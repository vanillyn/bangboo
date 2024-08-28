package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;


public class Blankboo extends Bangboo {
    public Blankboo(EntityType<? extends TameableEntity> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {

        return ActionResult.PASS;
    }

    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/blankboo/blankboo.png");
    }
}
