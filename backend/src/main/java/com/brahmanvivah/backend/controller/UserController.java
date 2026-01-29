package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.UserRegisterRequest;
import com.brahmanvivah.backend.dto.UserResponse;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/users")
//@AllArgsConstructor
public class UserController {

    //Constructor Injection
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }
    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    //for onboarding
    @PostMapping("/register")
    public UserResponse registerUser(UserRegisterRequest request){
        return userService.getRegisteredUsers(request);
    }

    @GetMapping("{id}")
    public Optional<User> getUser(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @GetMapping("/name/{name}")
    public List<User> getUserByName(@PathVariable String name){
        return userService.getUserByName(name);
    }

    @GetMapping("/email/{email}")
    public Optional<User> getUserByEmail(@PathVariable String email){
        return userService.getUserByEmail(email);
    }

}
