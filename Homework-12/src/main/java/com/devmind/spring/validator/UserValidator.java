package com.devmind.spring.validator;

import com.devmind.spring.model.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserValidator {

    public List<String> validateUser(User user) {
        List<String> errorList = new ArrayList<>();
        if (user.getEmail() == null || user.getEmail().isBlank()) {
            errorList.add("Email is mandatory.");
        } else if (!user.getEmail().matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
            errorList.add("Invalid email.");
        }

        if (user.getPhoneNumber() == null || user.getPhoneNumber().isBlank()) {
            errorList.add("Phone Number is mandatory.");
        } else if (!user.getPhoneNumber().matches("^\\+?[0-9]{10,15}$")) {
            errorList.add("Invalid number.");
        }

        if (user.getBirthDate() == null) {
            errorList.add("Birth Date is mandatory.");
        } else if (!user.getBirthDate().isBefore(LocalDate.now())) {
            errorList.add("Invalid birth date. Should be before today.");
        }
        return errorList;
    }
}
