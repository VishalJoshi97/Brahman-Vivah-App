 package com.brahmanvivah.backend.model;

 import jakarta.persistence.*;
 import lombok.AllArgsConstructor;
 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;

 @Entity
 @Table(name="users")
 @Getter @Setter
 @NoArgsConstructor @AllArgsConstructor
 public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;


     private String name;

     private String bday;

     @Column(unique = true,nullable = false)
     private String email;

     @Column(unique = true)
     private String phone;

     private String password;

     @Enumerated(EnumType.STRING)
     private Role role =Role.USER;

     public enum Role{
         USER,
         ADMIN
     }
     private boolean isVerified;

     private boolean isActive;

}