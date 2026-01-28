package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match,Long> {
    List<Match> findByProfileId(Long profileId);
}
