package com.avalon.compDivers.api.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class LoadoutDTO {

    private UUID uuid;
    private String name;
    private String description;
    private PrimaryWeaponDTO primaryWeapon;
    private SecondaryWeaponDTO secondaryWeapon;
    private ThrowableDTO throwable;
    private ArmorDTO armor;
    private ArmorPassiveDTO armorPassive;
    private Set<StratagemDTO> stratagems;
    private BoosterDTO booster;
    private Set<FactionDTO> faction;
    private UserDTO user;
    private LocalDateTime creationDate;

    public LoadoutDTO(UUID uuid, String name, String description, PrimaryWeaponDTO primaryWeapon,
                      SecondaryWeaponDTO secondaryWeapon, ThrowableDTO throwable, ArmorDTO armor,
                      ArmorPassiveDTO armorPassive, Set<StratagemDTO> stratagems, BoosterDTO booster,
                      Set<FactionDTO> faction, UserDTO user, LocalDateTime creationDate) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        this.throwable = throwable;
        this.armor = armor;
        this.armorPassive = armorPassive;
        this.stratagems = stratagems;
        this.booster = booster;
        this.faction = faction;
        this.user = user;
        this.creationDate = creationDate;
    }

    public LoadoutDTO() {
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

    public PrimaryWeaponDTO getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(PrimaryWeaponDTO primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public SecondaryWeaponDTO getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(SecondaryWeaponDTO secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public ThrowableDTO getThrowable() {
        return throwable;
    }

    public void setThrowable(ThrowableDTO throwable) {
        this.throwable = throwable;
    }

    public ArmorDTO getArmor() {
        return armor;
    }

    public void setArmor(ArmorDTO armor) {
        this.armor = armor;
    }

    public ArmorPassiveDTO getArmorPassive() {
        return armorPassive;
    }

    public void setArmorPassive(ArmorPassiveDTO armorPassive) {
        this.armorPassive = armorPassive;
    }

    public Set<StratagemDTO> getStratagems() {
        return stratagems;
    }

    public void setStratagems(Set<StratagemDTO> stratagems) {
        this.stratagems = stratagems;
    }

    public BoosterDTO getBooster() {
        return booster;
    }

    public void setBooster(BoosterDTO booster) {
        this.booster = booster;
    }

    public Set<FactionDTO> getFaction() {
        return faction;
    }

    public void setFaction(Set<FactionDTO> faction) {
        this.faction = faction;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
