package com.company.module_16;
import java.util.Scanner;

public class Main {
    final static Hero hero = new Hero(100, 20, 10);
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        startPlay();
    }

    public static void startPlay() throws InterruptedException {
        System.out.println("Hello my dear friends! Greets you Role Playing Game!\nCreate a hero and name him");
        hero.setName(scanner.next());
        System.out.println("You hero name is " + hero);

        boolean isFirstRun = true;
        System.out.println("Where do you want to go:\n1. To the merchant\n" +
                "2. Into the dark forest\n" +
                "3. To the exit\nChoose a input and enter it");
        int input = Integer.parseInt(scanner.next());
        while (input != 3) {
            if (!isFirstRun) {
                System.out.println("Where do you want to go:\n1. To the merchant\n" +
                        "2. Into the dark forest\n" +
                        "3. To the exit\nChoose a input and enter it");
                input = Integer.parseInt(scanner.next());
            } else {
                isFirstRun = false;
            }

            switch (input) {
                case 1:
                    System.out.println("Hello! 10 lives cost 5 gold. Want to buy:\n1. Yes\n" + "2. No");
                    input = Integer.parseInt(scanner.next());
                    if (input == 1) {

                        if (hero.getGold() <= 0) {
                            System.out.println("You don't have enough money.Where do you want to go:\n 1. Return to town\nChoose a input and enter it");

                            input = Integer.parseInt(scanner.next());
                            switch (input) {
                                case 1:
                                    System.out.println("You are return to town");
                                    break;
                            }
                        } else {
                            hero.gold -= 5;
                            hero.setHealth(hero.getHealth() + 10);
                            System.out.println("You health is " + hero.getHealth() + "and you have left " + hero.getGold() + " gold");
                            break;
                        }
                    } else {
                        System.out.println("Where do you want to go:\n 1. Return to town\nChoose a input and enter it");
                        input = Integer.parseInt(scanner.next());

                        switch (input) {
                            case 1:
                                System.out.println("You are return to town");
                                break;
                        }
                    }
                    break;
                case 2:
                    startCombat();
                    if (hero.isDead()) {
                        System.out.println("You dead. Game over.");
                        System.exit(0);
                    }
                    System.out.println("The fight is end. Where do you want to go:\n1. Return to town\n" + "2. Continue combat.\nChoose a input and enter it");
                    input = Integer.parseInt(scanner.next());
                    switch (input) {
                        case 1:
                            System.out.println("You are return to town");
                            break;
                        case 2:
                            startCombat();
                            break;
                    }
                    break;
            }
        }
        System.out.println("Game over!");
    }

    public static void startCombat() throws InterruptedException {
        Unit[] monsters = {
                new Unit("Skeleton", 20, 10, 2, 2, 10),
                new Unit("Witch", 13, 10, 3, 2, 5),
                new Unit("Gul", 25, 10, 5, 2, 5),
                new Unit("Ava", 18, 10, 3, 2, 5),
        };
        int index = (int) (Math.random() * (monsters.length - 1));
        System.out.println("Start combat " + "\nYour opponent is " + monsters[index]);
        Thread combat = new Combat(hero, monsters[index]);
        combat.start();
        combat.join();
    }
}