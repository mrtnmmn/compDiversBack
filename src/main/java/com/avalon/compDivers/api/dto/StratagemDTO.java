package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class StratagemDTO {
    private UUID uuid;
    private String name;
    private String category;

    public StratagemDTO(UUID uuid, String name, String category) {
        this.uuid = uuid;
        this.name = name;
        this.category = category;
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
}
