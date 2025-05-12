package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class ArmorDTO {
    private UUID uuid;
    private String category;
    private int armor;
    private int speed;
    private int stamina;

    public ArmorDTO(UUID uuid, String category, int armor, int speed, int stamina) {
        this.uuid = uuid;
        this.category = category;
        this.armor = armor;
        this.speed = speed;
        this.stamina = stamina;
    }

    public ArmorDTO() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }
}
