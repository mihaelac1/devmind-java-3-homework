package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAnimal;

public class Cat implements IAnimal {

    public static final String MY_NAME_IS = "My name is: ";
    private String animalName;

    public Cat(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "I am a CAT";
    }

    public String getAnimalName() {
        return MY_NAME_IS + animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
