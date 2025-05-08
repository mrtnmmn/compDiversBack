package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.LoadoutDTO;
import com.avalon.compDivers.api.models.Loadout;
import com.avalon.compDivers.api.services.LoadoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/loadouts")
public class LoadoutController {

    @Autowired
    private LoadoutService loadoutService;

    @GetMapping
    public List<LoadoutDTO> getLoadouts(HttpServletRequest request) {
        return loadoutService.getLoadoutsForUser(request);
    }

    @PostMapping
    public Loadout createLoadout(@RequestBody Loadout loadout, HttpServletRequest request) {
        return loadoutService.createLoadout(loadout, request);
    }
}