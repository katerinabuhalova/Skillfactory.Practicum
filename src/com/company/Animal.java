package com.company;

public abstract class Animal {
    String name, habitat;
    int age;

    public Animal(String name, String habitat, int age) {
        this.name = name;
        this.habitat = habitat;
        this.age = age;
    }

    public abstract void printInfo();
}
