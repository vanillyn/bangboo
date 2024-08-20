package world.vanillyn.render.Screen.Entity;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import world.vanillyn.entity.Bangboo.Bangboo;
import world.vanillyn.render.Screen.TestScreen;

public class Handler {

    public static void handleEntityInteraction(PlayerEntity player, Entity entity) {
        if (player.isSneaking() && entity instanceof Bangboo) {
            MinecraftClient.getInstance().setScreen(new TestScreen());
        } else {
            EntityType<?> bangboo = entity.getType();
            String bangbooName = bangboo.getName().getString();
            System.out.println("You interacted with: " + bangbooName);
        }
    }
}
