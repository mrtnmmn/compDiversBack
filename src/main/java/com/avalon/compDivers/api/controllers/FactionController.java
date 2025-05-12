package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.FactionDTO;
import com.avalon.compDivers.api.services.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/factions")
public class FactionController {

    @Autowired
    FactionService factionService;

    @GetMapping
    private ResponseEntity<List<FactionDTO>> getAllFactions() {
        List<FactionDTO> factions = factionService.findAllFactions();
        return new ResponseEntity<>(factions, HttpStatus.OK);
    }
}
