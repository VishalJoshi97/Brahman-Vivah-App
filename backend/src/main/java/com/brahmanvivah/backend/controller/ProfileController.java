package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.ProfileRequest;
import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profiles")
@AllArgsConstructor
public class ProfileController {

    private final ProfileService profileService;

    @PostMapping("/{userId}")
    public Profile createProfile(
            @PathVariable Long userId,
            @RequestBody ProfileRequest request) {

        return profileService.createProfile(userId, request);
    }


    @GetMapping("{id}")
    public Profile getProfile(@PathVariable Long id){
        return profileService.getProfileById(id);
    }

    @GetMapping("/city/{city}")
    public List<Profile> getProfileByCity(@PathVariable String city){
        System.out.println("City: "+city);
        return profileService.getProfileByCity(city);
    }

    @GetMapping("/caste/{caste}")
    public List<Profile> getProfileByCaste(@PathVariable String caste){
        return profileService.getProfileByCaste(caste);
    }

    @GetMapping("/subCaste/{subCaste}")
    public List<Profile> getProfileBySubCaste(@PathVariable String subCaste){
        return profileService.getProfileBySubCaste(subCaste);
    }

    @GetMapping("/gotra/{gotra}")
    public List<Profile> getProfileByGotra(@PathVariable String gotra){
        return profileService.getProfileByGotra(gotra);
    }

}
