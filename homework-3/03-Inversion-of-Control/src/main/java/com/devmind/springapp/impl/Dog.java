package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAnimal;

public class Dog implements IAnimal {
    @Override
    public String makeSound() {
        return "I am a DOG";
    }
}
