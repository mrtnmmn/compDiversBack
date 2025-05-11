package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.PrimaryWeapon;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.PrimaryWeaponRepository;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class PrimaryWeaponsLoader {

    @Autowired
    private PrimaryWeaponRepository repository;

    @Autowired
    private WarbondRepository warbondRepository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/primary_weapons.json");
            List<PrimaryWeapon> primaryWeapons = mapper.readValue(inputStream, new TypeReference<List<PrimaryWeapon>>() {});


            for (PrimaryWeapon primaryWeapon : primaryWeapons) {
                Warbond inputWarbond = primaryWeapon.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    primaryWeapon.setWarbond(warbondFromDb.orElse(null));
                }

                repository.findByName(primaryWeapon.getName().trim())
                        .orElseGet(() -> repository.save(primaryWeapon));
            }


            System.out.println("✅ Primary weapons loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}