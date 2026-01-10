package com.brahmanvivah.backend.service;

import org.springframework.stereotype.Service;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        return repo.save(user);
    }
}
