package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EducationRepository extends JpaRepository<Education,Long> {
    //Edit profile

    List<Education> findByProfileId(Long profileId);

    List<Education> findByHighestDegree(String degree);

    List<Education> findByCollege(String college);

    List<Education> findBySpecialization(String specialization);
}
