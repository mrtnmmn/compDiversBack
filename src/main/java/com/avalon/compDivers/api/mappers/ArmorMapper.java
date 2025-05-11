package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ArmorDTO;
import com.avalon.compDivers.api.models.Armor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArmorMapper {
    private final ArmorPassiveMapper armorPassiveMapper;

    @Autowired
    private ArmorStatsMapper armorStatsMapper;

    public ArmorMapper(ArmorPassiveMapper armorPassiveMapper) {
        this.armorPassiveMapper = armorPassiveMapper;
    }

    public ArmorDTO toDto(Armor armor) {
        ArmorDTO dto = new ArmorDTO();
        dto.setUuid(armor.getUuid());
        dto.setName(armor.getName());
        dto.setCategory(armor.getCategory());
        if (armor.getArmorPassive() != null) {
            dto.setArmorPassive(armorPassiveMapper.toDto(armor.getArmorPassive()));
        }
        dto.setArmorStats(armor.getArmorStats() != null ? armorStatsMapper.toDto(armor.getArmorStats()) : null);
        return dto;
    }

    public List<ArmorDTO> toDtoList(List<Armor> armors) {
        return armors.stream().map(this::toDto).toList();
    }
}