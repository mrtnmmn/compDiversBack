package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.PrimaryWeaponDTO;
import com.avalon.compDivers.api.models.PrimaryWeapon;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrimaryWeaponMapper {
    public PrimaryWeaponDTO toDto(PrimaryWeapon weapon) {
        PrimaryWeaponDTO dto = new PrimaryWeaponDTO();
        dto.setUuid(weapon.getUuid());
        dto.setName(weapon.getName());
        dto.setCategory(weapon.getCategory());
        return dto;
    }

    public List<PrimaryWeaponDTO> toDtoList(List<PrimaryWeapon> weapons) {
        return weapons.stream().map(this::toDto).toList();
    }
}