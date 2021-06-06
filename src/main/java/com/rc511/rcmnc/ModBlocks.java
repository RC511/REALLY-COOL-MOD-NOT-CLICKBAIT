package com.rc511.rcmnc;

import java.util.Random;

import javax.annotation.Nullable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.state.StateContainer;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModBlocks {
	public static void init() {}
	
//	private BlockState defaultBlockState;
//	protected final StateContainer<Block, BlockState> stateDefinition;
//	
//	public ModBlocks(AbstractBlock.Properties p_i48440_1_) {
//	      super();
//	      StateContainer.Builder<Block, BlockState> builder = new StateContainer.Builder<>(this);
//	      this.createBlockStateDefinition(builder);
//	      this.harvestLevel = p_i48440_1_.getHarvestLevel();
//	      this.harvestTool = p_i48440_1_.getHarvestTool();
//	      this.stateDefinition = builder.create(Block::defaultBlockState, BlockState::new);
//	      this.registerDefaultState(this.stateDefinition.any());
//	   }
//	
//	protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> p_206840_1_) {
//	}
//
//	public StateContainer<Block, BlockState> getStateDefinition() {
//	   return this.stateDefinition;
//	}
//	
//	protected Random RANDOM = new Random();
//	private net.minecraftforge.common.ToolType harvestTool;
//	private int harvestLevel;
//
//	@Nullable
//	public net.minecraftforge.common.ToolType getHarvestTool(BlockState state) {
//	   return harvestTool; //TODO: RE-Evaluate
//	}
//
//	public int getHarvestLevel(BlockState state) {
//	  return harvestLevel; //TODO: RE-Evaluate
//	}
//	
//	protected final void registerDefaultState(BlockState defaultBS) {
//	      this.defaultBlockState = defaultBS;
//	  }
//	
//	public final BlockState defaultBlockState() {
//	      return this.defaultBlockState;
//	   }
	
	public static final RegistryObject<Block> REALLYCOOLBLOCKNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolblocknotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.METAL)
			.strength(10.0f, 20.0f)
			.sound(SoundType.METAL)
			.harvestLevel(3)
			.harvestTool(ToolType.PICKAXE)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLTERRAINNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolterrainnotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.DIRT)
			.harvestTool(ToolType.SHOVEL)
			.sound(SoundType.GRAVEL)
			.strength(1.0f, 1.0f)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLSTONENOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolstonenotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.STONE)
			.harvestTool(ToolType.PICKAXE)
			.requiresCorrectToolForDrops()
			.sound(SoundType.STONE)
			.strength(2.0f, 7.0f)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLORENOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolorenotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.STONE)
			.harvestTool(ToolType.PICKAXE)
			.harvestLevel(2)
			.requiresCorrectToolForDrops()
			.sound(SoundType.STONE)
			.strength(4.0f, 5.0f)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLLOGNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoollognotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.WOOD)
			.harvestTool(ToolType.AXE)
			.sound(SoundType.WOOD)
			.strength(3.0f, 3.0f)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLPLANKSNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolplanksnotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.WOOD)
			.harvestTool(ToolType.AXE)
			.sound(SoundType.WOOD)
			.strength(3.0f, 4.0f)
			)
	);
	
	public static final RegistryObject<Block> REALLYCOOLSAPLINGNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolsaplingnotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.PLANT)
			.instabreak()
			.noCollission()
			.sound(SoundType.GRASS)
			.noOcclusion()
			.strength(0.0f, 0.0f))
	);
	
	public static final RegistryObject<Block> REALLYCOOLLEAVESNOTCLICKBAIT = RegistryHandler.BLOCKS.register("reallycoolleavesnotclickbait", () ->
	new Block(AbstractBlock.Properties
			.of(Material.LEAVES)
			.sound(SoundType.GRASS)
			.strength(0.2f, 0.2f)
			.harvestTool(ToolType.HOE))
	);
	
	
	
}