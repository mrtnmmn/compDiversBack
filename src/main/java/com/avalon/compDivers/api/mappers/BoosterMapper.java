package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.BoosterDTO;
import com.avalon.compDivers.api.models.Booster;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoosterMapper {
    public BoosterDTO toDto(Booster booster) {
        BoosterDTO dto = new BoosterDTO();
        dto.setUuid(booster.getUuid());
        dto.setName(booster.getName());
        dto.setDescription(booster.getDescription());
        return dto;
    }

    public List<BoosterDTO> toDtoList(List<Booster> boosters) {
        return boosters.stream().map(this::toDto).toList();
    }
}