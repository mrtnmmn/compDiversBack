package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.FactionDTO;
import com.avalon.compDivers.api.mappers.FactionMapper;
import com.avalon.compDivers.api.repositories.FactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FactionService {

    @Autowired
    private FactionRepository factionRepository;

    @Autowired
    private FactionMapper factionMapper;

    public List<FactionDTO> findAllFactions() {
        return factionMapper.toDtoList(factionRepository.findAll());
    }
}
