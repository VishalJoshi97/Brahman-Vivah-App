package com.brahmanvivah.backend.controller;

import org.springframework.web.bind.annotation.*;


@RestController
//@RequestMapping("/api/auth")
//@CrossOrigin("*")
public class AuthController {

//    private final UserService service;

//    public AuthController(UserService service) {
//        this.service = service;
//    }

//    @PostMapping("/register")
//    public User register(@RequestBody User user) {
//        return service.register(user);
//    }

    @GetMapping("/hi")
    public String test() {
        return "Brahman Vivah API Working!";
    }
}
