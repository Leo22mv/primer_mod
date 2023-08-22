package com.ejemplo.primer_mod.events;

import net.minecraft.network.chat.Component;
import net.minecraftforge.event.brewing.PotionBrewEvent;
import net.minecraftforge.event.entity.living.EnderManAngerEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class Events {
    @SubscribeEvent
    public void getDrunk(PlayerInteractEvent event) {
        // String mensaje = "Tomaste: " + event.getItemStack();
        // System.out.println(mensaje);
        if (event.getItemStack().toString().contains("birra")) {
            event.getEntity().displayClientMessage(Component.literal("Aflojale al vidrio"), false);
            System.out.println(event.toString());
        }
    }

    @SubscribeEvent
    public void pickItem(EntityItemPickupEvent event) {
        String mensaje = "Agarraste: " + event.getItem().getName().getString();
        event.getEntity().displayClientMessage(Component.literal(mensaje), false);
    }

    @SubscribeEvent
    public void endermanAnger(EnderManAngerEvent event) {
        String mensaje = "Te vieron gato";
        event.getPlayer().displayClientMessage(Component.literal(mensaje), false);
    }
}
