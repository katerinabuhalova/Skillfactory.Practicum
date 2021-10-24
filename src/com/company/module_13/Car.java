package com.company.module_13;

public class Car implements Runnable {
    private String name;
    //m/s
    private int speed;
    //meters
    private int distance;
    private Object lock;

    public Car(String name, int speed, int distance, Object lock) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            synchronized (lock) {
                System.out.println(name + " start race");
                int time = distance / speed * 1000;
                int raceTime = 0;
                while (raceTime < time) {
                    System.out.print("-");
                    Thread.sleep(1000);
                    raceTime += 1000;
                }
                System.out.println("> " + name + " finish race in " + time / 1000 + " seconds");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
