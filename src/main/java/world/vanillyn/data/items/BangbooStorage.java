package world.vanillyn.data.items;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.nbt.NbtElement;
import net.minecraft.registry.RegistryWrapper;
import org.ladysnake.cca.api.v3.component.Component;

public class BangbooStorage implements Component {
    private NbtElement bangboo_storage;

    @Override
    public void readFromNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        if (tag.contains("bangboo_storage")) {
            bangboo_storage = tag.get("bangboo_storage");
        }
    }

    @Override
    public void writeToNbt(NbtCompound tag, RegistryWrapper.WrapperLookup registryLookup) {
        tag.put("bangboo_storage", this.bangboo_storage);
    }
}
