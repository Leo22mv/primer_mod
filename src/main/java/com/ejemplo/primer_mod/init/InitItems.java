package com.ejemplo.primer_mod.init;

import com.ejemplo.primer_mod.Primermod;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PotionItem;
import net.minecraft.world.item.ThrowablePotionItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class InitItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(
        ForgeRegistries.ITEMS, Primermod.MODID
    );

    public static final RegistryObject<Item> BIRRA = ITEMS.register(
        "birra", () -> new PotionItem(new Item.Properties().tab(CreativeModeTab.TAB_MISC))
    );
}