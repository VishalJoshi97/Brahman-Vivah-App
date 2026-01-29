package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfileRepository extends JpaRepository<Profile,Long> {
    List<Profile> findByCity(String city);

    List<Profile> findByCaste(String caste);

    List<Profile> findBySubCaste(String subcaste);

    List<Profile> findByGotra(String gotra);

    boolean existsByUser(User user);
}
