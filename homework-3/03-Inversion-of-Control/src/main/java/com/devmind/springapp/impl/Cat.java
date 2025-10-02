package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAnimal;

public class Cat implements IAnimal {

    private String animalName;

    public Cat(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "I am a CAT";
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }
}
