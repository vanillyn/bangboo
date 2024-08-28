package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import world.vanillyn.BangbooMod;


public class Blankboo extends Bangboo {
    public Blankboo(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public BangbooType<?> type() {
        return null;
    }

    public Identifier getBangbooTexture() {
        return BangbooMod.id("textures/entity/bangboo/blankboo/blankboo.png");
    }
}
