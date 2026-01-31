package com.brahmanvivah.backend.dto;

import com.brahmanvivah.backend.enums.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter @Setter
public class ProfileOnBoardingResponse {
    private Long id;//profile id
    private Gender gender;
    private Caste caste;
    private SubCaste subCaste;
    private Gotra gotra;
    private Choice choice;
    private SexualOrientation sexualOrientation;
    private Set<Hobbies> hobbies=new HashSet<>();
    private Set<Habits> habits=new HashSet<>();

}
