package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.WarbondDTO;
import com.avalon.compDivers.api.mappers.WarbondMapper;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WarbondService {

    @Autowired
    private WarbondRepository warbondRepository;

    @Autowired
    private WarbondMapper warbondMapper;

    public List<WarbondDTO> getAll() {
        List<Warbond> warbonds = warbondRepository.findAll();
        return warbondMapper.toDtoList(warbonds);
    }

}
