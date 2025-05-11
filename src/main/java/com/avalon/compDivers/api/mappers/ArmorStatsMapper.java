package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ArmorStatsDTO;
import com.avalon.compDivers.api.models.ArmorStats;
import org.springframework.stereotype.Component;

@Component
public class ArmorStatsMapper {
    public ArmorStatsDTO toDto(ArmorStats armorStats) {
        ArmorStatsDTO dto = new ArmorStatsDTO();
        dto.setUuid(armorStats.getUuid());
        dto.setArmor(armorStats.getArmorStat());
        dto.setSpeed(armorStats.getSpeed());
        dto.setStamina(armorStats.getStamina());
        return dto;
    }
}
