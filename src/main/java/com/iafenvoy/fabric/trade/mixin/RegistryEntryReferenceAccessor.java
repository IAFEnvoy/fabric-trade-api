package com.iafenvoy.fabric.trade.mixin;

import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.TagKey;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Set;

@Mixin(RegistryEntry.Reference.class)
public interface RegistryEntryReferenceAccessor<T> {
    @Accessor("tags")
    Set<TagKey<T>> getTagSet();
}
