package net.cat_plays_.christmas_delight.util;

import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();

        registry.add(ModBlocks.Cinnamon_Log, 5, 5);
        registry.add(ModBlocks.Cinnamon_Wood, 5, 5);
        registry.add(ModBlocks.Stripped_Cinnamon_Log, 5, 5);
        registry.add(ModBlocks.Stripped_Cinnamon_Wood, 5, 5);
        registry.add(ModBlocks.Cinnamon_Sapling, 3, 6);
        registry.add(ModBlocks.Cinnamon_Leaves, 3, 6);

        registry.add(ModBlocks.Cinnamon_Planks, 5, 20);
        registry.add(ModBlocks.Cinnamon_Stairs, 5, 20);
        registry.add(ModBlocks.Cinnamon_Slab, 5, 20);
        registry.add(ModBlocks.Cinnamon_Fence, 5, 20);
        registry.add(ModBlocks.Cinnamon_Fence_Gate, 5, 20);
    }
}
