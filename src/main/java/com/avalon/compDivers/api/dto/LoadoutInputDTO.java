package com.avalon.compDivers.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.UUID;

public class LoadoutInputDTO {

    private String name;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID primaryWeapon;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID secondaryWeapon;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID armor;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID armorPassive;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID throwable;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<UUID> stratagems;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID booster;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID faction;

    public LoadoutInputDTO(String name, String description, UUID primaryWeapon,
                           UUID secondaryWeapon, UUID armor, UUID armorPassive,
                           UUID throwable, List<UUID> stratagems, UUID booster,
                           UUID faction) {
        this.name = name;
        this.description = description;
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        this.armor = armor;
        this.armorPassive = armorPassive;
        this.throwable = throwable;
        this.stratagems = stratagems;
        this.booster = booster;
        this.faction = faction;
    }

    public LoadoutInputDTO() {
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

    public UUID getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(UUID primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public UUID getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(UUID secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public UUID getArmor() {
        return armor;
    }

    public void setArmor(UUID armor) {
        this.armor = armor;
    }

    public UUID getArmorPassive() {
        return armorPassive;
    }

    public void setArmorPassive(UUID armorPassive) {
        this.armorPassive = armorPassive;
    }

    public UUID getThrowable() {
        return throwable;
    }

    public void setThrowable(UUID throwable) {
        this.throwable = throwable;
    }

    public List<UUID> getStratagems() {
        return stratagems;
    }

    public void setStratagems(List<UUID> stratagems) {
        this.stratagems = stratagems;
    }

    public UUID getBooster() {
        return booster;
    }

    public void setBooster(UUID booster) {
        this.booster = booster;
    }

    public UUID getFaction() {
        return faction;
    }

    public void setFaction(UUID faction) {
        this.faction = faction;
    }
}
