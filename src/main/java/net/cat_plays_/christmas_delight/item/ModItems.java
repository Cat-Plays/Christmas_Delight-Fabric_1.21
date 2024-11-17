package net.cat_plays_.christmas_delight.item;

import net.cat_plays_.christmas_delight.ChristmasDelight;
import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKey;
import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.impl.item.TerraformBoatItem;

import static com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry.createKey;

    public class ModItems {

        public static final Item Cinnamon = registerItem("cinnamon", new Item(new Item.Settings()));

        public static RegistryKey<TerraformBoatType> BOAT_KEY = createKey(id("cinnamon"));



        public static final Item Cinnamon_Boat = registerItem("cinnamon_boat",
                new TerraformBoatItem(BOAT_KEY,
                        false, new Item.Settings().maxCount(1)));
        public static final Item Cinnamon_Chest_Boat = registerItem("cinnamon_chest_boat",
                new TerraformBoatItem(BOAT_KEY,
                        true, new Item.Settings().maxCount(1)));
        public static final Item Cinnamon_Sign = registerItem("cinnamon_sign", new SignItem(
                new Item.Settings().maxCount(16), ModBlocks.Cinnamon_Sign, ModBlocks.Cinnamon_Wall_Sign));
        public static final Item Cinnamon_Hanging_Sign = registerItem("cinnamon_hanging_sign", new HangingSignItem(
                ModBlocks.Cinnamon_Hanging_Sign, ModBlocks.Cinnamon_Wall_Hanging_Sign, new Item.Settings().maxCount(16)));






        private static Item registerItem(String name, Item item){
            return Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name), item);
        }



        public static void registerModItems(){
            ChristmasDelight.LOGGER.info("Registering Mod Items for " + ChristmasDelight.MOD_ID);
        }
        private static Identifier id(String path) {
            return Identifier.of(ChristmasDelight.MOD_ID, path);
        }
    }
