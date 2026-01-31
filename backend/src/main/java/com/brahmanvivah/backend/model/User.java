 package com.brahmanvivah.backend.model;

 import jakarta.persistence.*;
 import lombok.AllArgsConstructor;
 import lombok.Getter;
 import lombok.NoArgsConstructor;
 import lombok.Setter;
 import org.antlr.v4.runtime.misc.NotNull;

 @Entity
 @Table(name="users")
 @Getter @Setter
 @NoArgsConstructor @AllArgsConstructor
 public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;


     @NotNull
     private String name;

     @NotNull
     private String bday;

     @Column(nullable = false, unique = true)
     private String email;

     @Column(nullable = false,unique = true)
     private String phone;

     @NotNull
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