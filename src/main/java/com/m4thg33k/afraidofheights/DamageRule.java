package com.m4thg33k.afraidofheights;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.BlockPos;

public class DamageRule {
    public void damagePlayer(PlayerEntity player){
        DamageSource source = ModDamageSources.DEFAULT;
        float amount = 1.0f;
        player.attackEntityFrom(source, amount);
    }

    public boolean isPlayerInAreaOfEffect(PlayerEntity player){
        BlockPos blockPos = player.getPosition();

        return blockPos.getY() >= 64;
    }
}
