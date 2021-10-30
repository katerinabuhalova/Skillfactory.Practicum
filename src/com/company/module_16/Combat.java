package com.company.module_16;

public class Combat extends Thread {
    private final Hero hero;
    private final Unit monster;

    public Combat(Hero hero, Unit monster) {
        this.hero = hero;
        this.monster = monster;
    }

    @Override
    public void run() {
        try {
            while (!hero.isDead() && !monster.isDead()) {
                hero.attack(monster);
                Thread.sleep(1000);
                monster.attack(hero);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (hero.isDead()) {
            System.out.println("You dead. Game over.\nPress any key to exit.");
            try {
                System.in.read();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.exit(0);
        } else {
            System.out.println("Winner is " + hero);
        }
    }
}
