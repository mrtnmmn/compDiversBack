package com.avalon.compDivers.api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "armors")
public class Armor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private UUID uuid;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private int armor;
    @Column(nullable = false)
    private int speed;
    @Column(nullable = false)
    private int stamina;

    @PrePersist
    public void ensureUuid() {
        this.uuid = (this.uuid == null ? UUID.randomUUID() : this.uuid);
    }

    public Armor(String category, int armor, int speed, int stamina) {
        this.category = category;
        this.armor = armor;
        this.speed = speed;
        this.stamina = stamina;
    }

    public Armor() {
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