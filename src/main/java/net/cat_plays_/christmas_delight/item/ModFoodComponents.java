package net.cat_plays_.christmas_delight.item;

import net.cat_plays_.christmas_delight.ChristmasDelight;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import vectorwing.farmersdelight.common.item.ConsumableItem;
import vectorwing.farmersdelight.common.registry.ModEffects;

public class ModFoodComponents {

    public static void registerItems() {
        ModFood.Eggnog = consumableEffect("eggnog", 6, 0.375f, StatusEffects.SPEED, 40, 4, 16,Items.GLASS_BOTTLE, 1.0f);

        ModFood.Logcake = consumable("logcake", 20, 0.0f, 16, Items.BOWL);

        ModFood.Lamington = consumable("lamington", 5, 0.375f, 16, Items.BOWL);

        ModFood.Candy_Cane = consumableEffectSnack("candy_cane", 1, 0.0f, StatusEffects.HASTE, 5400, 1, 64, null, 0.1f);

        ModFood.Chicken_With_Mlinci = consumableEffect("chicken_with_mlinci", 14, 0.7f, ModEffects.NOURISHMENT, 6000, 0, 16, Items.BOWL, 1.0f);

        ModFood.Makos_Bejgli = consumable("makos_bejgli", 6, 0.33f, 16, Items.BOWL);

        ModFood.Hot_Chocolate = consumableEffect("hot_chocolate", 6, 0.375f, StatusEffects.SPEED, 40, 4, 16,Items.GLASS_BOTTLE, 1.0f);

        ModFood.Christmas_Pudding = consumableEffect("christmas_pudding", 7, 0.45f, ModEffects.COMFORT, 2400, 0, 64, null, 1.0f);

        ModFood.Burek = consumableEffect("burek", 8, 0.475f, ModEffects.NOURISHMENT, 1200, 0,64, null, 1.0f);

        ModFood.Fake_Burek = consumableEffect("fake_burek", 6, 0.35f, ModEffects.NOURISHMENT, 800, 0, 64, null, 1.0f);

        ModFood.Wafer = consumableSnack("wafer", 2, 0.1f, 64, null);

        ModFood.Vanillekipferl = consumableSnack("vanillekipferl", 3, 0.225f, 64, null);

        ModFood.Cheese_Yogurt_With_Berries = consumable("cheese_yogurt", 8, 0.375f, 16, Items.GLASS_BOTTLE);

        ModFood.Cevapi_With_Lepinja = consumableEffect("cevapi_with_lepinja", 15, 0.85f, ModEffects.NOURISHMENT, 6000, 0,16, Items.BOWL, 1.0f);

        ModFood.Fritule = consumableSnack("fritule", 5, 0.275f, 64, null);

        //Gingerbreads
        ModFood.Gingerbread_Dough = consumableEffect("gingerbread_dough", 3, 0.12f, StatusEffects.POISON, 200, 1, 64, null, 0.33f);
        ModFood.Baked_Gingerbread_Dough = consumable("baked_gingerbread_dough", 3, 0.2f, 64, null);

        ModFood.Gingerbread_Star = consumableSnack("gingerbread_star", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Tree = consumableSnack("gingerbread_tree", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Snowflake = consumableSnack("gingerbread_snowflake", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Ornament = consumableSnack("gingerbread_ornament", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Iven_Kosteric = consumableSnack("gingerbread_iven", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Heart = consumableSnack("gingerbread_heart", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Man = consumableSnack("gingerbread_man", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Angel = consumableSnack("gingerbread_angel", 3, 0.2f, 64, null);
        ModFood.Gingerbread_Zli_Pacof_Marko = consumableSnack("gingerbread_zli_pacof_marko", 3, 0.2f, 64, null);
    }

    private static Item consumable(String name, int nutrition, float saturation, int maxCount, Item remainder) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name),
                new ConsumableItem(new Item.Settings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .build()),
                        false, false));
        ItemGroupEvents.modifyEntriesEvent(ChristmasDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }

    private static Item consumableEffect(String name, int nutrition, float saturation, RegistryEntry<StatusEffect> effect, int duration, int amplifier, int maxCount, Item remainder, float chance) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name),
                new ConsumableItem(new Item.Settings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(effect, duration, amplifier), chance)
                                .build()),
                        true, false));
        ItemGroupEvents.modifyEntriesEvent(ChristmasDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }


    private static Item consumableSnack(String name, int nutrition, float saturation, int maxCount, Item remainder) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name),
                new ConsumableItem(new Item.Settings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .snack()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .build()),
                        false, false));
        ItemGroupEvents.modifyEntriesEvent(ChristmasDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }


    private static Item consumableEffectSnack(String name, int nutrition, float saturation, RegistryEntry<StatusEffect> effect, int duration, int amplifier, int maxCount, Item remainder, float chance) {
        Item item = Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name),
                new ConsumableItem(new Item.Settings()
                        .recipeRemainder(remainder)
                        .maxCount(maxCount)
                        .food(new FoodComponent.Builder()
                                .alwaysEdible()
                                .snack()
                                .nutrition(nutrition)
                                .saturationModifier(saturation)
                                .statusEffect(new StatusEffectInstance(effect, duration, amplifier), chance)
                                .build()),
                        true, false));
        ItemGroupEvents.modifyEntriesEvent(ChristmasDelight.GROUP).register(entries -> entries.add(item));
        return item;
    }
}