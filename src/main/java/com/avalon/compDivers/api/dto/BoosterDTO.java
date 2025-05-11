package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class BoosterDTO {
    private UUID uuid;
    private String name;
    private String description;
    private WarbondDTO warbond;

    public BoosterDTO(UUID uuid, String name, String description, WarbondDTO warbond) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.warbond = warbond;
    }

    public BoosterDTO() {
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

    public WarbondDTO getWarbond() {
        return warbond;
    }

    public void setWarbond(WarbondDTO warbond) {
        this.warbond = warbond;
    }
}