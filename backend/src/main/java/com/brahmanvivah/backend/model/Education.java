package com.brahmanvivah.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="education")
@Getter @Setter
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //many education to one profile
    @ManyToOne
    @JoinColumn(name = "profile_id") //sdd  profile id column to education table
    private Profile profile;

    private String highestDegree;

    private String college;

    private String specialization;

}
