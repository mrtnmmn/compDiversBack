package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.Throwable;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.ThrowableRepository;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class ThrowablesLoader {

    @Autowired
    private ThrowableRepository repository;

    @Autowired
    private WarbondRepository warbondRepository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/throwables.json");
            List<Throwable> throwables = mapper.readValue(inputStream, new TypeReference<List<Throwable>>() {});


            for (Throwable throwable : throwables) {
                Warbond inputWarbond = throwable.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    throwable.setWarbond(warbondFromDb.orElse(null));
                }

                repository.findByName(throwable.getName().trim())
                        .orElseGet(() -> repository.save(throwable));
            }

            System.out.println("✅ Throwables loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}