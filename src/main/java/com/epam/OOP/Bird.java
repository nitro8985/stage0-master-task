package com.epam.OOP;

public class Bird extends Animal {

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return String.format("%s Moreover, it has 2 wings and can fly.", super.getDescription());
    }
}
