package com.idtech.item;

import com.idtech.BaseMod;
import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.SoundEvents;

public class CustomArmorItem extends ArmorItem {

    private static Properties properties = new Properties().group(ItemGroup.COMBAT);
    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType type, Properties properties) {
        super(material, type, properties);
    }
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if(false){
            return "dsadsa";
        }else{
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }
    }
    public static IArmorMaterial customMaterial = ItemUtils.buildArmorMaterial("emerald", 1000000, new int[]{5,8,6,4}, 200, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 897886, 0.99f, "minecraft:planks");
    public static Item HELM = new CustomArmorItem(customMaterial, EquipmentSlotType.HEAD, properties).setRegistryName(BaseMod.MODID,"emeraldhelm");
}
