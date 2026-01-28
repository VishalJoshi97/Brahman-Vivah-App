package com.brahmanvivah.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="matches")
@Getter @Setter
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //many matches to one profile
    @ManyToOne
    //all details(columns) of profile
    private Profile profile;

    //at least one match
    @ManyToOne
    private Profile matchedProfile;

    private Integer matchScore;
}
