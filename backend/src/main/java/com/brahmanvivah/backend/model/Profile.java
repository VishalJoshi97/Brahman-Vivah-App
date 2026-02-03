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

    //---------------onboarding--------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //---------ownership style-----------
    //one profile to one user
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)//join with user_id as fk
    //owning
    private User user;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Caste caste;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SubCaste subCaste;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gotra gotra;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Choice choice;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SexualOrientation sexualOrientation;


    //Can be more than one
    @ElementCollection(targetClass = Hobbies.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "profile_hobbies",
            joinColumns = @JoinColumn(name = "profile_id")
    )
    @Column(nullable = false)
    private Set<Hobbies> hobbies=new HashSet<>();

    //Can be more than one
    @ElementCollection(targetClass = Habits.class,fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    @CollectionTable(
            name = "profile_habits",
            joinColumns = @JoinColumn(name = "profile_id")
    )
    @Column(nullable = false)
    private Set<Habits> habits=new HashSet<>();



    //------------Edit profile (along with onboarding details)---------------
    private String fullName;

    private Integer height;

    private Integer weight;

    //Note:with other entity relationship
    //mappedBy = "I have a field, but I don’t own the FK"->inverse side
    @OneToMany(mappedBy = "profile",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Education> education=new ArrayList<>();

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL,orphanRemoval = true)
    private FamilyDetails familyDetails;

    private String state;

    private String city;

    @Column(length = 1000)
    private String bio;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL,orphanRemoval = true)
    private Preference preference;

    @OneToOne(mappedBy = "profile",cascade = CascadeType.ALL,orphanRemoval = true)
    private Profession profession;

}
