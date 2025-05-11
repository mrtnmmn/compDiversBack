package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.SecondaryWeaponDTO;
import com.avalon.compDivers.api.models.SecondaryWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SecondaryWeaponMapper {

    @Autowired
    WarbondMapper warbondMapper;

    public SecondaryWeaponDTO toDto(SecondaryWeapon weapon) {
        SecondaryWeaponDTO dto = new SecondaryWeaponDTO();
        dto.setUuid(weapon.getUuid());
        dto.setName(weapon.getName());
        dto.setCategory(weapon.getCategory());
        dto.setWarbond(weapon.getWarbond() != null ? warbondMapper.toDto(weapon.getWarbond()) : null);
        return dto;
    }

    public List<SecondaryWeaponDTO> toDtoList(List<SecondaryWeapon> weapons) {
        return weapons.stream().map(this::toDto).toList();
    }
}