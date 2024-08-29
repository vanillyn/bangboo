package world.vanillyn.render.render;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;
import world.vanillyn.BangbooClient;
import world.vanillyn.entity.bangboo.Bangboo;
import world.vanillyn.render.model.BangbooModel;

public class BangbooRenderer extends MobEntityRenderer<Bangboo, BangbooModel> {

    public BangbooRenderer(EntityRendererFactory.Context context) {
        super(context, new BangbooModel(context.getPart(BangbooClient.MODEL_BANGBOO_LAYER)), 1f);
    }

    @Override
    public Identifier getTexture(Bangboo entity) {
        return entity.type().texture();
    }
}