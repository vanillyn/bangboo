package world.vanillyn.data.player;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper;
import org.ladysnake.cca.api.v3.component.sync.AutoSyncedComponent;

public class Dennies implements AutoSyncedComponent {
    private final PlayerEntity player;
    private int dennies;

    public Dennies(PlayerEntity player) {
        this.player = player;
        this.dennies = 0;
    }

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        if (tag.contains("dennies")) {
            dennies = tag.getInt("dennies");
        }
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.putInt("dennies", this.dennies);
    }
}
