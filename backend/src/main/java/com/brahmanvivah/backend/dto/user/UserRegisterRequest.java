package com.brahmanvivah.backend.dto.user;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRegisterRequest {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String password;
    private String bday;
}
