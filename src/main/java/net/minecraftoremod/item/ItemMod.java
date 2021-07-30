package net.minecraftoremod.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber
public class ItemMod {

    //BASIC ITEMS
    public static final Item blueingot = ItemUtils.buildbasicItem("blueingot", ItemGroup.MISC);
    public static final Item rubyingot = ItemUtils.buildbasicItem("rubyingot", ItemGroup.MISC);

    //FOODS


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {

        //BASIC ITEMS
        event.getRegistry().register(blueingot);
        event.getRegistry().register(CustomArmorItem.HELM);
        event.getRegistry().register(rubyingot)
        // ITEMS

        // TOOLS

        // FOOD

        // ARMOR

    }
}
