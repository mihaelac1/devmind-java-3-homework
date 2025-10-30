package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAutomobile;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Motorcycle implements IAutomobile {

    @Autowired
    private Motor motor; // field injection

    public void travel(String destination) {
        System.out.println("The motorcycle is going to " + destination + "!");
    }

    @Override
    public int maxDrivingSpeed() {
        return 120;
    }
}
