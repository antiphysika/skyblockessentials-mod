// SPDX-License-Identifier: Apache-2.0
//

package io.github.antiphysika.mods.skyblockessentials.item;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import net.minecraft.world.item.Item;

import io.github.antiphysika.mods.skyblockessentials.SBEMod;

public class MiniStoneItems
{
  public static final DeferredRegister<Item> MINI_STONE_ITEMS =
    DeferredRegister.create(ForgeRegistries.ITEMS, SBEMod.MOD_ID);

  public static final RegistryObject<Item> MINI_STONE =
    MINI_STONE_ITEMS.register("mini_stone", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_ANDESITE =
    MINI_STONE_ITEMS.register("mini_andesite", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_DIORITE =
    MINI_STONE_ITEMS.register("mini_diorite", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_GRANITE =
    MINI_STONE_ITEMS.register("mini_granite", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_DEEPSLATE =
    MINI_STONE_ITEMS.register("mini_deepslate", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_TUFF =
    MINI_STONE_ITEMS.register("mini_tuff", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_CALCITE =
    MINI_STONE_ITEMS.register("mini_calcite", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_DRIPSTONE =
    MINI_STONE_ITEMS.register("mini_dripstone", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_NETHERRACK =
    MINI_STONE_ITEMS.register("mini_netherrack", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_BASALT =
    MINI_STONE_ITEMS.register("mini_basalt", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_BLACKSTONE =
    MINI_STONE_ITEMS.register("mini_blackstone", () -> new Item(new Item.Properties()));

  public static final RegistryObject<Item> MINI_END_STONE =
    MINI_STONE_ITEMS.register("mini_end_stone", () -> new Item(new Item.Properties()));

  public static void register(IEventBus bus)
  {
    MINI_STONE_ITEMS.register(bus);
  }
}

// vim: ts=2 sw=2 et fdm=marker :
//