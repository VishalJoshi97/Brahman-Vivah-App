package com.brahmanvivah.backend.service;

import org.springframework.stereotype.Service;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    //constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User register(User user) {
        return userRepository.save(user);
    }
}
