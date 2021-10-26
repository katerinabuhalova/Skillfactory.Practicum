package com.company.module_16;

public class Hero extends Unit{


    public Hero(int health, int agile, int force) {
        super(health, agile, force, 0, 0);
    }

    @Override
    public void attack(Unit target) {
        super.attack(target);
        if(target.isDead()) {
            this.gold += target.getGold();
            this.experience += target.getExperience();
        }
    }
}
