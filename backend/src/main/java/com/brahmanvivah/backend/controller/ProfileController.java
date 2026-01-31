package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.ProfileOnBoardingRequest;
import com.brahmanvivah.backend.dto.ProfileOnBoardingResponse;
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

    private ProfileOnBoardingResponse toResponse(Profile profile){
        ProfileOnBoardingResponse response=new ProfileOnBoardingResponse();

        response.setId(profile.getId());
        response.setGender(profile.getGender());
        response.setCaste(profile.getCaste());
        response.setSubCaste(profile.getSubCaste());
        response.setGotra(profile.getGotra());

        return response;
    }

    //create profile only if user exists
    @PostMapping("/{userId}")
    public ProfileOnBoardingResponse createProfile(
            @PathVariable Long userId,
            @RequestBody ProfileOnBoardingRequest request) {

        Profile profile=profileService.createProfile(userId,request);
        return toResponse(profile);
    }


    @GetMapping("{id}")
    public ProfileOnBoardingResponse getProfileById(@PathVariable Long id){
        Profile profile=profileService.getProfileById(id);
        return toResponse(profile);
    }

    @GetMapping("/city/{city}")
    public List<ProfileOnBoardingResponse> getProfileByCity(@PathVariable String city){
        System.out.println("City: "+city);
       return profileService.getProfileByCity(city)
               .stream()
               .map(this::toResponse)
               .toList();

    }

    @GetMapping("/caste/{caste}")
    public List<ProfileOnBoardingResponse> getProfileByCaste(@PathVariable String caste){
        System.out.println("City: "+caste);
        return profileService.getProfileByCaste(caste)
                .stream()
                .map(this::toResponse)
                .toList();

    }

    @GetMapping("/subCaste/{subCaste}")
    public List<ProfileOnBoardingResponse> getProfileBySubCaste(@PathVariable String subCaste){
        System.out.println("City: "+subCaste);
        return profileService.getProfileBySubCaste(subCaste)
                .stream()
                .map(this::toResponse)
                .toList();

    }

    @GetMapping("/gotra/{gotra}")
    public List<ProfileOnBoardingResponse> getProfileByGotra(@PathVariable String gotra){
        System.out.println("City: "+gotra);
        return profileService.getProfileByGotra(gotra)
                .stream()
                .map(this::toResponse)
                .toList();

    }

}
