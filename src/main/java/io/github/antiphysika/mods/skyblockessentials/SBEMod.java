// io.github.antiphysika.mods.skyblockessentials.SBEMod
//
// SPDX-License-Identifier: Apache-2.0
//

package io.github.antiphysika.mods.skyblockessentials;

import com.mojang.logging.LogUtils;

import io.github.antiphysika.mods.skyblockessentials.item.MiniStoneItems;
import io.github.antiphysika.mods.skyblockessentials.item.CreativeModeTabs;
import io.github.antiphysika.mods.skyblockessentials.item.ToolItems;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.slf4j.Logger;

@Mod(SBEMod.MOD_ID)
public class SBEMod
{
  public static final String MOD_ID = "ap_skyblock_essentials";

  private static final Logger LOGGER = LogUtils.getLogger();

  public SBEMod ()
  {
    // Get SBE's mod event bus
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    // Register mini stone items
    MiniStoneItems.register(modEventBus);

    // Register tool items
    ToolItems.register(modEventBus);

    // Register our creative mode tab
    CreativeModeTabs.register(modEventBus);

    // Wire up our common initialisation method
    modEventBus.addListener(this::commonSetup);

    // Register mod with the Forge event bus
    MinecraftForge.EVENT_BUS.register(this);
  }

  private void commonSetup (final FMLCommonSetupEvent event)
  {
    LOGGER.info("In SBEMod.commonSetup()");
  }

  private void addCreative (BuildCreativeModeTabContentsEvent event)
  {
    LOGGER.info("In SBEMod.addCreative()");

    if (event.getTabKey() == net.minecraft.world.item.CreativeModeTabs.INGREDIENTS)
    {
      event.accept(MiniStoneItems.MINI_STONE);
      event.accept(MiniStoneItems.MINI_ANDESITE);
      event.accept(MiniStoneItems.MINI_DIORITE);
      event.accept(MiniStoneItems.MINI_GRANITE);
      event.accept(MiniStoneItems.MINI_DEEPSLATE);
      event.accept(MiniStoneItems.MINI_TUFF);
      event.accept(MiniStoneItems.MINI_CALCITE);
      event.accept(MiniStoneItems.MINI_DRIPSTONE);
      event.accept(MiniStoneItems.MINI_NETHERRACK);
      event.accept(MiniStoneItems.MINI_BASALT);
      event.accept(MiniStoneItems.MINI_BLACKSTONE);
      event.accept(MiniStoneItems.MINI_END_STONE);
    }
  }

  @SubscribeEvent
  public void onServerStarting (ServerStartingEvent event)
  {
    LOGGER.info("In SBEMod.onServerStarting()");
  }

  @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents
  {
    @SubscribeEvent
    public static void onClientSetup (FMLClientSetupEvent event)
    {
      LOGGER.info("SBEMod: In ClientModEvents#onClientSetup()");
    }
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :