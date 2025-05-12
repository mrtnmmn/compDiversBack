package com.avalon.compDivers.api.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.List;
import java.util.UUID;

public class LoadoutInputDTO {

    private String name;
    private String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID primaryWeaponUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID secondaryWeaponUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID armorUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID armorPassiveUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID throwableUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private List<UUID> stratagemsUUIDs;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID boosterUUID;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private UUID factionUUID;

    public LoadoutInputDTO(String name, String description, UUID primaryWeaponUUID,
                           UUID secondaryWeaponUUID, UUID armorUUID, UUID armorPassiveUUID,
                           UUID throwableUUID, List<UUID> stratagemsUUIDs, UUID boosterUUID,
                           UUID factionUUID) {
        this.name = name;
        this.description = description;
        this.primaryWeaponUUID = primaryWeaponUUID;
        this.secondaryWeaponUUID = secondaryWeaponUUID;
        this.armorUUID = armorUUID;
        this.armorPassiveUUID = armorPassiveUUID;
        this.throwableUUID = throwableUUID;
        this.stratagemsUUIDs = stratagemsUUIDs;
        this.boosterUUID = boosterUUID;
        this.factionUUID = factionUUID;
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

    public UUID getPrimaryWeaponUUID() {
        return primaryWeaponUUID;
    }

    public void setPrimaryWeaponUUID(UUID primaryWeaponUUID) {
        this.primaryWeaponUUID = primaryWeaponUUID;
    }

    public UUID getSecondaryWeaponUUID() {
        return secondaryWeaponUUID;
    }

    public void setSecondaryWeaponUUID(UUID secondaryWeaponUUID) {
        this.secondaryWeaponUUID = secondaryWeaponUUID;
    }

    public UUID getArmorUUID() {
        return armorUUID;
    }

    public void setArmorUUID(UUID armorUUID) {
        this.armorUUID = armorUUID;
    }

    public UUID getArmorPassiveUUID() {
        return armorPassiveUUID;
    }

    public void setArmorPassiveUUID(UUID armorPassiveUUID) {
        this.armorPassiveUUID = armorPassiveUUID;
    }

    public UUID getThrowableUUID() {
        return throwableUUID;
    }

    public void setThrowableUUID(UUID throwableUUID) {
        this.throwableUUID = throwableUUID;
    }

    public List<UUID> getStratagemsUUIDs() {
        return stratagemsUUIDs;
    }

    public void setStratagemsUUIDs(List<UUID> stratagemsUUIDs) {
        this.stratagemsUUIDs = stratagemsUUIDs;
    }

    public UUID getBoosterUUID() {
        return boosterUUID;
    }

    public void setBoosterUUID(UUID boosterUUID) {
        this.boosterUUID = boosterUUID;
    }

    public UUID getFactionUUID() {
        return factionUUID;
    }

    public void setFactionUUID(UUID factionUUID) {
        this.factionUUID = factionUUID;
    }
}
