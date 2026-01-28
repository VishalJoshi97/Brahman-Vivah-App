package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessionRepository extends JpaRepository<Profession, Long> {
}

