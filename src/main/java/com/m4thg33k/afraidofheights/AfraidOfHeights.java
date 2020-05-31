package com.m4thg33k.afraidofheights;

import com.m4thg33k.afraidofheights.EventHandlers.PlayerEventHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Constants.MOD_ID)
public class AfraidOfHeights {
    public AfraidOfHeights(){
        MinecraftForge.EVENT_BUS.register(PlayerEventHandler.class);
    }
}
