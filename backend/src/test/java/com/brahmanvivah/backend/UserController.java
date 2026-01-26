package com.brahmanvivah.controller;

import com.brahmanvivah.model.User;
import com.brahmanvivah.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*") // For React Native / Frontend
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // ✅ Create Profile
    @PostMapping
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // ✅ Get All Profiles
    @GetMapping
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // ✅ Get Profile By ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // ✅ Filter By City
    @GetMapping("/city/{city}")
    public List<User> getByCity(@PathVariable String city) {
        return userRepository.findByCity(city);
    }

    // ✅ Filter By Gender
    @GetMapping("/gender/{gender}")
    public List<User> getByGender(@PathVariable String gender) {
        return userRepository.findByGender(gender);
    }

    // ✅ Delete Profile
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return "User deleted successfully";
    }
}
