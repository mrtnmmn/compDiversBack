package com.avalon.compDivers.api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class ArmorStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private UUID uuid;

    private int armorStat;
    private int speed;
    private int stamina;

    @OneToOne
    @JoinColumn(name = "armor_id", unique = true)
    private Armor armor;

    public ArmorStats(Long id, UUID uuid, int armorStat, int speed, int stamina, Armor armor) {
        this.id = id;
        this.uuid = uuid;
        this.armorStat = armorStat;
        this.speed = speed;
        this.stamina = stamina;
        this.armor = armor;
    }

    public ArmorStats() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public int getArmorStat() {
        return armorStat;
    }

    public void setArmorStat(int armorStat) {
        this.armorStat = armorStat;
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

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}