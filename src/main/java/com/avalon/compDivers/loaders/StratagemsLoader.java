package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Stratagem;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.StratagemRepository;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class StratagemsLoader {

    @Autowired
    private StratagemRepository repository;

    @Autowired
    private WarbondRepository warbondRepository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/stratagems.json");
            List<Stratagem> stratagems = mapper.readValue(inputStream, new TypeReference<List<Stratagem>>() {});

            for (Stratagem incoming : stratagems) {
                Warbond inputWarbond = incoming.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    incoming.setWarbond(warbondFromDb.orElse(null));
                }

                Optional<Stratagem> existingOpt = repository.findByName(incoming.getName().trim());

                if (existingOpt.isPresent()) {
                    Stratagem existing = existingOpt.get();

                    existing.setCategory(incoming.getCategory());
                    existing.setStratagemType(incoming.getStratagemType());
                    existing.setWarbond(incoming.getWarbond());

                    repository.save(existing);
                } else {
                    // Make sure UUID is set if not coming from JSON
                    if (incoming.getUuid() == null) {
                        incoming.setUuid(UUID.randomUUID());
                    }

                    repository.save(incoming);
                }
            }

            System.out.println("✅ Stratagems loaded and updated in the database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}