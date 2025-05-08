package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class UserDTO {
    private UUID uuid;

    private String username;

    public UserDTO(UUID uuid, String username) {
        this.uuid = uuid;
        this.username = username;
    }

    public UserDTO() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
