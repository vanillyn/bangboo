package world.vanillyn.net;

import io.wispforest.owo.network.OwoNetChannel;
import io.wispforest.owo.ui.base.BaseUIModelScreen;
import io.wispforest.owo.ui.container.FlowLayout;
import world.vanillyn.BangbooMod;

public class ScreenChannel {
    public static final OwoNetChannel SCREEN_CHANNEL = OwoNetChannel.create(BangbooMod.id("main"));

    public record ScreenPacket(BaseUIModelScreen<FlowLayout> screen) {
    }
}
