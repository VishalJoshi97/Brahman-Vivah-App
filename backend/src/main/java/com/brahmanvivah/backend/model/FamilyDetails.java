package com.brahmanvivah.backend.model;

import com.brahmanvivah.backend.enums.FamilyStatus;
import com.brahmanvivah.backend.enums.FamilyType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="family_details")
@Getter @Setter
public class FamilyDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(optional = false)
    @JoinColumn(name = "profile_id", nullable = false, unique = true)
    private Profile profile;

    private String fatherOccupation;

    private String motherOccupation;

    private Integer brothers;

    private Integer sisters;

    private FamilyType familyType;

    private FamilyStatus familyStatus;
}
