package com.brahmanvivah.repository;

import com.brahmanvivah.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByCity(String city);

    List<User> findByGender(String gender);
}
