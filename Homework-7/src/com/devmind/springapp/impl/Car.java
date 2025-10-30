package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAutomobile;
import lombok.Getter;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Getter
public class Car implements IAutomobile {

    private final Motor motor;

    public Car(Motor motor) {
        this.motor = motor;
    } // constructor injection

    public void travel(String destination) {
        System.out.println("The car is going to " + destination + "!");
    }

    @Override
    public int maxDrivingSpeed() {
        return 180;
    }
}
