package com.devmind.springapp;

import com.devmind.springapp.impl.VehicleImpl;
import com.devmind.springapp.impl.VehiclesService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context =
                     new ClassPathXmlApplicationContext("applicationContext.xml")) {
            VehiclesService vehiclesService = context.getBean(VehiclesService.class);
            vehiclesService.travelVehicles();
            vehiclesService.maxDrivingSpeedVehicles();

            VehicleImpl vehicle = context.getBean(VehicleImpl.class);
            vehicle.vehicleInformation();
        }
    }
}
