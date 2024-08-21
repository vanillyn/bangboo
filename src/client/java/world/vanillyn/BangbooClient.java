package world.vanillyn;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.ActionResult;
import org.lwjgl.glfw.GLFW;
import world.vanillyn.entity.Bangboo.*;
import world.vanillyn.render.Model.Bangboo.BangbooModel;
import world.vanillyn.render.Renderer.BangbooRenderer;
import world.vanillyn.render.Screen.Entity.Handler;
import world.vanillyn.render.Screen.TestScreen;

import static world.vanillyn.entity.BangbooEntities.*;


@Environment(EnvType.CLIENT)
public class BangbooClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_BANGBOO_LAYER = new EntityModelLayer(BangbooMod.id("blankboo"), "main");

	private static KeyBinding OpenMenu;

	@Override
	public void onInitializeClient() {
		new TestScreen();

		EntityModelLayerRegistry.registerModelLayer(MODEL_BANGBOO_LAYER, BangbooModel::getTexturedModelData);

		FabricDefaultAttributeRegistry.register(BANGBOO_BLANKBOO, Bangboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BLANKBOO, BangbooRenderer::new);


		FabricDefaultAttributeRegistry.register(BANGBOO_EOUS, Eous.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_EOUS, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_BAGBOO, Bagboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BAGBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_SHARKBOO, Sharkboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_SHARKBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_EXPLOREBOO, Exploreboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_EXPLOREBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_AMILLION, Amillion.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_AMILLION, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_MAGNETIBOO, Magnetiboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_MAGNETIBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_LUCKYBOO, Luckyboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_LUCKYBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_BUTLER, Butler.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BUTLER, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_SAFETY, Safety.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_SAFETY, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_OFFICER_CUI, OfficerCui.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_OFFICER_CUI, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_AVOCABOO, Avocaboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_AVOCABOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_CRYBOO, Cryboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_CRYBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_BOOLSEYE, Boolseye.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_BOOLSEYE, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_DEVILBOO, Devilboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_DEVILBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_ELECTROBOO, Electroboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_ELECTROBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_PAPERBOO, Paperboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_PAPERBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_PENGUINBOO, Penguinboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_PENGUINBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_PLUGBOO, Plugboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_PLUGBOO, BangbooRenderer::new);

		FabricDefaultAttributeRegistry.register(BANGBOO_SUMOBOO, Sumoboo.createMobAttributes());
		EntityRendererRegistry.register(BANGBOO_SUMOBOO, BangbooRenderer::new);

		//this is ugly lol
		OpenMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
				"key.Bangoo.openscreen",
				InputUtil.Type.KEYSYM,
				GLFW.GLFW_KEY_O,
				"debugging.Bangoo"
		));

		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (world.isClient) {
				Handler.handleEntityInteraction(player, entity);
			}
			return ActionResult.PASS;
		});

	}
}
