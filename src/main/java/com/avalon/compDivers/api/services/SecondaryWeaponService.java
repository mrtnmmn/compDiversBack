package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.SecondaryWeaponDTO;
import com.avalon.compDivers.api.mappers.SecondaryWeaponMapper;
import com.avalon.compDivers.api.repositories.SecondaryWeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecondaryWeaponService {
    private final SecondaryWeaponRepository repository;
    private final SecondaryWeaponMapper mapper;

    public SecondaryWeaponService(SecondaryWeaponRepository repository, SecondaryWeaponMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<SecondaryWeaponDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}