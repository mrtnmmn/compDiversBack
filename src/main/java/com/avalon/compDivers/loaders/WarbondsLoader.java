package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class WarbondsLoader {

    @Autowired
    private WarbondRepository repository;
    
    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/warbonds.json");
            List<Warbond> warbonds = mapper.readValue(inputStream, new TypeReference<List<Warbond>>() {});

            for (Warbond warbond : warbonds) {
                repository.findByName(warbond.getName().trim())
                        .orElseGet(() -> repository.save(warbond));
            }

            System.out.println("✅ Warbonds loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}