package com.avalon.compDivers.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThrowableRepository extends JpaRepository<com.avalon.compDivers.api.models.Throwable, Long> {
}
