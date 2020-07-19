/*
 * Part of the Primal Winter by AlcatrazEscapee
 * Work under Copyright. See the project LICENSE.md for details.
 */

package com.alcatrazescapee.primalwinter.common;

import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

import static com.alcatrazescapee.primalwinter.PrimalWinter.MOD_ID;

public class ModTags
{
    public static class Blocks
    {
        public static final ITag.INamedTag<Block> TURTLE_SPAWNS_ON = create(new ResourceLocation(MOD_ID, "turtle_spawns_on"));
        public static final ITag.INamedTag<Block> ANIMAL_SPAWNS_ON = create(new ResourceLocation(MOD_ID, "animal_spawns_on"));

        private static ITag.INamedTag<Block> create(ResourceLocation id)
        {
            return BlockTags.makeWrapperTag(id.toString());
        }
    }
}
