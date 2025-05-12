package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Booster;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.BoosterRepository;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class BoostersLoader {

    @Autowired
    private BoosterRepository repository;

    @Autowired
    private WarbondRepository warbondRepository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/boosters.json");
            List<Booster> boosters = mapper.readValue(inputStream, new TypeReference<List<Booster>>() {});


            for (Booster booster : boosters) {
                Warbond inputWarbond = booster.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    booster.setWarbond(warbondFromDb.orElse(null));
                }

                repository.findByName(booster.getName().trim())
                        .orElseGet(() -> repository.save(booster));
            }

            System.out.println("✅ Boosters loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
