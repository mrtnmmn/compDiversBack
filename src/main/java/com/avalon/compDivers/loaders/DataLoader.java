package com.avalon.compDivers.loaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    private ArmorPassiveLoader armorPassiveLoader;

    @Autowired
    private BoostersLoader boostersLoader;

    @Autowired
    private FactionsLoader factionsLoader;

    @Autowired
    private PrimaryWeaponsLoader primaryWeaponsLoader;

    @Autowired
    private SecondaryWeaponsLoader secondaryWeaponsLoader;

    @Autowired
    private StratagemsLoader stratagemsLoader;

    @Autowired
    private WarbondsLoader warbondLoader;

    @PostConstruct
    public void loadAllData() {
        factionsLoader.loadData();
        armorPassiveLoader.loadData();
        warbondLoader.loadData();
        primaryWeaponsLoader.loadData();
        secondaryWeaponsLoader.loadData();
        stratagemsLoader.loadData();
        boostersLoader.loadData();
        System.out.println("✅ All data loaded.");
    }
}