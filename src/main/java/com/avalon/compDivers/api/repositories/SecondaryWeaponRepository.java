package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.SecondaryWeapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecondaryWeaponRepository extends JpaRepository<SecondaryWeapon, Long> {
}
