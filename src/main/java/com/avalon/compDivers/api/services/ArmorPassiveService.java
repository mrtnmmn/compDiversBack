package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.ArmorPassiveDTO;
import com.avalon.compDivers.api.mappers.ArmorPassiveMapper;
import com.avalon.compDivers.api.repositories.ArmorPassiveRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorPassiveService {
    private final ArmorPassiveRepository repository;
    private final ArmorPassiveMapper mapper;

    public ArmorPassiveService(ArmorPassiveRepository repository, ArmorPassiveMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ArmorPassiveDTO> getAll() {
        return repository.findAll().stream().map(mapper::toDto).toList();
    }
}
