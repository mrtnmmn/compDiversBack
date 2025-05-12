package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class ThrowableDTO {
    private UUID uuid;
    private String name;
    private String category;
    private String penetration;
    private WarbondDTO warbond;

    public ThrowableDTO(UUID uuid, String name, String category, String penetration, WarbondDTO warbond) {
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.penetration = penetration;
        this.warbond = warbond;
    }

    public ThrowableDTO() {
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPenetration() {
        return penetration;
    }

    public void setPenetration(String penetration) {
        this.penetration = penetration;
    }

    public WarbondDTO getWarbond() {
        return warbond;
    }

    public void setWarbond(WarbondDTO warbond) {
        this.warbond = warbond;
    }
}