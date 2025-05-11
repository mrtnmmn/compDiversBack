package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ThrowableDTO;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ThrowableMapper {
    public ThrowableDTO toDto(com.avalon.compDivers.api.models.Throwable throwable) {
        ThrowableDTO dto = new ThrowableDTO();
        dto.setUuid(throwable.getUuid());
        dto.setName(throwable.getName());
        dto.setCategory(throwable.getCategory());
        return dto;
    }

    public List<ThrowableDTO> toDtoList(List<com.avalon.compDivers.api.models.Throwable> throwables) {
        return throwables.stream().map(this::toDto).toList();
    }
}