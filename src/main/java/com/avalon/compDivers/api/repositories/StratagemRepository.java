package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.Stratagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StratagemRepository extends JpaRepository<Stratagem, Long> {
    Optional<Stratagem> findByName(String name);
}
