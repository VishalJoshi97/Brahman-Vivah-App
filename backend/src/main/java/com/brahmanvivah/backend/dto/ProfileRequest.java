package com.brahmanvivah.backend.dto;

import com.brahmanvivah.backend.model.Profile.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProfileRequest {
    private String fullName;
    private Gender gender;
    private String caste;
    private String subCaste;
    private String gotra;
    private String city;
    private String state;
    private String bio;
}
