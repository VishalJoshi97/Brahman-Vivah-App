package com.brahmanvivah.backend.service;

import org.springframework.stereotype.Service;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    //constructor Injection
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);//given by Spring boot
    }

    public List<User> getUserByName(String name){
        return userRepository.findByName(name);
    }

    public List<User> getUserByBday(String bday){
        return userRepository.findByBday(bday);
    }

    public Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public List<User> getUserByPhone(String phone){
        return userRepository.findByPhone(phone);
    }

    public List<User> getUserByPassword(String password){
        return userRepository.findByPassword(password);
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getRegisteredUsers() {
        return userRepository.findAll();
    }
}
