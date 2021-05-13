package com.rc511.rcmnc;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	public static void load() {}
	
	public static final RegistryObject<Block> REALLYCOOLBLOCKNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolblocknotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.METAL)
			.strength(10.0f, 20.0f)
			.sound(SoundType.METAL)
			.harvestLevel(3)
			.harvestTool(ToolType.PICKAXE)
			)
	);
}