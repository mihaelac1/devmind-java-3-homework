package com.devmind.springapp.impl;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@PropertySource("classpath:application.properties")
@Scope("prototype")
public class Motor {
    @Value("${motor.power}")
    int power;
    @Value("${motor.name}")
    String name;
    @Value("${motor.nbCylinders}")
    int nbCylinders;
}
