package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Armor;
import com.avalon.compDivers.api.repositories.ArmorRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;

@Service
public class ArmorsLoader {

    @Autowired
    private ArmorRepository repository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/armors.json");
            List<Armor> armors = mapper.readValue(inputStream, new TypeReference<List<Armor>>() {});


            for (Armor armor : armors) {
                repository.findByCategory(armor.getCategory().trim())
                        .orElseGet(() -> repository.save(armor));
            }

            System.out.println("✅ Armors loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
