package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class LoadoutDTO {

    private UUID uuid;
    private String name;
    private String description;
    private UserDTO user;

    public LoadoutDTO(UUID uuid, String name, String description, UserDTO user) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public LoadoutDTO() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
