package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.FactionDTO;
import com.avalon.compDivers.api.models.Faction;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FactionMapper {

    public FactionDTO toDto(Faction faction) {
        FactionDTO dto = new FactionDTO();
        dto.setUuid(faction.getUuid());
        dto.setName(faction.getName());
        return dto;
    }

    public List<FactionDTO> toDtoList(List<Faction> factions) {
        return factions.stream().map(this::toDto).toList();
    }
}
