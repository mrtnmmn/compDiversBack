CREATE TABLE armor_stats (
    id BIGSERIAL PRIMARY KEY,
    uuid UUID NOT NULL UNIQUE,
    armor_id BIGINT NOT NULL UNIQUE,
    armor INTEGER NOT NULL,
    speed INTEGER NOT NULL,
    stamina INTEGER NOT NULL,

    CONSTRAINT fk_armor_stats_armor
        FOREIGN KEY (armor_id)
        REFERENCES armors(id)
        ON DELETE CASCADE
);