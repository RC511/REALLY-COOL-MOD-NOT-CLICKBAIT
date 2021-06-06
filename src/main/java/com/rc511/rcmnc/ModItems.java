package com.rc511.rcmnc;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
	public static void init() {}
	
	public static final RegistryObject<Item> REALLYCOOLITEMNOTCLICKBAIT = RegistryHandler.ITEMS.register("reallycoolitemnotclickbait", () ->
	new Item(new Item.Properties()
			.tab(ItemGroup.TAB_MISC)
			)
	);

	public static final RegistryObject<Item> RCBNC_ITEM = RegistryHandler.ITEMS.register("reallycoolblocknotclickbait", () ->
	new BlockItem(
			ModBlocks.REALLYCOOLBLOCKNOTCLICKBAIT.get(),
			new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)
			)
	);
	
	public static final RegistryObject<PickaxeItem> REALLYCOOLTHINGAMAJIGNOTCLICKBAIT = RegistryHandler.ITEMS.register(
			"reallycoolthingamajignotclickbait", () ->
			new PickaxeItem(ModItemTier.REALLYCOOLMATERIALNOTCLICKBAIT, 10, -1.8f, (new Item.Properties())
					.tab(ItemGroup.TAB_TOOLS)
					.addToolType(ToolType.PICKAXE, 5)
					.addToolType(ToolType.AXE, 5)
					.addToolType(ToolType.HOE, 5)
					.addToolType(ToolType.SHOVEL, 5)
					)
			);
	
	public static final RegistryObject<ArmorItem> REALLYCOOLHELMETNOTCLICKBAIT = RegistryHandler.ITEMS.register(
			"reallycoolhelmetnotclickbait", () ->
			new ModArmorItem(ModArmorMaterial.REALLYCOOLMATERIALNOTCLICKBAIT, EquipmentSlotType.HEAD, (new Item.Properties())
					.tab(ItemGroup.TAB_COMBAT)
					.fireResistant()));
	
	public static final RegistryObject<ArmorItem> REALLYCOOLCHESTPLATENOTCLICKBAIT = RegistryHandler.ITEMS.register(
			"reallycoolchestplatenotclickbait", () ->
			new ModArmorItem(ModArmorMaterial.REALLYCOOLMATERIALNOTCLICKBAIT, EquipmentSlotType.CHEST, (new Item.Properties())
					.tab(ItemGroup.TAB_COMBAT)
					.fireResistant()));
	
	public static final RegistryObject<ArmorItem> REALLYCOOLLEGGINGSNOTCLICKBAIT = RegistryHandler.ITEMS.register(
			"reallycoolleggingsnotclickbait", () ->
			new ModArmorItem(ModArmorMaterial.REALLYCOOLMATERIALNOTCLICKBAIT, EquipmentSlotType.LEGS, (new Item.Properties())
					.tab(ItemGroup.TAB_COMBAT)
					.fireResistant()));
	
	public static final RegistryObject<ArmorItem> REALLYCOOLBOOTSNOTCLICKBAIT = RegistryHandler.ITEMS.register(
			"reallycoolbootsnotclickbait", () ->
			new ModArmorItem(ModArmorMaterial.REALLYCOOLMATERIALNOTCLICKBAIT, EquipmentSlotType.FEET, (new Item.Properties())
					.tab(ItemGroup.TAB_COMBAT)
					.fireResistant()));
	
	public static final RegistryObject<Item> RCTNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolterrainnotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLTERRAINNOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> RCSNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolstonenotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLSTONENOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> RCONC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolorenotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLORENOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS)));
	
	public static final RegistryObject<Item> RCLNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoollognotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLLOGNOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS))
			);
	
	public static final RegistryObject<Item> RCWPNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolplanksnotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLPLANKSNOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_BUILDING_BLOCKS))
			);
	
	public static final RegistryObject<Item> RCSAPNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolsaplingnotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLSAPLINGNOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_DECORATIONS))
			);
	
	public static final RegistryObject<Item> RCLEAVESNC_ITEM = RegistryHandler.ITEMS.register(
			"reallycoolleavesnotclickbait", () ->
			new BlockItem(ModBlocks.REALLYCOOLLEAVESNOTCLICKBAIT.get(),
					new Item.Properties()
					.tab(ItemGroup.TAB_DECORATIONS))
			);
	
}
