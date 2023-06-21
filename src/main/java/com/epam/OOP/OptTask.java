package com.epam.OOP;

public class OptTask {

    public static void main(String[] args) {
        System.out.println("Creating an instance of Dog class");
        Dog dog = new Dog();
        System.out.println("Creating an instance of Bird class");
        Bird bird = new Bird();
        System.out.println("Calling getDescription() method of the dog:\n");
        System.out.println(dog.getDescription());
        System.out.println("\nCalling overriden getDescription() method of the bird:\n");
        System.out.println(bird.getDescription());
    }
}
