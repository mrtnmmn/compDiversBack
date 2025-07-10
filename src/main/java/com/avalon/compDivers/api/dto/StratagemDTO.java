package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class StratagemDTO {
    private UUID uuid;
    private String name;
    private String category;
    private String stratagemType;
    private WarbondDTO warbond;

    public StratagemDTO(UUID uuid, String name, String category, String stratagemType, WarbondDTO warbond) {
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.stratagemType = stratagemType;
        this.warbond = warbond;
    }

    public StratagemDTO() {
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

    public String getStratagemType() {
        return stratagemType;
    }

    public void setStratagemType(String stratagemType) {
        this.stratagemType = stratagemType;
    }

    public WarbondDTO getWarbond() {
        return warbond;
    }

    public void setWarbond(WarbondDTO warbond) {
        this.warbond = warbond;
    }
}
