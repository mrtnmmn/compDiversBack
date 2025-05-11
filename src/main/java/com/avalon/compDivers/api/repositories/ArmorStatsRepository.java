package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.ArmorStats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArmorStatsRepository extends JpaRepository<ArmorStats, Long> {
    Optional<ArmorStats> findByArmorId(Long armorId);
}
