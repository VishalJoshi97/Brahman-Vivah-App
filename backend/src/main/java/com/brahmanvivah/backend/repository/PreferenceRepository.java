package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferenceRepository extends JpaRepository<Preference,Long> {
}
