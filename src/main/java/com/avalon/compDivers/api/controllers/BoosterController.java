package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.BoosterDTO;
import com.avalon.compDivers.api.services.BoosterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/boosters")
public class BoosterController {
    private final BoosterService service;

    public BoosterController(BoosterService service) {
        this.service = service;
    }

    @GetMapping
    public List<BoosterDTO> getAll() {
        return service.getAll();
    }
}