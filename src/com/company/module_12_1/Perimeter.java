package com.company.module_12_1;

public class Perimeter extends Thread {
    private int a;
    private int b;

    public Perimeter(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int perimeterRectangle() {
        int s = (a + b) * 2;
        return s;
    }

    @Override
    public void run() {
        try {
            double time = (Math.random() + 1) * 1000;
            Thread.sleep((long)time);
            System.out.println("Perimeter rectangle : " + perimeterRectangle());
        } catch (InterruptedException e) {
              e.printStackTrace();
        }

    }

    @Override
    public String toString() {
        return "Perimeter{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
