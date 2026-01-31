package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Long> {

    List<Profession> findByProfileId(Long profileId);

    List<Profession> findByOccupation(String occupation);

    List<Profession> findByCompany(String company);

    List<Profession> findByAnnualIncome(Double annualIncome);
}

