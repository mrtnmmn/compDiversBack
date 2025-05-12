package com.avalon.compDivers.loaders;

import com.avalon.compDivers.api.models.SecondaryWeapon;
import com.avalon.compDivers.api.models.Warbond;
import com.avalon.compDivers.api.repositories.SecondaryWeaponRepository;
import com.avalon.compDivers.api.repositories.WarbondRepository;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Service
public class SecondaryWeaponsLoader {

    @Autowired
    private SecondaryWeaponRepository repository;

    @Autowired
    private WarbondRepository warbondRepository;

    public void loadData() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = getClass().getResourceAsStream("/data/secondary_weapons.json");
            List<SecondaryWeapon> secondaryWeapons = mapper.readValue(inputStream, new TypeReference<List<SecondaryWeapon>>() {});


            for (SecondaryWeapon secondaryWeapon : secondaryWeapons) {
                Warbond inputWarbond = secondaryWeapon.getWarbond();

                if (inputWarbond != null) {
                    Optional<Warbond> warbondFromDb = warbondRepository.findByName(inputWarbond.getName());
                    secondaryWeapon.setWarbond(warbondFromDb.orElse(null));
                }

                repository.findByName(secondaryWeapon.getName().trim())
                        .orElseGet(() -> repository.save(secondaryWeapon));
            }


            System.out.println("✅ Secondary weapons loaded into database.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}