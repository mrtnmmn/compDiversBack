package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.PrimaryWeapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryWeaponRepository extends JpaRepository<PrimaryWeapon, Long> {
}
