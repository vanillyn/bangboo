package world.vanillyn.render.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import world.vanillyn.entity.bangboo.Bangboo;



// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class BangbooModel extends EntityModel<Bangboo> {
    private final ModelPart bb_main;
    public BangbooModel(ModelPart root) {
        this.bb_main = root.getChild("bb_main");
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData bb_main = modelPartData.addChild("bb_main", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

        ModelPartData cube_r1 = bb_main.addChild("cube_r1", ModelPartBuilder.create().uv(16, 21).cuboid(-5.0F, 0.0F, -1.0F, 6.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-4.0F, -13.7F, 0.5F, -1.5708F, 0.0F, -1.9635F));

        ModelPartData cube_r2 = bb_main.addChild("cube_r2", ModelPartBuilder.create().uv(22, 11).cuboid(-5.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(3.5F, -8.0F, -0.5F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r3 = bb_main.addChild("cube_r3", ModelPartBuilder.create().uv(22, 0).cuboid(-5.0F, 0.0F, -1.0F, 6.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(2.0F, -14.05F, 0.5F, -1.5708F, 0.0F, -1.1781F));

        ModelPartData cube_r4 = bb_main.addChild("cube_r4", ModelPartBuilder.create().uv(0, 21).cuboid(-5.0F, 0.0F, -2.0F, 6.0F, 1.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, -12.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r5 = bb_main.addChild("cube_r5", ModelPartBuilder.create().uv(17, 25).cuboid(-5.0F, 0.0F, -1.0F, 4.0F, 1.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(-5.5F, -8.0F, -0.5F, 0.0F, 0.0F, -1.5708F));

        ModelPartData cube_r6 = bb_main.addChild("cube_r6", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -4.0F, -3.0F, 8.0F, 5.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, -3.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData cube_r7 = bb_main.addChild("cube_r7", ModelPartBuilder.create().uv(0, 26).cuboid(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, -3.0F, 3.0F, 0.0F, -3.1416F, 0.0F));

        ModelPartData cube_r8 = bb_main.addChild("cube_r8", ModelPartBuilder.create().uv(0, 11).cuboid(-6.0F, -3.0F, -3.0F, 8.0F, 4.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(-2.5F, -8.0F, 0.0F, 0.0F, -3.1416F, 0.0F));

        ModelPartData cube_r9 = bb_main.addChild("cube_r9", ModelPartBuilder.create().uv(8, 26).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r10 = bb_main.addChild("cube_r10", ModelPartBuilder.create().uv(28, 4).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r11 = bb_main.addChild("cube_r11", ModelPartBuilder.create().uv(28, 7).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));

        ModelPartData cube_r12 = bb_main.addChild("cube_r12", ModelPartBuilder.create().uv(28, 15).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, int color) {
        bb_main.render(matrices, vertices, light, overlay, color);
    }

    @Override
    public void setAngles(Bangboo entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}