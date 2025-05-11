package com.avalon.compDivers.api.models;

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

    public Throwable(Long id, UUID uuid, String name, String category) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.category = category;
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
}