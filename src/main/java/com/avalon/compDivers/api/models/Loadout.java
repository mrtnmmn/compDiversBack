package com.avalon.compDivers.api.models;

import jakarta.persistence.*;

import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "loadouts")
public class Loadout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private UUID uuid;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "primary_weapon_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_primary_weapon"))
    private PrimaryWeapon primaryWeapon;

    @ManyToOne(optional = false)
    @JoinColumn(name = "secondary_weapon_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_secondary_weapon"))
    private SecondaryWeapon secondaryWeapon;

    @ManyToOne(optional = false)
    @JoinColumn(name = "armor_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_armor"))
    private Armor armor;

    @ManyToOne(optional = false)
    @JoinColumn(name = "armor_passive_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_armor_passive"))
    private ArmorPassive armorPassive;

    @ManyToOne(optional = false)
    @JoinColumn(name = "throwable_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_throwable"))
    private com.avalon.compDivers.api.models.Throwable throwable;

    @ManyToMany
    @JoinTable(
            name = "loadout_stratagems",
            joinColumns = @JoinColumn(name = "loadout_id"),
            inverseJoinColumns = @JoinColumn(name = "stratagem_id")
    )
    private Set<Stratagem> stratagems;

    @ManyToOne(optional = false)
    @JoinColumn(name = "booster_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_booster"))
    private Booster booster;

    @ManyToOne(optional = false)
    @JoinColumn(name = "faction_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_faction"))
    private Faction faction;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", nullable = false, foreignKey = @ForeignKey(name = "fk_loadout_user"))
    private User user;

    @PrePersist
    public void ensureUuid() {
        this.uuid = (this.uuid == null ? UUID.randomUUID() : this.uuid);
    }

    public Loadout(Long id, UUID uuid, String name, String description, User user) {
        this.id = id;
        this.uuid = uuid;
        this.name = name;
        this.description = description;
        this.user = user;
    }

    public Loadout() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrimaryWeapon getPrimaryWeapon() {
        return primaryWeapon;
    }

    public void setPrimaryWeapon(PrimaryWeapon primaryWeapon) {
        this.primaryWeapon = primaryWeapon;
    }

    public SecondaryWeapon getSecondaryWeapon() {
        return secondaryWeapon;
    }

    public void setSecondaryWeapon(SecondaryWeapon secondaryWeapon) {
        this.secondaryWeapon = secondaryWeapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArmorPassive getArmorPassive() {
        return armorPassive;
    }

    public void setArmorPassive(ArmorPassive armorPassive) {
        this.armorPassive = armorPassive;
    }

    public com.avalon.compDivers.api.models.Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(com.avalon.compDivers.api.models.Throwable throwable) {
        this.throwable = throwable;
    }

    public Set<Stratagem> getStratagems() {
        return stratagems;
    }

    public void setStratagems(Set<Stratagem> stratagems) {
        this.stratagems = stratagems;
    }

    public Booster getBooster() {
        return booster;
    }

    public void setBooster(Booster booster) {
        this.booster = booster;
    }

    public Faction getFaction() {
        return faction;
    }

    public void setFaction(Faction faction) {
        this.faction = faction;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}