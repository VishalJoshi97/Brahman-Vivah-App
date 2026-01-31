package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference,Long> {

    //Edit profile
    List<Preference> findByProfileId(Long profileId);

    List<Preference> findByMinAge(Integer minAge);

    List<Preference> findByMaxAge(Integer maxAge);

    List<Preference> findByPreferredCity(String preferredCity);

    List<Preference> findByPreferredEducation(String preferredEducation);

}
