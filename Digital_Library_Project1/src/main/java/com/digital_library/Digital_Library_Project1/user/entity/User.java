package com.digital_library.Digital_Library_Project1.user.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="user_name",unique=true,nullable = false)
    String userName;

    @Column(name="full_name",nullable = false)
    String fullName;

    @Column(name="age",nullable = false)
    Integer age;

    @Column(unique = true,nullable = false)
    String gmail;

    @Column(nullable = false)
    String password;

    @Column(name="phone_number",unique = true,nullable = false)
    String phoneNumber;

    @Column(nullable = false)
    String adress;

    @Column(columnDefinition = "user")
    String role;

}
