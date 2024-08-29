package world.vanillyn.render.screen.entity;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.bangboo.Bangboo;
import world.vanillyn.render.screen.TestScreen;

public class Handler {
    // previously, if the entity wasn't Bangboo, it'd throw a cast exception in the usage of this method
    // fixed so that you don't run into that -- Aurora
    public static void handleEntityInteraction(PlayerEntity player, Entity entity) {
        if (player.isSneaking() && entity instanceof Bangboo bangboo) {
            //lazy example of me sending data over. not pretty but it works!

            MinecraftClient.getInstance().setScreen(new TestScreen(bangboo, player));
        }
    }
}
