package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class WarbondDTO {

    private UUID uuid;

    private String name;


    public WarbondDTO(UUID uuid, String name) {
        this.uuid = uuid;
        this.name = name;
    }

    public WarbondDTO() {
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

}
