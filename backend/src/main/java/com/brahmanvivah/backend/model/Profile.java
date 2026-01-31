package com.brahmanvivah.backend.model;

import com.brahmanvivah.backend.enums.*;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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

    @Column(nullable = false)
    private Hobbies hobbies;

    @Column(nullable = false)
    private Habits habits;

    //Edit profile (with onboarding details)
    private String fullName;

    private String state;

    private String city;

    @Column(length = 1000)
    private String bio;

}
