package com.avalon.compDivers.api.controllers;

import com.avalon.compDivers.api.dto.WarbondDTO;
import com.avalon.compDivers.api.services.WarbondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/warbonds")
public class WarbondController {

    @Autowired
    private WarbondService warbondService;

    @GetMapping
    public List<WarbondDTO> getAll() {
        return warbondService.getAll();
    }
}
