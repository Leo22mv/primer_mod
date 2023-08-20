package com.ejemplo.primer_mod;

import com.ejemplo.primer_mod.init.InitItems;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Primermod.MODID)
public class Primermod {
    public static final String MODID = "primer_mod";

    public Primermod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        InitItems.ITEMS.register(bus);
    }
}