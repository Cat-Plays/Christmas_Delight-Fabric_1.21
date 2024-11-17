package net.cat_plays_.christmas_delight.util;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.cat_plays_.christmas_delight.ChristmasDelight;
import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.cat_plays_.christmas_delight.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBoatTypes {
    public static final TerraformBoatType Cinnamon_Boat_Type = new TerraformBoatType.Builder()
            .item(ModItems.Cinnamon_Boat).chestItem(ModItems.Cinnamon_Chest_Boat).planks(ModBlocks.Cinnamon_Planks.asItem())
            .build();

    static {
        Registry.register(TerraformBoatTypeRegistry.INSTANCE, id("cinnamon"), Cinnamon_Boat_Type);
    }

    public static void registerModBoatTypes() {
        ChristmasDelight.LOGGER.info("Registering Mod Boat Types for " + ChristmasDelight.MOD_ID);
    }

    private static Identifier id(String path) {
        return Identifier.of(ChristmasDelight.MOD_ID, path);
    }
}
