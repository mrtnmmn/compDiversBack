package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Warbond;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarbondRepository extends JpaRepository<Warbond, Long> {
}
