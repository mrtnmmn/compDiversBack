CREATE TABLE warbonds (
    id BIGSERIAL PRIMARY KEY,
    uuid UUID NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL
);


ALTER TABLE primary_weapons
ADD COLUMN warbond_id BIGINT;

ALTER TABLE primary_weapons
ADD CONSTRAINT fk_primary_weapons_warbond
FOREIGN KEY (warbond_id) REFERENCES warbonds(id);


ALTER TABLE secondary_weapons
ADD COLUMN warbond_id BIGINT;

ALTER TABLE secondary_weapons
ADD CONSTRAINT fk_secondary_weapons_warbond
FOREIGN KEY (warbond_id) REFERENCES warbonds(id);


ALTER TABLE throwables
ADD COLUMN warbond_id BIGINT;

ALTER TABLE throwables
ADD CONSTRAINT fk_throwables_warbond
FOREIGN KEY (warbond_id) REFERENCES warbonds(id);


ALTER TABLE stratagems
ADD COLUMN warbond_id BIGINT;

ALTER TABLE stratagems
ADD CONSTRAINT fk_stratagems_warbond
FOREIGN KEY (warbond_id) REFERENCES warbonds(id);


ALTER TABLE booster
ADD COLUMN warbond_id BIGINT;

ALTER TABLE booster
ADD CONSTRAINT fk_booster_warbond
FOREIGN KEY (warbond_id) REFERENCES warbonds(id);