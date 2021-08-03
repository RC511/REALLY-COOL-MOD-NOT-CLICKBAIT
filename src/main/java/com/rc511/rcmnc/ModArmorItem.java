package com.rc511.rcmnc;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ModArmorItem extends ArmorItem {
	
	public ModArmorItem(IArmorMaterial ArmMat, EquipmentSlotType place, Properties props)
	{
		super(ArmMat, place, props);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type)
	{
		if (slot == EquipmentSlotType.LEGS)
		{
			return "rcmnc:textures/models/armor/reallycoolarmornotclickbait_layer_2.png";
		}
		else
		{
			return "rcmnc:textures/models/armor/reallycoolarmornotclickbait_layer_1.png";
		}
	}
	
}
