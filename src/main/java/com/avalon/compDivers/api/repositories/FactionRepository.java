package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Faction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FactionRepository extends JpaRepository<Faction, Long> {
    Optional<Faction> findByName(String name);
}
