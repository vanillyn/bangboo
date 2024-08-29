package world.vanillyn.render.Screen.Entity;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import world.vanillyn.BangbooMod;
import world.vanillyn.entity.bangboo.Bangboo;
import world.vanillyn.render.Screen.TestScreen;

public class Handler {
    public static void handleEntityInteraction(PlayerEntity player, Bangboo entity) {
        if (player.isSneaking() && entity instanceof Bangboo) {
            //lazy example of me sending data over. not pretty but it works!

            MinecraftClient.getInstance().setScreen(new TestScreen(entity, player));
        } else if(player.isSneaking()) {
            BangbooMod.LOGGER.warn("Interacted entity is not Bangboo");
        }
    }
}
