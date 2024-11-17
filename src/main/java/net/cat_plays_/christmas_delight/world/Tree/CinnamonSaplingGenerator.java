package net.cat_plays_.christmas_delight.world.Tree;

import net.cat_plays_.christmas_delight.world.feature.CinnamonConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import java.util.Optional;

public class CinnamonSaplingGenerator {
    public static final SaplingGenerator CinnamonSapling =
            new SaplingGenerator("cinnamontreesapling", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(CinnamonConfiguredFeatures.Cinnamon_Tree),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
