package com.ejemplo.primer_mod.init;

import java.util.function.Supplier;

import com.ejemplo.primer_mod.Primermod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.level.block.Block;
// import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.RegistryObject;

public class InitBlocks {

    public static final DeferredRegister<Block> BLOCKS =
        DeferredRegister.create(ForgeRegistries.BLOCKS, Primermod.MODID);

    public static final RegistryObject<Block> CAJON_BLOCK = register(
        "cajon_block",
        () -> new Block(BlockBehaviour.Properties.of(Material.DIRT).friction(0.98f)),
        new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS));

    // public static final RegistryObject<Block> 

    private static <T extends Block> RegistryObject<T> register(
            String name,
            Supplier<T> supplier,
            Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        InitItems.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

    // private static RegistryObject<Block> register(String name, Supplier<T> supplier, Properties tab) {
    //     return null;
    // }
    
}


