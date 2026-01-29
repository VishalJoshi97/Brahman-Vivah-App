package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.service.MatchService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/matches")
@AllArgsConstructor
public class MatchController {

    private final MatchService matchService;

    @GetMapping("/{profileId}")
    public List<Profile> getMatches(@PathVariable Long profileId){
        return matchService.findMatches(profileId);
    }
}
