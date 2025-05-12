ALTER TABLE loadouts
    ADD COLUMN primary_weapon_id BIGINT NOT NULL,
    ADD COLUMN secondary_weapon_id BIGINT NOT NULL,
    ADD COLUMN armor_id BIGINT NOT NULL,
    ADD COLUMN armor_passive_id BIGINT NOT NULL,
    ADD COLUMN throwable_id BIGINT NOT NULL,
    ADD COLUMN booster_id BIGINT NOT NULL,
    ADD COLUMN faction_id BIGINT NOT NULL;

ALTER TABLE loadouts
    ADD CONSTRAINT fk_loadout_primary_weapon FOREIGN KEY (primary_weapon_id) REFERENCES primary_weapons(id),
    ADD CONSTRAINT fk_loadout_secondary_weapon FOREIGN KEY (secondary_weapon_id) REFERENCES secondary_weapons(id),
    ADD CONSTRAINT fk_loadout_armor FOREIGN KEY (armor_id) REFERENCES armors(id),
    ADD CONSTRAINT fk_loadout_armor_passive FOREIGN KEY (armor_passive_id) REFERENCES armor_passives(id),
    ADD CONSTRAINT fk_loadout_throwable FOREIGN KEY (throwable_id) REFERENCES throwables(id),
    ADD CONSTRAINT fk_loadout_booster FOREIGN KEY (booster_id) REFERENCES booster(id),
    ADD CONSTRAINT fk_loadout_faction FOREIGN KEY (faction_id) REFERENCES factions(id);

CREATE TABLE loadout_stratagems (
    loadout_id BIGINT NOT NULL,
    stratagem_id BIGINT NOT NULL,
    PRIMARY KEY (loadout_id, stratagem_id),
    FOREIGN KEY (loadout_id) REFERENCES loadouts(id) ON DELETE CASCADE,
    FOREIGN KEY (stratagem_id) REFERENCES stratagems(id) ON DELETE CASCADE
);
