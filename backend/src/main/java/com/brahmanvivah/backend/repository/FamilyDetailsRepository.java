package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.enums.FamilyStatus;
import com.brahmanvivah.backend.enums.FamilyType;
import com.brahmanvivah.backend.model.FamilyDetails;
import com.brahmanvivah.backend.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FamilyDetailsRepository extends JpaRepository<FamilyDetails,Long> {

    //Edit
    List<FamilyDetails> findByProfileId(Long profileId );

    List<FamilyDetails> findByFatherOccupation(String fatherOccupation);

    List<FamilyDetails> findByMotherOccupation(String motherOccupation);

    List<FamilyDetails> findByBrothers(Integer brothers);

    List<FamilyDetails> findBySisters(Integer sisters);

    List<FamilyDetails> findByFamilyType(FamilyType familyType);

    List<FamilyDetails> findByFamilyStatus(FamilyStatus familyStatus);
}
