package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.ThrowableDTO;
import com.avalon.compDivers.api.services.ThrowableService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/throwables")
public class ThrowableController {
    private final ThrowableService service;

    public ThrowableController(ThrowableService service) {
        this.service = service;
    }

    @GetMapping
    public List<ThrowableDTO> getAll() {
        return service.getAll();
    }
}