package com.company.module_11;
import java.util.Objects;

public class Dog implements Comparable<Dog> {
    String name;
    String breed;
    int age;

    public String getName() {
        return name;
    }

    public Dog(String name, String breed, int age) {
        if(name == null || breed == null || age == 0) {
            throw  new IllegalArgumentException();
        }
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name) && Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Dog o) {
        return this.age - o.age;
    }
}
