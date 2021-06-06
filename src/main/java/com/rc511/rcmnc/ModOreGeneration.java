package com.rc511.rcmnc;

import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class ModOreGeneration {
//	public static void generateOres(final BiomeLoadingEvent event) {
//		if(event.getName().equals(ModBiomes.REALLYCOOLBIOMENOTCLICKBAIT.get().getRegistryName())) {
//			generateOre(event.getGeneration(),
//					(OreFeatureConfig) ModFeature.ORE_REALLYCOOL.config(), 100, 10);
//		}
//	}
//	
//	private static void generateOre(BiomeGenerationSettingsBuilder settings, OreFeatureConfig oreReallycool, int maxHeight, int amount) {
//		settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,
//				Feature.ORE.configured(oreReallycool)
//					.range(maxHeight)
//					.squared()
//					.count(amount));
//	}
}
