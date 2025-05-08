package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.LoadoutDTO;
import com.avalon.compDivers.api.models.Loadout;

import static com.avalon.compDivers.api.mappers.UserMapper.toUserDto;

public class LoadoutMapper {

    public static LoadoutDTO toLoadoutDto(Loadout loadout) {
        if (loadout == null) return null;

        return new LoadoutDTO(
                loadout.getUuid(),
                loadout.getName(),
                loadout.getDescription(),
                toUserDto(loadout.getUser())
        );
    }
}
