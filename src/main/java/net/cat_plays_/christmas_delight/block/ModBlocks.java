package net.cat_plays_.christmas_delight.block;

import net.cat_plays_.christmas_delight.ChristmasDelight;
import net.cat_plays_.christmas_delight.world.Tree.CinnamonSaplingGenerator;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.*;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.util.math.Direction;
import com.terraformersmc.terraform.sign.api.block.TerraformHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallHangingSignBlock;
import com.terraformersmc.terraform.sign.api.block.TerraformWallSignBlock;

public class ModBlocks {

    public static final BlockSetType CinnamonSet = new BlockSetType("cinnamon_set");


    public static final Block Cinnamon_Planks = registerBlock("cinnamon_planks",
            new Block(AbstractBlock.Settings.copy(Blocks.OAK_PLANKS)));
    public static final Block Cinnamon_Log = registerBlock("cinnamon_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
    public static final Block Cinnamon_Wood = registerBlock("cinnamon_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
    public static final Block Stripped_Cinnamon_Wood = registerBlock("stripped_cinnamon_wood",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final Block Stripped_Cinnamon_Log = registerBlock("stripped_cinnamon_log",
            new PillarBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG)));


    public static final Block Cinnamon_Stairs = registerBlock("cinnamon_stairs",
            new StairsBlock(ModBlocks.Cinnamon_Planks.getDefaultState(),
                    AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

    public static final Block Cinnamon_Slab = registerBlock("cinnamon_slab",
            new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_STAIRS)));

    public static final Block Cinnamon_Button = registerBlock("cinnamon_button",
            new ButtonBlock(BlockSetType.OAK, 20,
                    AbstractBlock.Settings.copy(Blocks.OAK_BUTTON)));

    public static final Block Cinnamon_Pressure_Plate = registerBlock("cinnamon_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_PRESSURE_PLATE)));

    public static final Block Cinnamon_Fence = registerBlock("cinnamon_fence",
            new FenceBlock(AbstractBlock.Settings.copy(Blocks.OAK_FENCE)));

    public static final Block Cinnamon_Fence_Gate = registerBlock("cinnamon_fence_gate",
            new FenceGateBlock(WoodType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_FENCE_GATE)));

    public static final Block Cinnamon_Door = registerBlock("cinnamon_door",
            new DoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_DOOR)));

    public static final Block Cinnamon_Trapdoor = registerBlock("cinnamon_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.copy(Blocks.OAK_TRAPDOOR)));




    public static final TerraformSignBlock Cinnamon_Sign = registerSignBlock("cinnamon_sign", new TerraformSignBlock(
           id("entity/signs/cinnamon"), AbstractBlock.Settings.copy(Blocks.OAK_SIGN).mapColor(MapColor.ORANGE)));

    public static final TerraformWallSignBlock Cinnamon_Wall_Sign = registerWallSignBlock("cinnamon_wall_sign",
            new TerraformWallSignBlock(id("entity/signs/cinnamon"),
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_SIGN).dropsLike(Cinnamon_Sign)
                            .mapColor(MapColor.ORANGE)));

    public static final TerraformHangingSignBlock Cinnamon_Hanging_Sign = registerHangingSignBlock(
            "cinnamon_hanging_sign", new TerraformHangingSignBlock(
                    id("entity/signs/hanging/cinnamon"),
                    id("textures/gui/hanging_signs/cinnamon"),
                    AbstractBlock.Settings.copy(Blocks.OAK_HANGING_SIGN).mapColor(MapColor.ORANGE)));

    public static final TerraformWallHangingSignBlock Cinnamon_Wall_Hanging_Sign = registerWallHangingSignBlock(
            "cinnamon_wall_hanging_sign", new TerraformWallHangingSignBlock(
                    id("entity/signs/hanging/cinnamon"),
                    id("textures/gui/hanging_signs/cinnamon"),
                    AbstractBlock.Settings.copy(Blocks.OAK_WALL_HANGING_SIGN).dropsLike(Cinnamon_Hanging_Sign)
                            .mapColor(MapColor.ORANGE)));

    public static final Block Cinnamon_Sapling = registerBlock(
            "cinnamon_sapling",new SaplingBlock(CinnamonSaplingGenerator.CinnamonSapling,
                    AbstractBlock.Settings.copy(Blocks.OAK_SAPLING)));

    public static final Block Cinnamon_Leaves = registerBlock(
            "cinnamon_leaves", new LeavesBlock(
                    AbstractBlock.Settings.copy(Blocks.OAK_LEAVES).mapColor(MapColor.GREEN)));



    private static TerraformSignBlock registerSignBlock(String name, TerraformSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformWallSignBlock registerWallSignBlock(String name, TerraformWallSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformHangingSignBlock registerHangingSignBlock(String name, TerraformHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }

    private static TerraformWallHangingSignBlock registerWallHangingSignBlock(String name, TerraformWallHangingSignBlock block) {
        return Registry.register(Registries.BLOCK, id(name), block);
    }



    private static  Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ChristmasDelight.MOD_ID, name), block);
    }
    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(ChristmasDelight.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        ChristmasDelight.LOGGER.info("Registering Mod Blocks for " + ChristmasDelight.MOD_ID);
    }

    private static Identifier id(String path) {
        return Identifier.of(ChristmasDelight.MOD_ID, path);
    }
}
