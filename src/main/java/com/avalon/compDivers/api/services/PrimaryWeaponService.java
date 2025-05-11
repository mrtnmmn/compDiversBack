package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.PrimaryWeaponDTO;
import com.avalon.compDivers.api.mappers.PrimaryWeaponMapper;
import com.avalon.compDivers.api.models.PrimaryWeapon;
import com.avalon.compDivers.api.repositories.PrimaryWeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrimaryWeaponService {

    private final PrimaryWeaponRepository repository;
    private final PrimaryWeaponMapper mapper;

    public PrimaryWeaponService(PrimaryWeaponRepository repository, PrimaryWeaponMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<PrimaryWeaponDTO> getAll() {
        List<PrimaryWeapon> weapons = repository.findAll();
        return mapper.toDtoList(weapons);
    }
}