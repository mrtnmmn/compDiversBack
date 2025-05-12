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


            for (Stratagem stratagem : stratagems) {
                Warbond inputWarbond = stratagem.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    stratagem.setWarbond(warbondFromDb.orElse(null));
                }

                repository.findByName(stratagem.getName().trim())
                        .orElseGet(() -> repository.save(stratagem));
            }

            System.out.println("✅ Stratagems loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
