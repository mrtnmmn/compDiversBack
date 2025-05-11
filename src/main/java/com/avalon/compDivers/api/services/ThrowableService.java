package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.ThrowableDTO;
import com.avalon.compDivers.api.mappers.ThrowableMapper;
import com.avalon.compDivers.api.repositories.ThrowableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThrowableService {
    private final ThrowableRepository repository;
    private final ThrowableMapper mapper;

    public ThrowableService(ThrowableRepository repository, ThrowableMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<ThrowableDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}