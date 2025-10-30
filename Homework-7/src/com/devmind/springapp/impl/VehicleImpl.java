package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAutomobile;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VehicleImpl {

    final IAutomobile vehicle;

    public void vehicleInformation() {
        vehicle.travel("Sibiu");
        System.out.println("Vehicle max driving speed: " + vehicle.maxDrivingSpeed());
        if (vehicle instanceof Car) {
            Motor motor = ((Car) vehicle).getMotor();
            System.out.println("Motor name : " + motor.getName() + ", power: " + motor.getPower() + " and nbCylinders: " + motor.getNbCylinders());
        }
    }
}
