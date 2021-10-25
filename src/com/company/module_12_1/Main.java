package com.company.module_12_1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Perimeter rectangle = new Perimeter(3, 7);
        Perimeter rectangle1 = new Perimeter(6, 9);

        rectangle.start();
        rectangle.join();
        rectangle1.start();
    }
}
