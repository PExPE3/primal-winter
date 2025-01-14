package com.alcatrazescapee.primalwinter.platform;

import java.nio.file.Path;
import java.util.ServiceLoader;
import java.util.function.Supplier;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import com.alcatrazescapee.primalwinter.util.Config;

public interface XPlatform
{
    XPlatform INSTANCE = find(XPlatform.class);

    static <T> T find(Class<T> clazz)
    {
        return ServiceLoader.load(clazz)
            .findFirst()
            .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
    }

    <T> RegistryInterface<T> registryInterface(Registry<T> registry);

    CreativeModeTab creativeTab(ResourceLocation id, Supplier<ItemStack> icon);

    // Platform APIs

    boolean isDedicatedClient();

    Path configDir();
}
