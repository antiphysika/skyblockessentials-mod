// SPDX-License-Identifier: Apache-2.0
//

package io.github.antiphysika.mods.skyblockessentials.item;

import io.github.antiphysika.mods.skyblockessentials.SBEMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeModeTabs
{
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODS_TABS =
    DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SBEMod.MOD_ID);

  public static final RegistryObject<CreativeModeTab> SBE_CREATIVE_MODE_TAB =
    CREATIVE_MODS_TABS.register("ap_sbe_creative_tab", () ->
      CreativeModeTab.builder()
        .icon(() -> new ItemStack(MiniStoneItems.MINI_STONE.get()))
        .title(Component.translatable("creative_mode_tab.ap_skyblock_essentials"))
        .displayItems((params, output) -> {
          output.accept(MiniStoneItems.MINI_STONE.get());
          output.accept(MiniStoneItems.MINI_ANDESITE.get());
          output.accept(MiniStoneItems.MINI_DIORITE.get());
          output.accept(MiniStoneItems.MINI_GRANITE.get());
          output.accept(MiniStoneItems.MINI_DEEPSLATE.get());
          output.accept(MiniStoneItems.MINI_TUFF.get());
          output.accept(MiniStoneItems.MINI_CALCITE.get());
          output.accept(MiniStoneItems.MINI_DRIPSTONE.get());
          output.accept(MiniStoneItems.MINI_NETHERRACK.get());
          output.accept(MiniStoneItems.MINI_BASALT.get());
          output.accept(MiniStoneItems.MINI_BLACKSTONE.get());
          output.accept(MiniStoneItems.MINI_END_STONE.get());
          output.accept(ToolItems.WOODEN_CONJURING_STICK.get());
        }).build()
    );

  public static void register (IEventBus bus)
  {
    CREATIVE_MODS_TABS.register(bus);
  }
}

// vim: ts=2 sw=2 et fdm=marker :
//
