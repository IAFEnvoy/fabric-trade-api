package com.iafenvoy.fabric.trade.villager.profession;

import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public record ProfessionHolder(PointOfInterestType poi, VillagerProfession profession) {
}
