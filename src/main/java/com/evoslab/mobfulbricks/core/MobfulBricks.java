package com.evoslab.mobfulbricks.core;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.evoslab.mobfulbricks.core.registry.util.MBRegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(MobfulBricks.MOD_ID)
public class MobfulBricks {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "mobful_bricks";
    public static final MBRegistryHelper REGISTRY_HELPER = new MBRegistryHelper(MOD_ID);
    public static MobfulBricks instance;
    
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    public MobfulBricks() {
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::doClientStuff);
        instance = this;

        REGISTRY_HELPER.getDeferredItemRegister().register(modEventBus);
        REGISTRY_HELPER.getDeferredBlockRegister().register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}