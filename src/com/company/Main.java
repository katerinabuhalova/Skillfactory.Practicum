package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Myrzic", "house", 20);
        cat.printInfo();
        cat.soundCat(new Soundable() {
            @Override
            public String sound() {
                return "meow";
            }
        });
    }
}
