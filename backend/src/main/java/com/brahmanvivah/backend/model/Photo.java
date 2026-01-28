package com.brahmanvivah.backend.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="photos")
@Getter @Setter
public class Photo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //many photos to one profile
    @ManyToOne
    @JoinColumn(name = "profile_id")
    private Profile profile;

    private String imageUrl;

    private boolean isProfilePic;
}
