package world.vanillyn.net;

import io.wispforest.owo.network.OwoNetChannel;
import world.vanillyn.BangbooMod;

import java.util.UUID;

public class BangbooChannel {
    public static final OwoNetChannel SCREEN_CHANNEL = OwoNetChannel.create(BangbooMod.id("main"));

    public record DropBangboo(UUID id) {
    }
}
