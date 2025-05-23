package com.avalon.compDivers.api.repositories;

import com.avalon.compDivers.api.models.User;
import com.avalon.compDivers.api.models.Loadout;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoadoutRepository extends JpaRepository<Loadout, Long> {
    List<Loadout> findByUser(User user);
    List<Loadout> findByUserOrderByCreationDateDesc(User user);
    Page<Loadout> findByUserNot(User user, Pageable pageable);
}
