package com.brahmanvivah.backend.dto;

import com.brahmanvivah.backend.enums.Gender;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProfileOnBoardingRequest {
    private Gender gender;
    private String caste;
    private String subCaste;
    private String gotra;
}
