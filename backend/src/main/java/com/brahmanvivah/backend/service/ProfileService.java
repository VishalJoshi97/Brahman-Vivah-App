package com.brahmanvivah.backend.service;

//from dto
import com.brahmanvivah.backend.dto.profile.ProfileEditRequest;
import com.brahmanvivah.backend.dto.profile.ProfileOnBoardingRequest;

import com.brahmanvivah.backend.enums.*;
import com.brahmanvivah.backend.model.*;
import com.brahmanvivah.backend.repository.*;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ProfileService {

    //onboarding service layer
    private final ProfileRepository profileRepository;
    private final UserRepository userRepository;
    private final EducationRepository educationRepository;
    private final FamilyDetailsRepository familyDetailsRepository;
    private final PreferenceRepository preferenceRepository;
    private final ProfessionRepository professionRepository;


    //add new profile to repository=>model
    //any changes in service=>save to repo=>updates db
    //must use dto mapping
    @Transactional
    public Profile createProfile(Long userId, ProfileOnBoardingRequest request) {//dto=>repository=>model

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (profileRepository.existsByUserId(userId)) {
            throw new RuntimeException("Profile already exists for this user");
        }

        //entity.set(dto.get)
        Profile profile = new Profile();

        //format-test in postman
        profile.setUser(user); //THIS sets user_id
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


    //extract what u have saved for both-after create and edit profile
    //separate endpoints for each field
    //get profile by id
    public Profile getProfileById(Long id) {
        return profileRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Profile not found"));
    }


    //get profile by gender->from both create and edit
    public List<Profile> getProfileByGender(Gender gender) {
        return profileRepository.findByGender(gender);
    }

    //get profile by caste->from both create and edit
    public List<Profile> getProfileByCaste(Caste caste) {
        return profileRepository.findByCaste(caste);
    }

    //get profile by subcaste->from both create and edit
    public List<Profile> getProfileBySubCaste(SubCaste subCaste) {
        return profileRepository.findBySubCaste(subCaste);
    }


    //get profile by gotra->from both create and edit
    public List<Profile> getProfileByGotra(Gotra gotra) {
        return profileRepository.findByGotra(gotra);
    }

    //get profile by choice->from both create and edit
    public List<Profile> getProfileByChoice(Choice choice) {
        return profileRepository.findByChoice(choice);
    }

    //get profile by sexualOrientation->from both create and edit
    public List<Profile> getProfileBySexualOrientation(SexualOrientation sexualOrientation) {
        System.out.println("SexualOrientation: " + sexualOrientation);
        return profileRepository.findBySexualOrientation(sexualOrientation);
    }

    //get profile by Hobbies->from both create and edit
    public List<Profile> getProfileByHobbies(Set<Hobbies> hobbies, long size) {
        System.out.println("Hobbies: " + hobbies + "size: " + size);
        return profileRepository.findByAllHobbies(hobbies, size);
    }

    //get profile by Habits->from both create and edit
    public List<Profile> getProfileByHabits(Set<Habits> habits, long size) {
        System.out.println("Habits: " + habits + "size: " + size);
        return profileRepository.findByAllHabits(habits, size);
    }


    //edit service layer
    @Transactional
    public Profile editProfile(Long pid, ProfileEditRequest pEditRequest) {

        ProfileOnBoardingRequest request = new ProfileOnBoardingRequest();
        Profile profile = new Profile();

        Profile profileId = profileRepository.findById(pid)
                .orElseThrow(() -> new RuntimeException("Profile not found"));


        User user = new User();

        Education education = new Education();

        FamilyDetails familyDetails = new FamilyDetails();

        Preference preference = new Preference();

        Profession profession = new Profession();

        if (user.getName() != null) {
            profile.setFullName(pEditRequest.getFullName());
        }
        if (request.getGender() != null) {
            profile.setGender(request.getGender());
        }

        if (request.getCaste() != null) {
            profile.setCaste(request.getCaste());
        }
        if (request.getSubCaste() != null) {
            profile.setSubCaste(request.getSubCaste());
        }
        if (request.getGotra() != null) {
            profile.setGotra(request.getGotra());
        }
        if (request.getChoice() != null) {
            profile.setChoice(request.getChoice());
        }
        if (request.getSexualOrientation() != null) {
            profile.setSexualOrientation(request.getSexualOrientation());
        }
        if (request.getHobbies() != null) {
            profile.setHobbies(request.getHobbies());
        }
        if (request.getHabits() != null) {
            profile.setHabits(request.getHabits());
        }


        //education
        //education.setProfile(profile);//fk: profile_id
        if(pEditRequest.getEducation()!=null){
            List<Education> educations=pEditRequest.getEducation()
                    .stream()
                    .map(req->{
                        Education e = new Education();
                        e.setHighestDegree(req.getHighestDegree());
                        e.setCollege(req.getCollege());
                        e.setSpecialization(req.getSpecialization());
                        e.setProfile(profile);
                        return e;
                    })
                    .toList();
            profile.getEducation().clear();
            profile.getEducation().addAll(educations);
        }

        //family details
        if(pEditRequest.getFamilyDetails()!=null) {
            familyDetails.setProfile(profile);//fk: profile_id
            familyDetails.setFatherOccupation(pEditRequest.getFamilyDetails().getFatherOccupation());
            familyDetails.setMotherOccupation(pEditRequest.getFamilyDetails().getMotherOccupation());
            familyDetails.setBrothers(pEditRequest.getFamilyDetails().getBrothers());
            familyDetails.setSisters(pEditRequest.getFamilyDetails().getSisters());
            familyDetails.setFamilyType(pEditRequest.getFamilyDetails().getFamilyType());
            familyDetails.setFamilyStatus(pEditRequest.getFamilyDetails().getFamilyStatus());
        }

        //preference
        if(pEditRequest.getPreference()!=null) {
            preference.setProfile(profile);//fk: profile_id
            preference.setMinAge(pEditRequest.getPreference().getMinAge());
            preference.setMaxAge(pEditRequest.getPreference().getMaxAge());
            preference.setPreferredCity(pEditRequest.getPreference().getPreferredCity());
            preference.setPreferredEducation(pEditRequest.getPreference().getPreferredEducation());
        }

        //profession
        if(pEditRequest.getProfession()!=null) {
            profession.setProfile(profile);//fk: profile_id
            profession.setOccupation(pEditRequest.getProfession().getOccupation());
            profession.setCompany(pEditRequest.getProfession().getCompany());
            profession.setAnnualIncome(pEditRequest.getProfession().getAnnualIncome());
        }

        profile.setState(pEditRequest.getState());
        profile.setCity(pEditRequest.getCity());
        profile.setHeight(pEditRequest.getHeight());
        profile.setWeight(pEditRequest.getWeight());
        profile.setBio(pEditRequest.getBio());

        return profileRepository.save(profile);
    }

}
