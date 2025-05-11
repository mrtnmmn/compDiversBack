package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.ArmorDTO;
import com.avalon.compDivers.api.services.ArmorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/armors")
public class ArmorController {
    private final ArmorService service;

    public ArmorController(ArmorService service) {
        this.service = service;
    }

    @GetMapping
    public List<ArmorDTO> getAll() {
        return service.getAll();
    }
}