package com.company.module_11;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Боб", "Хаски", 4);
        Dog dog2 = new Dog("Боб3", "Джек - расел терьер", 5);
        Dog dog3 = new Dog("Ава", "Хаски", 10);
        Dog dog4 = new Dog("Барни", "Овчарка", 2);
        Dog dog5 = new Dog("Зэнди", "Такса", 5);
        Dog dog6 = new Dog("Бакс", "Хаски", 6);

        List<Dog> dogList = new LinkedList<>();
        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
        dogList.add(dog4);
        dogList.add(dog5);
        dogList.add(dog6);
        System.out.println(dogList);

        Set<Dog> dogSet = new LinkedHashSet<>(dogList);
        for (Dog dog: dogSet) System.out.println(dog.getName());
    }
}
