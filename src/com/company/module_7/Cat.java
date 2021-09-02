package com.company.module_7;

import java.util.Random;

public class Cat extends Animal {

    public Cat(String name, String habitat, int age) {
        super(name, habitat, age);
    }

    BadBehavior badBehavior = new BadBehavior();

    public class BadBehavior {

        public void doDirty() {
            int flag = (new Random()).nextInt(2);
            if (flag == 1) {
                System.out.println("Cat pee in a slipper");
            } else {
                System.out.println("Cat a good animal.");
            }
        }
    }

    @Override
    public void printInfo() {
        System.out.println("I am " + name + ". I live in " + habitat + ". I am " + age);
        badBehavior.doDirty();
    }

    public void soundCat(Soundable soundable) {
        System.out.println(soundable.sound());
    }
}
