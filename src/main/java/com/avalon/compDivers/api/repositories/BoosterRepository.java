package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Booster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface BoosterRepository extends JpaRepository<Booster, Long> {
    Optional<Booster> findByName(String name);
    Optional<Booster> findByUuid(UUID uuid);
}
