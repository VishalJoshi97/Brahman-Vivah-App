package com.brahmanvivah.backend.service;

//from dto
import com.brahmanvivah.backend.dto.ProfileOnBoardingRequest;

import com.brahmanvivah.backend.enums.*;
import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.ProfileRepository;
import com.brahmanvivah.backend.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    //onboarding service layer
    private final ProfileRepository profileRepository;
    private final UserRepository userRepository;

    //Constructor Injection
    public ProfileService(ProfileRepository profileRepository, UserRepository userRepository){
        this.profileRepository=profileRepository;
        this.userRepository = userRepository;
    }

    //add new profile to repository=>model
    //any changes in service=>save to repo=>updates db
    //must use dto mapping
    @Transactional
    public Profile createProfile(Long userId, ProfileOnBoardingRequest request) {//dto=>repository=>model

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (profileRepository.existsByUser(userId) ){
            throw new RuntimeException("Profile already exists for this user");
        }

        //entity.set(dto.get)
        Profile profile = new Profile();

        profile.setUser(user); // ⭐ THIS sets user_id
        profile.setGender(request.getGender());
        profile.setCaste(request.getCaste());
        profile.setSubCaste(request.getSubCaste());
        profile.setGotra(request.getGotra());
        profile.setChoice(request.getChoice());
        profile.setSexualOrientation(request.getSexualOrientation());
        profile.setHobbies(request.getHobbies());
        profile.setHabits(request.getHabits());

        return profileRepository.save(profile);
    }


//separate endpoints for each field
    //get profile by id
    public Profile getProfileById(Long id){
        return profileRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Profile not found"));
    }
    //get profile by caste
    public List<Profile> getProfileByCaste(Caste caste) {
        return profileRepository.findByCaste(caste);
    }

    //get profile by subcaste
    public List<Profile> getProfileBySubCaste(SubCaste subCaste){
        return profileRepository.findBySubCaste(subCaste);
    }
    //get profile by gotra
    public List<Profile> getProfileBySexualOrientation(sexualOrientation){
        System.out.println("Gotra: "+sexualOrientation);
        return profileRepository.findBySexualOrientation(sexualOrientation);
    }

    //get profile by choices
    public List<Profile> getProfileByHobbies(Hobbies hobbies){
        System.out.println("Hobbies: "+hobbies);
        return profileRepository.findByAllHobbies(hobbies);
    }

    //get profile by choices
    public List<Profile> getProfileByHabits(Gotra gotra){
        System.out.println("Gotra: "+gotra);
        return profileRepository.findByGotra(gotra);
    }

}
