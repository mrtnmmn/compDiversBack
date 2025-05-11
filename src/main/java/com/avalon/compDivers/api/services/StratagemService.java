package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.StratagemDTO;
import com.avalon.compDivers.api.mappers.StratagemMapper;
import com.avalon.compDivers.api.repositories.StratagemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StratagemService {
    private final StratagemRepository repository;
    private final StratagemMapper mapper;

    public StratagemService(StratagemRepository repository, StratagemMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public List<StratagemDTO> getAll() {
        return mapper.toDtoList(repository.findAll());
    }
}