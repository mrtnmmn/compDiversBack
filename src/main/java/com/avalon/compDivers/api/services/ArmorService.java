package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.ArmorDTO;
import com.avalon.compDivers.api.mappers.ArmorMapper;
import com.avalon.compDivers.api.repositories.ArmorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArmorService {
    private final ArmorRepository repository;
    private final ArmorMapper mapper;

    public ArmorService(ArmorRepository repository, ArmorMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ArmorDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}