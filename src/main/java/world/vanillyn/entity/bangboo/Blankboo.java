package world.vanillyn.entity.bangboo;

import net.minecraft.entity.EntityType;
import net.minecraft.world.World;


public class Blankboo extends Bangboo {
    public Blankboo(EntityType<? extends Bangboo> entityType, World world) {
        super(entityType, world);
    }

    @Override
    public BangbooType<?> type() {
        return BangbooType.BLANKBOO;
    }

}
