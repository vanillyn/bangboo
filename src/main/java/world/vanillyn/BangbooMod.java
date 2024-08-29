package world.vanillyn;

import io.wispforest.owo.registration.reflect.FieldRegistrationHandler;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import world.vanillyn.block.BangbooBlocks;
import world.vanillyn.entity.bangboo.Bangboo;
import world.vanillyn.item.data.RatingComponent;
import world.vanillyn.entity.BangbooEntities;
import world.vanillyn.item.BangbooItems;
import world.vanillyn.net.BangbooChannel;

import static world.vanillyn.net.BangbooChannel.SCREEN_CHANNEL;

public class BangbooMod implements ModInitializer {
	public static final String MOD_ID = "bangboo";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		LOGGER.info("Ehen nene nu-nah! (Bangboo mod initialized!)");
		FieldRegistrationHandler.register(BangbooItems.class, MOD_ID, false);
        BangbooEntities.init();
        BangbooBlocks.init();
		RatingComponent.init();
		SCREEN_CHANNEL.registerServerbound(BangbooChannel.DropBangboo.class, (message, access) -> {
				Bangboo.dropBangbooAsItem(access.player().getServerWorld(), message.id());
		});
	}
	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}