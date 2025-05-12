package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.SecondaryWeapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface SecondaryWeaponRepository extends JpaRepository<SecondaryWeapon, Long> {
    Optional<SecondaryWeapon> findByName(String name);
    Optional<SecondaryWeapon> findByUuid(UUID uuid);
}
