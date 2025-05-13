package com.avalon.compDivers.api.mappers;

import com.avalon.compDivers.api.dto.LoadoutDTO;
import com.avalon.compDivers.api.dto.LoadoutInputDTO;
import com.avalon.compDivers.api.models.*;
import com.avalon.compDivers.api.repositories.*;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import static com.avalon.compDivers.api.mappers.UserMapper.toUserDto;

@Component
public class LoadoutMapper {

    @Autowired
    private PrimaryWeaponRepository primaryWeaponRepository;
    @Autowired
    private SecondaryWeaponRepository secondaryWeaponRepository;
    @Autowired
    private ArmorRepository armorRepository;
    @Autowired
    private ArmorPassiveRepository armorPassiveRepository;
    @Autowired
    private ThrowableRepository throwableRepository;
    @Autowired
    private StratagemRepository stratagemRepository;
    @Autowired
    private BoosterRepository boosterRepository;
    @Autowired
    private FactionRepository factionRepository;
    @Autowired
    private PrimaryWeaponMapper primaryWeaponMapper;
    @Autowired
    private SecondaryWeaponMapper secondaryWeaponMapper;
    @Autowired
    private ArmorMapper armorMapper;
    @Autowired
    private ArmorPassiveMapper armorPassiveMapper;
    @Autowired
    private ThrowableMapper throwableMapper;
    @Autowired
    private StratagemMapper stratagemMapper;
    @Autowired
    private BoosterMapper boosterMapper;
    @Autowired
    private FactionMapper factionMapper;

    public LoadoutDTO toLoadoutDto(Loadout loadout) {
        if (loadout == null) return null;

        return new LoadoutDTO(
                loadout.getUuid(),
                loadout.getName(),
                loadout.getDescription(),
                primaryWeaponMapper.toDto(loadout.getPrimaryWeapon()),
                secondaryWeaponMapper.toDto(loadout.getSecondaryWeapon()),
                throwableMapper.toDto(loadout.getThrowable()),
                armorMapper.toDto(loadout.getArmor()),
                armorPassiveMapper.toDto(loadout.getArmorPassive()),
                stratagemMapper.toDtoSet(loadout.getStratagems()),
                boosterMapper.toDto(loadout.getBooster()),
                factionMapper.toDto(loadout.getFaction()),
                toUserDto(loadout.getUser())
        );
    }

    public Loadout toEntity(LoadoutInputDTO dto) {
        Loadout loadout = new Loadout();

        loadout.setName(dto.getName());
        loadout.setDescription(dto.getDescription());

        PrimaryWeapon primaryWeapon = primaryWeaponRepository.findByUuid(dto.getPrimaryWeapon())
                .orElseThrow(() -> new EntityNotFoundException("PrimaryWeapon not found"));
        SecondaryWeapon secondaryWeapon = secondaryWeaponRepository.findByUuid(dto.getSecondaryWeapon())
                .orElseThrow(() -> new EntityNotFoundException("SecondaryWeapon not found"));
        Armor armor = armorRepository.findByUuid(dto.getArmor())
                .orElseThrow(() -> new EntityNotFoundException("Armor not found"));
        ArmorPassive armorPassive = armorPassiveRepository.findByUuid(dto.getArmorPassive())
                .orElseThrow(() -> new EntityNotFoundException("ArmorPassive not found"));
        com.avalon.compDivers.api.models.Throwable throwable = throwableRepository.findByUuid(dto.getThrowable())
                .orElseThrow(() -> new EntityNotFoundException("Throwable not found"));
        Booster booster = boosterRepository.findByUuid(dto.getBooster())
                .orElseThrow(() -> new EntityNotFoundException("Booster not found"));
        Faction faction = factionRepository.findByUuid(dto.getFaction())
                .orElseThrow(() -> new EntityNotFoundException("Faction not found"));

        loadout.setPrimaryWeapon(primaryWeapon);
        loadout.setSecondaryWeapon(secondaryWeapon);
        loadout.setArmor(armor);
        loadout.setArmorPassive(armorPassive);
        loadout.setThrowable(throwable);
        loadout.setBooster(booster);
        loadout.setFaction(faction);

        Set<Stratagem> stratagems = new HashSet<>();
        for (UUID stratagemUUID : dto.getStratagems()) {
            Stratagem stratagem = stratagemRepository.findByUuid(stratagemUUID)
                    .orElseThrow(() -> new EntityNotFoundException("Stratagem not found"));
            stratagems.add(stratagem);
        }
        loadout.setStratagems(stratagems);

        return loadout;
    }
}
