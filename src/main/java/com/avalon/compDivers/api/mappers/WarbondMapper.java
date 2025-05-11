package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.ThrowableDTO;
import com.avalon.compDivers.api.dto.WarbondDTO;
import com.avalon.compDivers.api.models.Warbond;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class WarbondMapper {

    public WarbondDTO toDto(Warbond warbond) {
        WarbondDTO dto = new WarbondDTO();
        dto.setUuid(warbond.getUuid());
        dto.setName(warbond.getName());
        return dto;
    }

    public List<WarbondDTO> toDtoList(List<Warbond> warbonds) {
        return warbonds.stream().map(this::toDto).toList();
    }
}
