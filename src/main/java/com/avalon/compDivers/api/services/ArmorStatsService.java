package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.ArmorStatsDTO;
import com.avalon.compDivers.api.mappers.ArmorStatsMapper;
import com.avalon.compDivers.api.repositories.ArmorStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArmorStatsService {

    @Autowired
    private ArmorStatsRepository armorStatsRepository;

    @Autowired
    private ArmorStatsMapper armorStatsMapper;


    public Optional<ArmorStatsDTO> getArmorStatsByArmorId(Long armorId) {
        return armorStatsRepository.findByArmorId(armorId)
                .map(armorStatsMapper::toDto);
    }
}
