package com.evoslab.mobfulbricks.core.registry;

import com.evoslab.mobfulbricks.core.MobfulBricks;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = MobfulBricks.MOD_ID, bus = Bus.MOD)
public class MBItems {
	
	public static final ItemSubRegistryHelper HELPER = MobfulBricks.REGISTRY_HELPER.getItemSubHelper();
	
}
