package com.rc511.rcmnc;

import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.BlockMatchRuleTest;
import net.minecraft.world.gen.foliageplacer.FoliagePlacer;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fml.RegistryObject;

public class ModFeature {
//	public static final RegistryObject<Feature<?>> REALLYCOOL_ORE = RegistryHandler.FEATURES.register("reallycoolore", () ->
////	new OreFeatureConfig(new BlockMatchRuleTest(ModBlocks.REALLYCOOLSTONENOTCLICKBAIT.get()),
////			ModBlocks.REALLYCOOLORENOTCLICKBAIT.get().defaultBlockState(),
////			8)
//	null
//	);
	
//	public static final RegistryObject<Feature<BaseTreeFeatureConfig>> REALLYCOOL_TREE = RegistryHandler.FEATURES.register("reallycooltree", () ->
//	null
////	new BaseTreeFeatureConfig
//	);
//	public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> TREE_REALLYCOOL = register("tree_reallycool", Feature.TREE.configured(
////			new BaseTreeFeatureConfig
////					(
////					ModBlocks.REALLYCOOLLOGNOTCLICKBAIT.get().defaultBlockState(),
////					ModBlocks.REALLYCOOLLEAVESNOTCLICKBAIT.get().defaultBlockState(),
////					FoliagePlacer,
////					AbstractTrunkPlacer,
////					AbstractFeatureSizeType,
////					List<TreeDecorator> null,
////					0,
////					true,
////					HeightMap.Type
////					)
//			null
//			)
//			);
//	public static final ConfiguredFeature<?, ?> ORE_REALLYCOOL = register("ore_reallycool", Feature.ORE.configured(
//			new OreFeatureConfig(
//					new BlockMatchRuleTest(ModBlocks.REALLYCOOLSTONENOTCLICKBAIT.get()), 
//					ModBlocks.REALLYCOOLORENOTCLICKBAIT.get().defaultBlockState(), 
//					8)
//			)
//			);
//
//	private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
//		return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, RCMNC.MODID + ":" + name, configuredFeature);
//	}
}


//@SubscribeEvent(priority = EventPriority.HIGHEST)
//public static void gen(BiomeLoadingEvent event)
//{
//	BiomeGenerationSettingsBuilder generation = event.getGeneration();
//	
//	for (ConfiguredFeature<?, ?> ...))
//}