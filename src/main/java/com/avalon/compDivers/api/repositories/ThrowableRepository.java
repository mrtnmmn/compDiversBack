package com.avalon.compDivers.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ThrowableRepository extends JpaRepository<com.avalon.compDivers.api.models.Throwable, Long> {
    Optional<com.avalon.compDivers.api.models.Throwable> findByName(String name);
    Optional<com.avalon.compDivers.api.models.Throwable> findByUuid(UUID uuid);

}
