package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.ProfileOnBoardingRequest;
import com.brahmanvivah.backend.dto.ProfileOnBoardingResponse;
import com.brahmanvivah.backend.enums.*;
import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/profiles")
@AllArgsConstructor
public class ProfileController {

    @Autowired
    private final ProfileService profileService;


    //covert profile DTO according to profile Entity


    //OnBoarding Controller
    private ProfileOnBoardingResponse toOnBoardResponse(Profile profile){
        ProfileOnBoardingResponse response=new ProfileOnBoardingResponse();

        response.setId(profile.getId());
        response.setGender(profile.getGender());
        response.setCaste(profile.getCaste());
        response.setSubCaste(profile.getSubCaste());
        response.setGotra(profile.getGotra());
        response.setChoice(profile.getChoice());
        response.setSexualOrientation(profile.getSexualOrientation());
        response.setHobbies(profile.getHobbies());
        response.setHabits(profile.getHabits());

        return response;
    }

    //create profile only if user exists
    //fk: user_id
    @PostMapping("/{userId}")
    public ProfileOnBoardingResponse createProfile(
            @PathVariable Long userId,
            @RequestBody ProfileOnBoardingRequest request) {

        Profile profile=profileService.createProfile(userId,request);
        return toOnBoardResponse(profile);
    }


    //get one profile by profile_id
    @GetMapping("{id}")
    public ProfileOnBoardingResponse getProfileById(@PathVariable Long id){
        Profile profile=profileService.getProfileById(id);
        return toOnBoardResponse(profile);
    }

    //get all profiles by given gender
    @GetMapping("/gender")
    public List<ProfileOnBoardingResponse> getProfileByGender(@RequestParam Gender gender){
        System.out.println("Gender: "+gender);
        return profileService.getProfileByGender(gender)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();
    }


    //caste
    @GetMapping("/caste")
    public List<ProfileOnBoardingResponse> getProfileByCaste(@RequestParam Caste caste){
        System.out.println("Caste: "+caste);
        return profileService.getProfileByCaste(caste)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }

    //subCaste
    @GetMapping("/subCaste")
    public List<ProfileOnBoardingResponse> getProfileBySubCaste(@RequestParam SubCaste subCaste){
        System.out.println("SubCaste: "+subCaste);
        return profileService.getProfileBySubCaste(subCaste)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }


    //gotra
    @GetMapping("/gotra")
    public List<ProfileOnBoardingResponse> getProfileByGotra(@RequestParam Gotra gotra){
        System.out.println("Gotra: "+gotra);
        return profileService.getProfileByGotra(gotra)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }

    //choice
    @GetMapping("/choice")
    public List<ProfileOnBoardingResponse> getProfileByGotraChoice(@RequestParam Choice choice){
        System.out.println("Choice: "+choice);
        return profileService.getProfileByChoice(choice)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }

    //choice
    @GetMapping("/sexualOrientation")
    public List<ProfileOnBoardingResponse> getProfileBySexualOrientation(@RequestParam SexualOrientation sexualOrientation){
        System.out.println("Choice: "+sexualOrientation);
        return profileService.getProfileBySexualOrientation(sexualOrientation)
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }


    //hobbies
    @GetMapping("/hobbies")
    public List<ProfileOnBoardingResponse> getProfileByHobbies(@RequestParam Set<Hobbies> hobbies){
        System.out.println("Hobbies: "+hobbies);
        return profileService.getProfileByHobbies(hobbies, hobbies.size())
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }

    //habits
    @GetMapping("/habits")
    public List<ProfileOnBoardingResponse> getProfileByHabits(@RequestParam Set<Habits> habits){
        System.out.println("Hobbies: "+habits);
        return profileService.getProfileByHabits(habits, habits.size())
                .stream()
                .map(this::toOnBoardResponse)
                .toList();

    }

    @GetMapping("/city/{city}")
    public List<ProfileOnBoardingResponse> getProfileByCity(@PathVariable String city){
        System.out.println("City: "+city);
       return profileService.getProfileByCity(city)
               .stream()
               .map(this::toOnBoardResponse)
               .toList();

    }




}
