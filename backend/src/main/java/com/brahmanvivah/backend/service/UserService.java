package com.brahmanvivah.backend.service;

import com.brahmanvivah.backend.dto.user.UserRegisterRequest;
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

    //add new user to repository=>model
    //any changes in service=>updates repo=>updates db
    public User registerUser(UserRegisterRequest request){

        User user;
        if(request.getId()==null) {
            if (request.getEmail() != null && userRepository.existsByEmail(request.getEmail())) {
                throw new RuntimeException(("Email already Exists."));
            }

            if (request.getPhone() != null && userRepository.existsByPhone(request.getPhone())) {
                throw new RuntimeException(("Phone already Exists."));
            }

            user = new User();
            user.setEmail(request.getEmail());
            user.setPhone(request.getPhone());
            user.setRole(User.Role.USER);
            user.setActive(true);
            user.setVerified(false);
        }
        else {
            //optional=>unique
            user=userRepository.findById(request.getId())
                    .orElseThrow(() -> new RuntimeException("User not found"));

        }

        if (request.getName() != null){
            user.setName(request.getName());
        }

        if (request.getBday() != null){
            user.setBday(request.getBday());
        }

        if (request.getPassword() != null) {
            user.setPassword(passwordEncoder.encode(request.getPassword()));
        }
        return userRepository.save(user);
    }

    //optional=>unique
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);//given by Spring boot
    }

    public List<User> getUserByName(String name){
        return userRepository.findByName(name);
    }

    public List<User> getUserByBday(String bday){
        return userRepository.findByBday(bday);
    }

    //optional=>unique
    public Optional<User> getUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    public List<User> getUserByPhone(String phone){
        return userRepository.findByPhone(phone);
    }

    public List<User> getRegisteredUsers() {
        return userRepository.findAll();
    }
}
