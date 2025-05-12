package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Armor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArmorRepository extends JpaRepository<Armor, Long> {
    Optional<Armor> findByCategory(String category);
}
