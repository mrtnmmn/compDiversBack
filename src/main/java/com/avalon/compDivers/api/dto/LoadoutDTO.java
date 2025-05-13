package com.avalon.compDivers.api.dto;

import java.util.Set;
import java.util.UUID;

public class LoadoutDTO {

    private UUID uuid;
    private String name;
    private String description;
    private PrimaryWeaponDTO primaryWeapon;
    private SecondaryWeaponDTO secondaryWeapon;
    private ThrowableDTO throwableDTO;
    private ArmorDTO armor;
    private ArmorPassiveDTO armorPassive;
    private Set<StratagemDTO> stratagems;
    private BoosterDTO booster;
    private FactionDTO faction;
    private UserDTO user;

    public LoadoutDTO(UUID uuid, String name, String description, PrimaryWeaponDTO primaryWeapon,
                      SecondaryWeaponDTO secondaryWeapon, ThrowableDTO throwableDTO, ArmorDTO armor,
                      ArmorPassiveDTO armorPassive, Set<StratagemDTO> stratagems, BoosterDTO booster,
                      FactionDTO faction, UserDTO user) {
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.primaryWeapon = primaryWeapon;
        this.secondaryWeapon = secondaryWeapon;
        this.throwableDTO = throwableDTO;
        this.armor = armor;
        this.armorPassive = armorPassive;
        this.stratagems = stratagems;
        this.booster = booster;
        this.faction = faction;
        this.user = user;
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

    public ThrowableDTO getThrowableDTO() {
        return throwableDTO;
    }

    public void setThrowableDTO(ThrowableDTO throwableDTO) {
        this.throwableDTO = throwableDTO;
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

    public FactionDTO getFaction() {
        return faction;
    }

    public void setFaction(FactionDTO faction) {
        this.faction = faction;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}
