package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ArmorDTO;
import com.avalon.compDivers.api.models.Armor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ArmorMapper {

    public ArmorDTO toDto(Armor armor) {
        ArmorDTO dto = new ArmorDTO();
        dto.setUuid(armor.getUuid());
        dto.setCategory(armor.getCategory());
        dto.setArmor(armor.getArmor());
        dto.setSpeed(armor.getSpeed());
        dto.setStamina(armor.getStamina());
        return dto;
    }

    public List<ArmorDTO> toDtoList(List<Armor> armors) {
        return armors.stream().map(this::toDto).toList();
    }
}