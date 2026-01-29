package com.brahmanvivah.backend.service;

import com.brahmanvivah.backend.model.Match;
import com.brahmanvivah.backend.model.Profile;
import com.brahmanvivah.backend.repository.MatchRepository;
import com.brahmanvivah.backend.repository.ProfileRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MatchService {
        private final ProfileRepository profileRepository;
        private final MatchRepository matchRepository;

        public List<Profile> findMatches(Long profileId){
            Profile profile=profileRepository.findById(profileId)
                    .orElseThrow(()->new RuntimeException(("Profile not found.")));
            return profileRepository.findByCity(profile.getCity());
        }

        public Match saveMatch(Match match){
            return matchRepository.save(match);
        }
}
