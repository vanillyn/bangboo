package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
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
        if ((System.currentTimeMillis() - this.lastHelp) > HELP_COOLDOWN) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 40, 20));
            this.lastHelp = System.currentTimeMillis();
        } else {
            player.sendMessage(Text.literal("Ne-nu nana-noo! (Please wait a moment!)"));
        }
        // return this.handleInteractMob(player, hand, new ItemStack(type().coreItem()));
        return ActionResult.SUCCESS;
    }

}
