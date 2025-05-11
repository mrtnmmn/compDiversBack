package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.ArmorPassive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArmorPassiveRepository extends JpaRepository<ArmorPassive, Long> {
    Optional<ArmorPassive> findByName(String name);
}
