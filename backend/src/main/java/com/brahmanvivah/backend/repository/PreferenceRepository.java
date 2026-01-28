package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Preference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreferenceRepository extends JpaRepository<Preference,Long> {
}
