package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class ArmorDTO {
    private UUID uuid;
    private String name;
    private String category;
    private ArmorPassiveDTO armorPassive;

    public ArmorDTO(UUID uuid, String name, String category, ArmorPassiveDTO armorPassive) {
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.armorPassive = armorPassive;
    }

    public ArmorDTO() {
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

    public ArmorPassiveDTO getArmorPassive() {
        return armorPassive;
    }

    public void setArmorPassive(ArmorPassiveDTO armorPassive) {
        this.armorPassive = armorPassive;
    }
}
