package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.StratagemDTO;
import com.avalon.compDivers.api.services.StratagemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/stratagems")
public class StratagemController {
    private final StratagemService service;

    public StratagemController(StratagemService service) {
        this.service = service;
    }

    @GetMapping
    public List<StratagemDTO> getAll() {
        return service.getAll();
    }
}