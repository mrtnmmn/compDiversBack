package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.BoosterDTO;
import com.avalon.compDivers.api.mappers.BoosterMapper;
import com.avalon.compDivers.api.repositories.BoosterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoosterService {
    private final BoosterRepository repository;
    private final BoosterMapper mapper;

    public BoosterService(BoosterRepository repository, BoosterMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<BoosterDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}