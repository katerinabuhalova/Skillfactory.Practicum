package com.company.module_16;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Kate", 100, 50, 20);
        Unit skeleton = new Unit("Skeleton", 70, 50, 15, 2, 10);

        System.out.println("Start combat");

        //combat
        while (!hero.isDead() && !skeleton.isDead()) {
            hero.attack(skeleton);
            skeleton.attack(hero);
        }

        //result
        Unit winner = hero.isDead() ? skeleton : hero;
        System.out.println("Winner is: " + winner);
    }
}
