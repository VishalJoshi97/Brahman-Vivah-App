package com.brahmanvivah.backend;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private int age;
    private String gender;
    private String profession;
    private String city;
    private String gotra;

    // Constructors
    public User() {}

    public User(String fullName, int age, String gender, String profession, String city, String gotra) {
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
        this.profession = profession;
        this.city = city;
        this.gotra = gotra;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getProfession() { return profession; }
    public void setProfession(String profession) { this.profession = profession; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getGotra() { return gotra; }
    public void setGotra(String gotra) { this.gotra = gotra; }
}
