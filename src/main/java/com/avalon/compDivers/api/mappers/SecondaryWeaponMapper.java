package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.SecondaryWeaponDTO;
import com.avalon.compDivers.api.models.SecondaryWeapon;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecondaryWeaponMapper {
    public SecondaryWeaponDTO toDto(SecondaryWeapon weapon) {
        SecondaryWeaponDTO dto = new SecondaryWeaponDTO();
        dto.setUuid(weapon.getUuid());
        dto.setName(weapon.getName());
        dto.setCategory(weapon.getCategory());
        return dto;
    }

    public List<SecondaryWeaponDTO> toDtoList(List<SecondaryWeapon> weapons) {
        return weapons.stream().map(this::toDto).toList();
    }
}