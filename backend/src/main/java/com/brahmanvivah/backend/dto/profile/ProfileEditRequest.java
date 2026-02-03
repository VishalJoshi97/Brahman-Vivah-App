package com.brahmanvivah.backend.dto.profile;

import com.brahmanvivah.backend.model.Education;
import com.brahmanvivah.backend.model.FamilyDetails;
import com.brahmanvivah.backend.model.Preference;
import com.brahmanvivah.backend.model.Profession;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class ProfileEditRequest {
    private String fullName;
    private Integer height;
    private Integer weight;
    private List<Education> education;
    private FamilyDetails familyDetails;
    private String state;
    private String city;
    private String bio;
    private Preference preference;
    private Profession profession;

}
