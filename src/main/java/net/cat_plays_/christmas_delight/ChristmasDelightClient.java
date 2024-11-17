package net.cat_plays_.christmas_delight;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.cat_plays_.christmas_delight.block.ModBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.util.Identifier;

public class ChristmasDelightClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Cinnamon_Door, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Cinnamon_Trapdoor, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Cinnamon_Sapling, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.Cinnamon_Leaves, RenderLayer.getCutoutMipped());




        TerraformBoatClientHelper.registerModelLayers(id("cinnamon"), false);
    }
    private static Identifier id(String path) {
        return Identifier.of(ChristmasDelight.MOD_ID, path);
    }
}
