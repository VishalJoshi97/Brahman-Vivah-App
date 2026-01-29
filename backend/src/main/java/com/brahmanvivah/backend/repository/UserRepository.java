package com.brahmanvivah.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.brahmanvivah.backend.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
   Optional<User> findByEmail(String email);

    List<User> findByName(String name);

    List<User> findByBday(String bday);

    List<User> findByPhone(String phone);

    List<User> findByPassword(String password);
}