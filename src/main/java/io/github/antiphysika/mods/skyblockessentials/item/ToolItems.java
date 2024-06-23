// SPDX-License-Identifier: Apache-2.0
//

package io.github.antiphysika.mods.skyblockessentials.item;

import io.github.antiphysika.mods.skyblockessentials.SBEMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ToolItems
{
  public static final DeferredRegister<Item> TOOL_ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, SBEMod.MOD_ID);

  public static final RegistryObject<Item> WOODEN_CONJURING_STICK =
    TOOL_ITEMS.register("wooden_conjuring_stick", () -> new Item(new Item.Properties()));

  public static void register (IEventBus bus)
  {
    TOOL_ITEMS.register(bus);
  }
}

// vim: ts=2 sw=2 et fdm=marker :
//
