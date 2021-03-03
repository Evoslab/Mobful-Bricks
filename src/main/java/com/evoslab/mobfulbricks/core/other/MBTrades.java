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
	
	public static final int EMERALDS = 8;
	public static final int BLOCKS = 32;

	@SubscribeEvent
	public static void onWandererTradesEvent(final WandererTradesEvent event) {
		TradeUtil.addWandererTrades(event,
				new AbnormalsTrade(EMERALDS, MBBlocks.BEE_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.BLAZE_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.CARMEN_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.HOGLIN_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.PANDA_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.POLAR_BEAR_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.SPUD_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.STEVE_BRICKS.get().asItem(), BLOCKS, 16, 5),
				new AbnormalsTrade(EMERALDS, MBBlocks.STRIDER_BRICKS.get().asItem(), BLOCKS, 16, 5));
		
		TradeUtil.addCompatWandererTrades(event, MBMods.ENDERGETIC_EXPANSION,
				new AbnormalsTrade(EMERALDS, MBBlocks.BOOFLO_BRICKS.get().asItem(), BLOCKS, 16, 5));
		
		TradeUtil.addCompatWandererTrades(event, MBMods.ENVIRONMENTAL,
				new AbnormalsTrade(EMERALDS, MBBlocks.SLABFISH_BRICKS.get().asItem(), BLOCKS, 16, 5));
	}
	
}
