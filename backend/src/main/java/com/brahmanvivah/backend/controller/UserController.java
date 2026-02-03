package com.brahmanvivah.backend.controller;

import com.brahmanvivah.backend.dto.user.UserRegisterRequest;
import com.brahmanvivah.backend.dto.user.UserResponse;
import com.brahmanvivah.backend.model.User;
import com.brahmanvivah.backend.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@CrossOrigin(origins = "*")
//@AllArgsConstructor
public class UserController {

    //Constructor Injection
    private final UserService userService;

    public UserController(UserService userService){
        this.userService=userService;
    }

    //convert DTO according to Entity
    private UserResponse toResponse(User user) {
        UserResponse res = new UserResponse();
        res.setId(user.getId());
        res.setName(user.getName());
        res.setEmail(user.getEmail());
        res.setPhone(user.getPhone());
        res.setBday(user.getBday());
        return res;
    }

    //for onboarding
    @PostMapping("/register")
    public UserResponse registerUser( @RequestBody  UserRegisterRequest request){
//        return userService.registerUser(request);
        User user = userService.registerUser(request);
        return toResponse(user);
    }

//    @GetMapping("{id}")
//    public Optional<User> getUser(@PathVariable Long id){
//        return userService.getUserById(id);
//    }

    //optional=>unique
    @GetMapping("{id}")
    //it's an optional method in service layer
    public UserResponse getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id)//same data type
                .orElseThrow(() -> new RuntimeException("User not found"));
        return toResponse(user);
    }

    //can be same names
    @GetMapping("/name/{name}")
   public List<UserResponse> getUserByName(@PathVariable String name){
      return  userService.getUserByName(name)
              .stream()
              .map(this::toResponse)
              .toList();

    }

    //optional=>unique
    @GetMapping("/email/{email}")
    public UserResponse getUserByEmail(@PathVariable String email){
        User user =userService.getUserByEmail(email)
                .orElseThrow(() -> new RuntimeException("User Email not found"));
        return  toResponse(user);
    }

}
