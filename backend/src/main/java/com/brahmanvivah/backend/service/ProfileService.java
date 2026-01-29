package com.brahmanvivah.backend.service;

//from dto
import com.brahmanvivah.backend.dto.ProfileRequest;

import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.ProfileRepository;
import com.brahmanvivah.backend.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;
    private final UserRepository userRepository;

    //Constructor Injection
    public ProfileService(ProfileRepository profileRepository, UserRepository userRepository){
        this.profileRepository=profileRepository;
        this.userRepository = userRepository;
    }

    //add new profile to repository=>model
    @Transactional
    public Profile createProfile(Long userId, ProfileRequest request) {//dto=>repository=>model

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (profileRepository.existsByUser(user)) {
            throw new RuntimeException("Profile already exists for this user");
        }

        //Create profile and attach user
        Profile profile = new Profile();
        profile.setUser(user); // ⭐ THIS sets user_id

        profile.setFullName(request.getFullName());
        profile.setGender(request.getGender());
        profile.setCaste(request.getCaste());
        profile.setSubCaste(request.getSubCaste());
        profile.setGotra(request.getGotra());
        profile.setCity(request.getCity());
        profile.setState(request.getState());
        profile.setBio(request.getBio());

        return profileRepository.save(profile);
    }

    //get profile by id
    public Profile getProfileById(Long id){
        return profileRepository.findById(id)
                .orElseThrow(()->new RuntimeException("Profile not found"));
    }
    //get profile by caste
    public List<Profile> getProfileByCaste(String caste) {
        return profileRepository.findByCaste(caste);
    }

    //get profile by subcaste
    public List<Profile> getProfileBySubCaste(String subCaste){
        return profileRepository.findBySubCaste(subCaste);
    }
    //get profile by gotra
    public List<Profile> getProfileByGotra(String gotra){
        System.out.println("Gotra: "+gotra);
        return profileRepository.findByGotra(gotra);
    }

    public List<Profile> getProfileByCity(String city) {
        return profileRepository.findByCity(city);
    }

}
