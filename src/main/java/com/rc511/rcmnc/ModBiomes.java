package com.rc511.rcmnc;

import java.util.Optional;
import java.util.function.Supplier;

import net.minecraft.particles.IParticleData;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.BiomeAmbience;
import net.minecraft.world.biome.BiomeAmbience.GrassColorModifier;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.GenerationStage.Carving;
import net.minecraft.world.gen.carver.ConfiguredCarvers;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ModSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.ParticleEffectAmbience;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBiomes {
	public static void init() {}
	
//	public static final RegistryObject<Biome> REALLYCOOLBIOMENOTCLICKBAIT = RegistryHandler.BIOMES.register("reallycoolbiomenotclickbait", () ->
//	null
////	new Biome.Builder()
////			.biomeCategory(Biome.Category.NONE)
////			.depth(0.125f)
////			.downfall(0.25f)
////			.generationSettings(
////					new BiomeGenerationSettings.Builder()
////					.surfaceBuilder(ModSurfaceBuilder.REALLYCOOL)
////					.addCarver(Carving.LIQUID, ConfiguredCarvers.CANYON)
////					.addCarver(Carving.AIR, ConfiguredCarvers.CANYON)
////					.addCarver(Carving.LIQUID, ConfiguredCarvers.CAVE)
////					.addCarver(Carving.AIR, ConfiguredCarvers.CAVE)
////					.build())
////			.build()
////	new Biome(
////			new Biome.Climate(Biome.RainType.NONE, 0.15f, Biome.TemperatureModifier.NONE, 0.25f),
////			Biome.Category.NONE, 
////			1.0f, 1.0f, 
////			new BiomeAmbience.Builder()
////					.fogColor(1)
////					.waterColor(1)
////					.waterFogColor(1)
////					.skyColor(1)
////					.grassColorModifier(GrassColorModifier.NONE)
////					.build(),
////			new BiomeGenerationSettings.Builder()
////					.surfaceBuilder((Supplier<ConfiguredSurfaceBuilder<?>>) ModSurfaceBuilder.REALLYCOOL)
////					.addCarver(Carving.LIQUID, ConfiguredCarvers.CANYON)
////					.addCarver(Carving.AIR, ConfiguredCarvers.CANYON)
////					.addCarver(Carving.LIQUID, ConfiguredCarvers.CAVE)
////					.addCarver(Carving.AIR, ConfiguredCarvers.CAVE)
////					.build(),
////			new MobSpawnInfo.Builder()
////					
////					.build()
////			)
//	);

}
