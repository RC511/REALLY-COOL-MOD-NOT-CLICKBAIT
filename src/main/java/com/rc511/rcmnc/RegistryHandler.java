package com.rc511.rcmnc;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.Item;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.Features;
import net.minecraftforge.common.world.ForgeWorldType;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
	
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RCMNC.MODID);
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, RCMNC.MODID);
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, RCMNC.MODID);
	public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, RCMNC.MODID);
//	public static final DeferredRegister<> CONFIGS = DeferredRegister.create(ForgeRegistries., null)
//	public static final DeferredRegister<ChunkStatus> CHUNKSTATUSES = DeferredRegister.create(ForgeRegistries.CHUNK_STATUS, RCMNC.MODID);
//	public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, RCMNC.MODID);
//	public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(ForgeRegistries.FLUIDS, RCMNC.MODID);
//	public static final DeferredRegister<ForgeWorldType> WORLD_TYPES = DeferredRegister.create(ForgeRegistries.WORLD_TYPES, RCMNC.MODID);
	
	
	public static void init() {
		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BIOMES.register(FMLJavaModLoadingContext.get().getModEventBus());
		FEATURES.register(FMLJavaModLoadingContext.get().getModEventBus());
		ModItems.init();
		ModBlocks.init();
//		ModBiomes.init();
	}
}
