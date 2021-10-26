package com.company.module_16;

public class Unit {
    private String name;

    private int health;
    private int agile;
    private int force;
    protected int experience;
    protected int gold;

    public Unit(String name, int health, int agile, int force, int experience, int gold) {
        this.name = name;
        this.health = health;
        this.agile = agile;
        this.force = force;
        this.experience = experience;
        this.gold = gold;
    }

    public Unit(int health, int agile, int force, int experience, int gold) {
        this.health = health;
        this.agile = agile;
        this.force = force;
        this.experience = experience;
        this.gold = gold;
    }

    public int getExperience() {
        return experience;
    }

    public int getGold() {
        return gold;
    }

    public void setName(String name) {
        this.name = name;
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


    @Override
    public String toString() {
        return name + ": {health is " + health +
                ", agile is " + agile +
                ", force is " + force +
                ", experience is " + experience +
                ", gold is " + gold + "}";
    }
}