package world.vanillyn.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import world.vanillyn.BangbooMod;
import world.vanillyn.block.Block.Ore.DeepslateEther;
import world.vanillyn.block.Block.Ore.Ether;

import static net.minecraft.block.Blocks.DEEPSLATE_IRON_ORE;
import static net.minecraft.block.Blocks.IRON_ORE;
import static world.vanillyn.BangbooMod.LOGGER;

public class BangbooBlocks {
    public static final Block ETHER_ORE = register(new Ether(AbstractBlock.Settings.copy(IRON_ORE)), "ether_ore", true);
    public static final Block DEEPSLATE_ETHER_ORE = register(new DeepslateEther(AbstractBlock.Settings.copy(DEEPSLATE_IRON_ORE)), "deepslate_ether_ore", true);

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
