package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.UserDTO;
import com.avalon.compDivers.api.models.User;

public class UserMapper {

    public static UserDTO toUserDto(User user) {
        if (user == null) return null;

        return new UserDTO(
                user.getUuid(),
                user.getUsername()
        );
    }
}
