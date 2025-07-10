package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.StratagemDTO;
import com.avalon.compDivers.api.models.Stratagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class StratagemMapper {

    @Autowired
    WarbondMapper warbondMapper;

    public StratagemDTO toDto(Stratagem stratagem) {
        StratagemDTO dto = new StratagemDTO();
        dto.setUuid(stratagem.getUuid());
        dto.setName(stratagem.getName());
        dto.setCategory(stratagem.getCategory());
        dto.setStratagemType(stratagem.getStratagemType());
        dto.setWarbond(stratagem.getWarbond() != null ? warbondMapper.toDto(stratagem.getWarbond()) : null);
        return dto;
    }

    public List<StratagemDTO> toDtoList(List<Stratagem> stratagems) {
        return stratagems.stream().map(this::toDto).toList();
    }

    public Set<StratagemDTO> toDtoSet(Set<Stratagem> stratagems) {
        return stratagems.stream().map(this::toDto).collect(Collectors.toSet());
    }
}