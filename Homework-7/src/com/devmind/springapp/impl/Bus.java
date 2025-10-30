package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAutomobile;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Bus implements IAutomobile {

    private Motor motor;

    @Autowired
    public void setMotor(Motor motor) {
        this.motor = motor;
    } // setter injection

    @Override
    public void travel(String destination) {
        System.out.println("The bus is going to " + destination + "!");
    }

    @Override
    public int maxDrivingSpeed() {
        return 90;
    }


}
