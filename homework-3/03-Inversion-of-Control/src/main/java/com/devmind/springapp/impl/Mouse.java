package com.devmind.springapp.impl;

import com.devmind.springapp.abs.IAnimal;

public class Mouse implements IAnimal {
    @Override
    public String makeSound() {
        return "I am a MOUSE";
    }
}
