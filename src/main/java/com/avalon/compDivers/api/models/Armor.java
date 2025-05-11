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
    private String name;

    @Column(nullable = false)
    private String category;

    @ManyToOne
    @JoinColumn(name = "armor_passive_id", foreignKey = @ForeignKey(name = "fk_armor_passive"))
    private ArmorPassive armorPassive;

    @OneToOne(mappedBy = "armor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private ArmorStats armorStats;


    public Armor(Long id, UUID uuid, String name, String category, ArmorPassive armorPassive, ArmorStats armorStats) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.category = category;
        this.armorPassive = armorPassive;
        this.armorStats = armorStats;
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

    public ArmorPassive getArmorPassive() {
        return armorPassive;
    }

    public void setArmorPassive(ArmorPassive armorPassive) {
        this.armorPassive = armorPassive;
    }

    public ArmorStats getArmorStats() {
        return armorStats;
    }

    public void setArmorStats(ArmorStats armorStats) {
        this.armorStats = armorStats;
    }
}