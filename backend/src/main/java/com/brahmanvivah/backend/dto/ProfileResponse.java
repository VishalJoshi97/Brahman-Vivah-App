package com.brahmanvivah.backend.dto;

import com.brahmanvivah.backend.model.Profile;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProfileResponse {
    private Long id;
    private String fullName;
    private Profile.Gender gender;
    private String caste;
    private String subCaste;
    private String gotra;
    private String city;
    private String state;
    private String bio;
}
