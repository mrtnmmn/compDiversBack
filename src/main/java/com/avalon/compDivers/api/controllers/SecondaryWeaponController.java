package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.SecondaryWeaponDTO;
import com.avalon.compDivers.api.services.SecondaryWeaponService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/secondary-weapons")
public class SecondaryWeaponController {
    private final SecondaryWeaponService service;

    public SecondaryWeaponController(SecondaryWeaponService service) {
        this.service = service;
    }

    @GetMapping
    public List<SecondaryWeaponDTO> getAll() {
        return service.getAll();
    }
}