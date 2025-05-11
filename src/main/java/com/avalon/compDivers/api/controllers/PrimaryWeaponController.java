package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.PrimaryWeaponDTO;
import com.avalon.compDivers.api.services.PrimaryWeaponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/primary-weapons")
public class PrimaryWeaponController {

    private final PrimaryWeaponService service;

    public PrimaryWeaponController(PrimaryWeaponService service) {
        this.service = service;
    }

    @GetMapping
    public List<PrimaryWeaponDTO> getAllPrimaryWeapons() {
        return service.getAll();
    }
}