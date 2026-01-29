package com.brahmanvivah.backend.service;

import com.brahmanvivah.backend.config.SecurityConfig;
import com.brahmanvivah.backend.dto.UserRegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    //constructor Injection
//    public UserService(UserRepository userRepository) {
//        this.userRepository = userRepository;
//    }
    public User registerUser(UserRegisterRequest request){
        if (userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException(("Email already Exists."));
        }

        if(userRepository.existsByPhone(request.getPhone())){
            throw new RuntimeException(("Phone already Exists."));
        }

        User user=new User();
        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPhone(request.getPhone());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole(User.Role.USER);
        user.setActive(true);
        user.setVerified(false);

        return userRepository.save(user);

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
