package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAutomobile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehiclesService {

    private final IAutomobile bus;

    @Autowired
    @Qualifier("car")
    private IAutomobile car; // field injection

    private IAutomobile motorcycle;

    //constructor injection
    public VehiclesService(@Qualifier("bus") IAutomobile bus) {
        this.bus = bus;
    }

    //setter injection
    @Autowired
    @Qualifier("motorcycle")
    public void setMotorcycle(IAutomobile motorcycle) {
        this.motorcycle = motorcycle;
    }

    public void maxDrivingSpeedVehicles() {
        System.out.println("Bus maxDrivingSpeed: " + bus.maxDrivingSpeed());
        System.out.println("Car maxDrivingSpeed: " + car.maxDrivingSpeed());
        System.out.println("Motorcycle maxDrivingSpeed: " + motorcycle.maxDrivingSpeed());
    }

    public void travelVehicles() {
        bus.travel("Bucuresti");
        car.travel("Iasi");
        motorcycle.travel("Pitesti");
    }
}
