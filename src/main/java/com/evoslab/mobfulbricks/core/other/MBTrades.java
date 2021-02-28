package com.evoslab.mobfulbricks.core.other;

import com.evoslab.mobfulbricks.core.MobfulBricks;
import com.evoslab.mobfulbricks.core.registry.MBBlocks;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil.AbnormalsTrade;

import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MobfulBricks.MOD_ID)
public class MBTrades {
	
	public static final int EMERALDS = 4;
	public static final int BLOCKS = 16;

	@SubscribeEvent
	public static void onWandererTradesEvent(final WandererTradesEvent event) {
		TradeUtil.addWandererTrades(event,
				new AbnormalsTrade(EMERALDS, MBBlocks.BEE_BRICKS.get().asItem(), BLOCKS, 16, 5));
	}
	
}
