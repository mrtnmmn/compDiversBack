package com.avalon.compDivers.api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "secondary_weapons")
public class SecondaryWeapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private String penetration;

    @ManyToOne
    @JoinColumn(name = "warbond_id")
    private Warbond warbond;

    @PrePersist
    public void ensureUuid() {
        if (this.uuid == null) {
            this.uuid = UUID.randomUUID();
        }
    }

    public SecondaryWeapon(String name, String category, String penetration, Warbond warbond) {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.penetration = penetration;
        this.warbond = warbond;
    }

    public SecondaryWeapon() {
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

    public String getPenetration() {
        return penetration;
    }

    public void setPenetration(String penetration) {
        this.penetration = penetration;
    }

    public Warbond getWarbond() {
        return warbond;
    }

    public void setWarbond(Warbond warbond) {
        this.warbond = warbond;
    }
}