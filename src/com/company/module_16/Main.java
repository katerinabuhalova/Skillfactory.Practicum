package com.company.module_16;

import java.util.Scanner;

public class Main {
    final static Hero hero = new Hero(10, 20, 20);
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        startPlay();
        startCombat();
    }

    public static void startPlay() {
        System.out.println("Hello my dear friends! Greets you Role Playing Game!\nCreate a hero and name him");
        hero.setName(scanner.next());
        System.out.println("You hero name is " + hero);
    }

    public static void startCombat() {
        Unit skeleton = new Unit("Skeleton", 70, 15, 15, 2, 10);
        System.out.println("Start combat " + "\nYour opponent is " + skeleton);
        Thread combat = new Combat(hero, skeleton);
        combat.start();
    }
}