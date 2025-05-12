package com.avalon.compDivers.api.models;

import com.avalon.compDivers.api.dto.WarbondDTO;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "throwables")
public class Throwable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    // TODO: add  penetration to the migrations
    @Column(nullable = false)
    private String penetration;

    @ManyToOne
    @JoinColumn(name = "warbond_id")
    private Warbond warbond;

    @PrePersist
    public void ensureUuid() {
        this.uuid = (this.uuid == null ? UUID.randomUUID() : this.uuid);
    }

    public Throwable(String name, String category, Warbond warbond) {
        this.name = name;
        this.category = category;
        this.warbond = warbond;
    }

    public Throwable() {
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