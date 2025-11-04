package com.devmind.spring.controller;

import com.devmind.spring.model.User;
import com.devmind.spring.validator.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@Controller
public class HomeController {

    private final UserValidator userValidator = new UserValidator();

    @RequestMapping("/")
    public String redirectToAbout() {
        return "redirect:/about";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {
        model.addAttribute("description", "This is a simple Spring MVC application.");
        model.addAttribute("contact", "Email: contact@exemplu.com \n Phone: 0702 123 456");
        return "about";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Locale locale, Model model) {
        System.out.println("Home Page Requested, locale = " + locale);
        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        model.addAttribute("serverTime", formattedDate);

        return "home";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String user(@Validated User user, Model model) {
        List<String> errorList = userValidator.validateUser(user);

        if (!errorList.isEmpty()) {
            model.addAttribute("errorList", errorList);
            return "invalidUser";
        }

        model.addAttribute("userName", user.getUserName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("phoneNumber", user.getPhoneNumber());
        model.addAttribute("birthDate", user.getBirthDate());
        return "user";
    }
}
