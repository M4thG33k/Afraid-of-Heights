package com.m4thg33k.afraidofheights.EventHandlers;

import com.m4thg33k.afraidofheights.DamageRule;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PlayerEventHandler {
    private static final Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void playerTick(TickEvent.PlayerTickEvent playerTickEvent) {
        if (playerTickEvent.side.isServer() && playerTickEvent.player.getEntityWorld().getGameTime() % 20 == 0) {
            LOGGER.info("Ticking player {} in dimension {}.", playerTickEvent.player.getUniqueID().toString(), playerTickEvent.player.getEntityWorld().getDimension().getType().toString());
            DamageRule rule = new DamageRule();
            PlayerEntity playerEntity = playerTickEvent.player;
            if (rule.isPlayerInAreaOfEffect(playerEntity)) {
                rule.damagePlayer(playerTickEvent.player);
            }
        }
    }
}
