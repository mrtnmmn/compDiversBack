package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.repositories.ArmorPassiveRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.avalon.compDivers.api.models.ArmorPassive;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ArmorPassiveLoader {

    @Autowired
    private ArmorPassiveRepository repository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/armor_passives.json");
            List<ArmorPassive> armorPassives = mapper.readValue(inputStream, new TypeReference<List<ArmorPassive>>() {});

            for (ArmorPassive passive : armorPassives) {
                repository.findByName(passive.getName().trim())
                        .orElseGet(() -> repository.save(passive));
            }

            System.out.println("✅ Armor passives loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}