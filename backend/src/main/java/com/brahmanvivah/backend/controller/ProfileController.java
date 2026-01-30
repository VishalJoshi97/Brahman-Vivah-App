package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.ProfileRequest;
import com.brahmanvivah.backend.dto.ProfileResponse;
import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/profiles")
@AllArgsConstructor
public class ProfileController {

    @Autowired
    private final ProfileService profileService;

    //covert profile DTO according to profile Entity

    private ProfileResponse toResponse(Profile profile){
        ProfileResponse response=new ProfileResponse();

        response.setId(profile.getId());
        response.setFullName(profile.getFullName());
        response.setGender(profile.getGender());
        response.setCaste(profile.getCaste());
        response.setSubCaste(profile.getSubCaste());
        response.setGotra(profile.getGotra());
        response.setCity(profile.getCity());
        response.setState(profile.getState());
        response.setBio(profile.getBio());

        return response;
    }

    //create profile only if user exists
    @PostMapping("/{userId}")
    public ProfileResponse createProfile(
            @PathVariable Long userId,
            @RequestBody ProfileRequest request) {

        Profile profile=profileService.createProfile(userId,request);
        return toResponse(profile);
    }


    @GetMapping("{id}")
    public ProfileResponse getProfileById(@PathVariable Long id){
        Profile profile=profileService.getProfileById(id);
        return toResponse(profile);
    }

    @GetMapping("/city/{city}")
    public List<ProfileResponse> getProfileByCity(@PathVariable String city){
        System.out.println("City: "+city);
       return profileService.getProfileByCity(city)
               .stream()
               .map(this::toResponse)
               .toList();

    }

    @GetMapping("/caste/{caste}")
    public List<ProfileResponse> getProfileByCaste(@PathVariable String caste){
        System.out.println("City: "+caste);
        return profileService.getProfileByCaste(caste)
                .stream()
                .map(this::toResponse)
                .toList();

    }

    @GetMapping("/subCaste/{subCaste}")
    public List<ProfileResponse> getProfileBySubCaste(@PathVariable String subCaste){
        System.out.println("City: "+subCaste);
        return profileService.getProfileBySubCaste(subCaste)
                .stream()
                .map(this::toResponse)
                .toList();

    }

    @GetMapping("/gotra/{gotra}")
    public List<ProfileResponse> getProfileByGotra(@PathVariable String gotra){
        System.out.println("City: "+gotra);
        return profileService.getProfileByGotra(gotra)
                .stream()
                .map(this::toResponse)
                .toList();

    }

}
