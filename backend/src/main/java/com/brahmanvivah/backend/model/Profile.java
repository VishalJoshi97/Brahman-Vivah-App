package com.brahmanvivah.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="profiles")
@Getter @Setter
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //one profile to one user
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id",nullable = false)//join with user_is as fk
    private User user;

    private String fullName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String caste;

    private String subCaste;

    private String gotra;

    private String city;

    private String state;

    @Column(length = 1000)
    private String bio;

    public enum Gender{
        Male,
        Female
    }
}
