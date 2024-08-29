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
import world.vanillyn.entity.bangboo.*;
import world.vanillyn.render.Model.Bangboo.BangbooModel;
import world.vanillyn.render.Renderer.BangbooRenderer;
import world.vanillyn.render.Screen.Entity.Handler;


@Environment(EnvType.CLIENT)
public class BangbooClient implements ClientModInitializer {
	public static final EntityModelLayer MODEL_BANGBOO_LAYER = new EntityModelLayer(BangbooMod.id("blankboo"), "main");

    @Override
	public void onInitializeClient() {


		EntityModelLayerRegistry.registerModelLayer(MODEL_BANGBOO_LAYER, BangbooModel::getTexturedModelData);

		EntityRendererRegistry.register(BangbooType.EOUS.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.EOUS.entityType(), Eous.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.BAGBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.BAGBOO.entityType(), Bagboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.SHARKBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.SHARKBOO.entityType(), Sharkboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.EXPLOREBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.EXPLOREBOO.entityType(), Exploreboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.AMILLION.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.AMILLION.entityType(), Amillion.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.MAGNETIBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.MAGNETIBOO.entityType(), Magnetiboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.LUCKYBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.LUCKYBOO.entityType(), Luckyboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.BUTLER.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.BUTLER.entityType(), Butler.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.SAFETY.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.SAFETY.entityType(), Safety.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.OFFICER_CUI.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.OFFICER_CUI.entityType(), OfficerCui.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.AVOCABOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.AVOCABOO.entityType(), Avocaboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.CRYBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.CRYBOO.entityType(), Cryboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.BOOLLSEYE.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.BOOLLSEYE.entityType(), Boollseye.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.DEVILBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.DEVILBOO.entityType(), Devilboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.ELECTROBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.ELECTROBOO.entityType(), Electroboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.PAPERBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.PAPERBOO.entityType(), Paperboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.PENGUINBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.PENGUINBOO.entityType(), Penguinboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.PLUGBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.PLUGBOO.entityType(), Plugboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.SUMOBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.SUMOBOO.entityType(), Sumoboo.createMobAttributes());
		EntityRendererRegistry.register(BangbooType.BADDIEBOO.entityType(), BangbooRenderer::new);
		FabricDefaultAttributeRegistry.register(BangbooType.BADDIEBOO.entityType(), Baddieboo.createMobAttributes());

        KeyBinding openMenu = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.Bangboo.openscreen",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                "debugging.Bangboo"
        ));

		UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
			if (world.isClient) {
				Handler.handleEntityInteraction(player, (Bangboo) entity);
			}
			return ActionResult.PASS;
		});

	}
}
