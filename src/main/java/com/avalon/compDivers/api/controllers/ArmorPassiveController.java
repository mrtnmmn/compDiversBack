package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.ArmorPassiveDTO;
import com.avalon.compDivers.api.services.ArmorPassiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/armor-passives")
public class ArmorPassiveController {

    @Autowired
    private ArmorPassiveService armorPassiveService;

    @GetMapping
    List<ArmorPassiveDTO> getAllArmorPassives () {
        return armorPassiveService.getAll();
    }
}
