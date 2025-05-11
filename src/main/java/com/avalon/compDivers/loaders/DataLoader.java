package com.avalon.compDivers.loaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    private ArmorPassiveLoader armorPassiveLoader;

    @Autowired
    private PrimaryWeaponsLoader primaryWeaponsLoader;

    @Autowired
    private WarbondsLoader warbondLoader;

    @PostConstruct
    public void loadAllData() {
        armorPassiveLoader.loadData();
        warbondLoader.loadData();
        primaryWeaponsLoader.loadData();
        System.out.println("✅ All data loaded.");
    }
}