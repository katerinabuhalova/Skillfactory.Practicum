package com.company.module_13;

public class Main {
    public static void main(String[] args) {
        Object lock = new Object();
        Car car = new Car("Mazda", 12, 100,lock);
        Car car2 = new Car("Volvo",15,100,lock);

        Thread thread = new Thread(car);
        Thread thread1 = new Thread(car2);

        thread.start();
        thread1.start();
    }
}
