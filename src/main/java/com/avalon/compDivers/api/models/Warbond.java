package com.avalon.compDivers.api.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "warbonds")
public class Warbond {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false)
    private String name;

    @PrePersist
    public void ensureUuid() {
        if (this.uuid == null) {
            this.uuid = UUID.randomUUID();
        }
    }

    public Warbond(String name) {
        this.name = name;
    }

    public Warbond() {
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
}
