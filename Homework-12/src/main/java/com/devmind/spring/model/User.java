package com.devmind.spring.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {
    private String userName;
    private String phoneNumber;
    private String email;
    LocalDate birthDate;
}
