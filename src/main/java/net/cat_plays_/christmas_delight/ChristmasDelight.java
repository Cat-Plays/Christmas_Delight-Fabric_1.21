package net.cat_plays_.christmas_delight;

import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.cat_plays_.christmas_delight.item.ModFood;
import net.cat_plays_.christmas_delight.item.ModFoodComponents;
import net.cat_plays_.christmas_delight.item.ModItems;
import net.cat_plays_.christmas_delight.util.ModBoatTypes;
import net.cat_plays_.christmas_delight.util.ModFlammableBlocks;
import net.cat_plays_.christmas_delight.util.ModStrippableBlocks;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChristmasDelight implements ModInitializer {
	public static final String MOD_ID = "christmas-delight";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, Identifier.of(MOD_ID, "group"));

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
//		ModItemGroups.registerItemGroups();

		ModBoatTypes.registerModBoatTypes();
		ModFlammableBlocks.registerFlammableBlocks();
		ModStrippableBlocks.registerStrippables();

		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemgroup.chritmas-delight.christmas_delight_items"))
				.icon(() -> new ItemStack(ModItems.Cinnamon))
				.build());

		ModFoodComponents.registerItems();
		ItemGroupEvents.modifyEntriesEvent(ChristmasDelight.GROUP).register(entries -> {
			entries.add(ModBlocks.Cinnamon_Log);
			entries.add(ModBlocks.Cinnamon_Wood);
			entries.add(ModBlocks.Stripped_Cinnamon_Log);
			entries.add(ModBlocks.Stripped_Cinnamon_Wood);
			entries.add(ModBlocks.Cinnamon_Leaves);
			entries.add(ModBlocks.Cinnamon_Planks);
			entries.add(ModBlocks.Cinnamon_Stairs);
			entries.add(ModBlocks.Cinnamon_Slab);
			entries.add(ModBlocks.Cinnamon_Fence);
			entries.add(ModBlocks.Cinnamon_Fence_Gate);
			entries.add(ModBlocks.Cinnamon_Door);
			entries.add(ModBlocks.Cinnamon_Trapdoor);
			entries.add(ModBlocks.Cinnamon_Pressure_Plate);
			entries.add(ModBlocks.Cinnamon_Button);
			entries.add(ModBlocks.Cinnamon_Sign);
			entries.add(ModBlocks.Cinnamon_Hanging_Sign);
			entries.add(ModItems.Cinnamon_Boat);
			entries.add(ModItems.Cinnamon_Chest_Boat);
			entries.add(ModBlocks.Cinnamon_Sapling);
			entries.add(ModItems.Cinnamon);
		});
	}
}