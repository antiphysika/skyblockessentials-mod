// io.github.antiphysika.mods.skyblockessentials.SBEMod
//
// SPDX-License-Identifier: Apache-2.0
//

package io.github.antiphysika.mods.skyblockessentials;

import com.mojang.logging.LogUtils;

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
    IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

    modEventBus.addListener(this::commonSetup);

    MinecraftForge.EVENT_BUS.register(this);
  }

  private void commonSetup (final FMLCommonSetupEvent event)
  {
  }

  private void addCreative (BuildCreativeModeTabContentsEvent event)
  {
  }

  @SubscribeEvent
  public void onServerStarting (ServerStartingEvent event)
  {
  }

  @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
  public static class ClientModEvents
  {
    @SubscribeEvent
    public static void onClientSetup (FMLClientSetupEvent event)
    {
    }
  }
}

//
// vim: ts=2 sw=2 et fdm=marker :
