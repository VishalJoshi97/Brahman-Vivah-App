package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.enums.*;
import com.brahmanvivah.backend.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {

    //onboarding
    //findById is default

    List<Profile> findByUserId(Long userId);//fk
    List<Profile> findByGender(Gender gender);
    List<Profile> findByCaste(Caste caste);
    List<Profile> findBySubCaste(SubCaste subcaste);
    List<Profile> findByGotra(Gotra gotra);
    List<Profile> findByChoice(Choice choice);
    List<Profile> findBySexualOrientation(SexualOrientation sexualOrientation);

    @Query("""
            SELECT p from Profile p
            JOIN p.hobbies h
            WHERE h IN :hobbies
            GROUP BY p
            HAVING COUNT(DISTINCT h)=:size
            """)
    List<Profile> findByAllHobbies(
            @Param("hobbies")Set<Hobbies> hobbies,
            @Param("size") long size
            );

    @Query("""
            SELECT p from Profile p
            JOIN p.habits h
            WHERE h IN :habits
            GROUP BY p
            HAVING COUNT(DISTINCT h)=:size
            """)

    List<Profile> findByAllHabits(
            @Param("habits")Set<Habits> habits,
            @Param("size") long size
    );


    //Edit profile

    List<Profile> findByFullName(String fullName);

    List<Profile> findByHeight(String height);

    List<Profile> findByWeight(String weight);

    List<Profile> findByState(String state);

    List<Profile> findByCity(String city);

    List<Profile> findByBio(String bio);

    boolean existsByUserId(Long userId);
}
