package com.brahmanvivah.backend.service;

import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.repository.ProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {

    private final ProfileRepository profileRepository;

    //Constructor Injection
    public ProfileService(ProfileRepository profileRepository){
        this.profileRepository=profileRepository;
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
        return profileRepository.findByCity(gotra);
    }

    //-------------------->save profile  <-----------------
    public Profile saveProfile(Profile profile){
        return profileRepository.save(profile);//inbuilt method
    }

    public List<Profile> getProfileByCity(String city) {
        return profileRepository.findByCity(city);
    }

}
