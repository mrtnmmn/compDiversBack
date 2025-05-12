package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Faction;
import com.avalon.compDivers.api.repositories.FactionRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class FactionsLoader {

    @Autowired
    private FactionRepository repository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/factions.json");
            List<Faction> factions = mapper.readValue(inputStream, new TypeReference<List<Faction>>() {});

            for (Faction faction : factions) {
                repository.findByName(faction.getName().trim())
                        .orElseGet(() -> repository.save(faction));
            }

            System.out.println("✅ Factions loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
