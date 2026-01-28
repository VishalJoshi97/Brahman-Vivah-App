package com.brahmanvivah.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.brahmanvivah.backend.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByEmail(String email);
}