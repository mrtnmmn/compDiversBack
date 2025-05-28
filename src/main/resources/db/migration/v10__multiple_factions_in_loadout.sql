ALTER TABLE loadouts DROP CONSTRAINT fk_loadout_faction;
ALTER TABLE loadouts DROP COLUMN faction_id;

CREATE TABLE loadout_faction (
    loadout_id BIGINT NOT NULL,
    faction_id BIGINT NOT NULL,
    PRIMARY KEY (loadout_id, faction_id),
    CONSTRAINT fk_loadout_faction_loadout FOREIGN KEY (loadout_id) REFERENCES loadout(id),
    CONSTRAINT fk_loadout_faction_faction FOREIGN KEY (faction_id) REFERENCES faction(id)
);