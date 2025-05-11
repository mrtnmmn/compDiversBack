package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ArmorPassiveDTO;
import com.avalon.compDivers.api.models.ArmorPassive;
import org.springframework.stereotype.Component;

@Component
public class ArmorPassiveMapper {
    public ArmorPassiveDTO toDto(ArmorPassive armorPassive) {
        ArmorPassiveDTO dto = new ArmorPassiveDTO();
        dto.setUuid(armorPassive.getUuid());
        dto.setName(armorPassive.getName());
        dto.setCategory(armorPassive.getCategory());
        return dto;
    }
}