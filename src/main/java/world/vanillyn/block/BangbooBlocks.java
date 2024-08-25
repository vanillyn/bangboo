package world.vanillyn.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.BangbooMod;
import world.vanillyn.block.Block.Crt;

import static world.vanillyn.BangbooMod.LOGGER;
import static world.vanillyn.items.BangbooItems.BOOPON;

public class BangbooBlocks {
    public static final Block CRT = register(new Crt(AbstractBlock.Settings.create(), BOOPON), "crt", true);

    public static Block register(Block block, String name, boolean register) {
        if (register) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, BangbooMod.id(name), blockItem);
        }
        return Registry.register(Registries.BLOCK, BangbooMod.id(name), block);
    }

    public static void init() {
        LOGGER.info("Blocks Initialized!");
    }
}
