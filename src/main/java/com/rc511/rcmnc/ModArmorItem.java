package com.rc511.rcmnc;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;

public class ModArmorItem extends ArmorItem {
	
	public ModArmorItem(IArmorMaterial ArmMat, EquipmentSlotType place, Properties props)
	{
		super(ArmMat, place, props);
	}
	
	@SuppressWarnings("unchecked")
	public <A extends BipedModel<?>> A getArmorModel(LivingEntity entityLiving, ItemStack stackItem, EquipmentSlotType typeSlot, A _default)
	{
		ModArmorModel model = new ModArmorModel(1.0f);
		
		model.Helmet.visible = typeSlot == EquipmentSlotType.HEAD;
        model.Chestplate.visible = typeSlot == EquipmentSlotType.CHEST;
        model.RightSleeve.visible = typeSlot == EquipmentSlotType.CHEST;
        model.LeftSleeve.visible = typeSlot == EquipmentSlotType.CHEST;
        model.RightLegging.visible = typeSlot == EquipmentSlotType.LEGS;
        model.LeftLegging.visible = typeSlot == EquipmentSlotType.LEGS;
        model.RightBoot.visible = typeSlot == EquipmentSlotType.FEET;
        model.LeftBoot.visible = typeSlot == EquipmentSlotType.FEET;
        
        model.young = _default.young;
        model.riding = _default.riding;
        model.crouching = _default.crouching;
        model.rightArmPose = _default.rightArmPose;
        model.leftArmPose = _default.leftArmPose;
        
        return (A) model;
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
