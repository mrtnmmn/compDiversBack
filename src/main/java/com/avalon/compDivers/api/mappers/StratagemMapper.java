package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.StratagemDTO;
import com.avalon.compDivers.api.models.Stratagem;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StratagemMapper {
    public StratagemDTO toDto(Stratagem stratagem) {
        StratagemDTO dto = new StratagemDTO();
        dto.setUuid(stratagem.getUuid());
        dto.setName(stratagem.getName());
        dto.setCategory(stratagem.getCategory());
        return dto;
    }

    public List<StratagemDTO> toDtoList(List<Stratagem> stratagems) {
        return stratagems.stream().map(this::toDto).toList();
    }
}