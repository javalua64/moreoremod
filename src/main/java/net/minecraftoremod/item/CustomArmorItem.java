package net.minecraftoremod.item;

import net.minecraft.entity.Entity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftoremod.BaseMod;

public class CustomArmorItem extends ArmorItem {

    private static Properties properties = new Properties().group(ItemGroup.COMBAT);
    public CustomArmorItem(IArmorMaterial material, EquipmentSlotType type, Properties properties) {
        super(material, type, properties);
    }
    public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        if(slot == EquipmentSlotType.LEGS){
            return "examplemod:textures/models/armor/custom_armor_layer_2.png";
        }else{
            return "examplemod:textures/models/armor/custom_armor_layer_1.png";
        }
    }
    public static Item HELM = new CustomArmorItem(ArmorMaterial.IRON, EquipmentSlotType.HEAD, properties).setRegistryName(BaseMod.MODID,"customhelm");
}
//test
