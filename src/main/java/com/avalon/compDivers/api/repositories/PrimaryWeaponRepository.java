package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.PrimaryWeapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PrimaryWeaponRepository extends JpaRepository<PrimaryWeapon, Long> {
    Optional<PrimaryWeapon> findByName(String name);
    Optional<PrimaryWeapon> findByUuid(UUID uuid);
}
