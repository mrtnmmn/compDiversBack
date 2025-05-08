package com.avalon.compDivers.api.services;

import com.avalon.compDivers.api.dto.LoadoutDTO;
import com.avalon.compDivers.api.mappers.LoadoutMapper;
import com.avalon.compDivers.api.models.User;
import com.avalon.compDivers.api.repositories.UserRepository;
import com.avalon.compDivers.utils.JwtUtil;
import com.avalon.compDivers.api.models.Loadout;
import com.avalon.compDivers.api.repositories.LoadoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class LoadoutService {

    @Autowired
    private LoadoutRepository loadoutRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private JwtUtil jwtUtil;

    public Loadout createLoadout(Loadout loadout, HttpServletRequest request) {
        String username = extractUsernameFromToken(request);
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        loadout.setUuid(UUID.randomUUID());
        loadout.setUser(user);

        return loadoutRepository.save(loadout);
    }

    public List<LoadoutDTO> getLoadoutsForUser(HttpServletRequest request) {
        String username = extractUsernameFromToken(request);
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));

        List<Loadout> loadouts = loadoutRepository.findByUser(user);

        return loadouts.stream()
                .map(LoadoutMapper::toLoadoutDto)
                .collect(Collectors.toList());
    }

    private String extractUsernameFromToken(HttpServletRequest request) {
        String token = request.getHeader("Authorization");
        if (token == null || !token.startsWith("Bearer ")) {
            throw new RuntimeException("Invalid or missing Authorization header");
        }
        return jwtUtil.extractUsername(token.substring(7));
    }
}