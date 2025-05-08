CREATE TABLE loadouts (
    id BIGSERIAL PRIMARY KEY,
    uuid UUID NOT NULL UNIQUE,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    user_id BIGINT NOT NULL,
    CONSTRAINT fk_loadout_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);