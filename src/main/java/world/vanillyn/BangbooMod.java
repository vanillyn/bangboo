package world.vanillyn;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import world.vanillyn.entity.BangbooEntities;
import world.vanillyn.items.BangbooItems;
import world.vanillyn.items.Components.CoolingComponent;
import world.vanillyn.net.ScreenChannel;

import static world.vanillyn.net.ScreenChannel.SCREEN_CHANNEL;

public class BangbooMod implements ModInitializer {
	public static final String MOD_ID = "bangboo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Ehen nene nu-nah! (Bangboo mod initialized!)");
		FieldRegistrationHandler.register(BangbooItems.class, MOD_ID, false);
		BangbooEntities.initialize();
		CoolingComponent.init();
		SCREEN_CHANNEL.registerClientbound(ScreenChannel.ScreenPacket.class, (message, access) -> {

		});
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}