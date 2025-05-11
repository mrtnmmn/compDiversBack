package com.avalon.compDivers.api.dto;

import java.util.UUID;

public class ArmorStatsDTO {
    private UUID uuid;
    private int armor;
    private int speed;
    private int stamina;

    public ArmorStatsDTO(UUID uuid, int armor, int speed, int stamina) {
        this.uuid = uuid;
        this.armor = armor;
        this.speed = speed;
        this.stamina = stamina;
    }

    public ArmorStatsDTO() {
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
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
