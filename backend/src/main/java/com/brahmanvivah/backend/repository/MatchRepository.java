package com.brahmanvivah.backend.repository;

import com.brahmanvivah.backend.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatchRepository extends JpaRepository<Match,Long> {
    List<Match> findByProfileId(Long profileId);
}
