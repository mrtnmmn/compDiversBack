package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Booster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoosterRepository extends JpaRepository<Booster, Long> {
}
