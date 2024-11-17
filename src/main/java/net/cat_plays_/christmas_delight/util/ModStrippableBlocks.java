package net.cat_plays_.christmas_delight.util;

import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.Cinnamon_Log, ModBlocks.Stripped_Cinnamon_Log);
        StrippableBlockRegistry.register(ModBlocks.Cinnamon_Wood, ModBlocks.Stripped_Cinnamon_Wood);
    }
}
