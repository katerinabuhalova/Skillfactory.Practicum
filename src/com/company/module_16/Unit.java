package com.company.module_16;

public abstract class Unit {
    private String name;
    private int health;
    private int agile;
    private int force;
    protected int experience;
    protected int gold;

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }


    public void attack(Unit target) {
        target.damage(force);
    }

    public void damage(int damage) {
        health = health - damage;
    }

    public boolean isDead() {
        return health <= 0;
    }
}
