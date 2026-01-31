package com.brahmanvivah.backend.model;

import com.brahmanvivah.backend.enums.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="profiles")
@Getter @Setter
public class Profile {

    //onboarding
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //one profile to one user
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)//join with user_id as fk
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Column(nullable = false)
    private Caste caste;

    @Column(nullable = false)
    private SubCaste subCaste;

    @Column(nullable = false)
    private Gotra gotra;

    @Column(nullable = false)
    private Choice choice;

    @Column(nullable = false)
    private SexualOrientation sexualOrientation;


    //Can be more than one
    @ElementCollection(targetClass = Habits.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "profile_habits",
            joinColumns = @JoinColumn(name = "profile_id")
    )
    @Column(nullable = false)
    private Set<Hobbies> hobbies=new HashSet<>();

    //Can be more than one
    @ElementCollection(targetClass = Hobbies.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "profile_hobbies",
            joinColumns = @JoinColumn(name = "profile_id")
    )
    @Column(nullable = false)
    private Set<Habits> habits=new HashSet<>();

    //Edit profile (with onboarding details)
    private String fullName;

    private Integer height;

    private Integer weight;

    //Note:with other entity relationship
    @OneToMany
    @JoinColumn(name = "education_id",nullable = false)//refers to profile_id
    private List<Education> education=new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "family_details_id",nullable = false)//refers to profile_id
    private FamilyDetails familyDetails;

    private String state;

    private String city;

    @Column(length = 1000)
    private String bio;

}
