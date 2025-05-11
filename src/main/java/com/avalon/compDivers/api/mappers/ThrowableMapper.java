package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ThrowableDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThrowableMapper {

    @Autowired
    WarbondMapper warbondMapper;

    public ThrowableDTO toDto(com.avalon.compDivers.api.models.Throwable throwable) {
        ThrowableDTO dto = new ThrowableDTO();
        dto.setUuid(throwable.getUuid());
        dto.setName(throwable.getName());
        dto.setCategory(throwable.getCategory());
        dto.setWarbond(throwable.getWarbond() != null ? warbondMapper.toDto(throwable.getWarbond()) : null);
        return dto;
    }

    public List<ThrowableDTO> toDtoList(List<com.avalon.compDivers.api.models.Throwable> throwables) {
        return throwables.stream().map(this::toDto).toList();
    }
}