package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.PrimaryWeaponDTO;
import com.avalon.compDivers.api.models.PrimaryWeapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrimaryWeaponMapper {

    @Autowired
    WarbondMapper warbondMapper;

    public PrimaryWeaponDTO toDto(PrimaryWeapon weapon) {
        PrimaryWeaponDTO dto = new PrimaryWeaponDTO();
        dto.setUuid(weapon.getUuid());
        dto.setName(weapon.getName());
        dto.setCategory(weapon.getCategory());
        dto.setPenetration(weapon.getPenetration());
        dto.setWarbond(weapon.getWarbond() != null ? warbondMapper.toDto(weapon.getWarbond()) : null);
        return dto;
    }

    public List<PrimaryWeaponDTO> toDtoList(List<PrimaryWeapon> weapons) {
        return weapons.stream().map(this::toDto).toList();
    }
}