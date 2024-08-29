package world.vanillyn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.ActionResult;
import org.lwjgl.glfw.GLFW;
import world.vanillyn.entity.bangboo.*;
import world.vanillyn.render.model.BangbooModel;
import world.vanillyn.render.render.BangbooRenderer;
import world.vanillyn.render.screen.entity.Handler;


@Environment(EnvType.CLIENT)
public class BangbooClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_BANGBOO_LAYER = new EntityModelLayer(BangbooMod.id("blankboo"), "main");

    @Override
	public void onInitializeClient() {


		EntityModelLayerRegistry.registerModelLayer(MODEL_BANGBOO_LAYER, BangbooModel::getTexturedModelData);

		EntityRendererRegistry.register(BangbooType.EOUS.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.BAGBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.SHARKBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.EXPLOREBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.AMILLION.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.MAGNETIBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.LUCKYBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.BUTLER.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.SAFETY.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.OFFICER_CUI.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.AVOCABOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.CRYBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.BOOLLSEYE.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.DEVILBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.ELECTROBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.PAPERBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.PENGUINBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.PLUGBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.SUMOBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.BADDIEBOO.entityType(), BangbooRenderer::new);
		EntityRendererRegistry.register(BangbooType.BLANKBOO.entityType(), BangbooRenderer::new);

        KeyBinding openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.Bangboo.openscreen",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                "debugging.Bangboo"
        ));

		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (world.isClient) {
				Handler.handleEntityInteraction(player, entity);
			}
			return ActionResult.PASS;
		});

	}
}
