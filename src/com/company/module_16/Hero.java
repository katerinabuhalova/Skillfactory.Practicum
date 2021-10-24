package com.company.module_16;

public class Hero extends Unit{

    @Override
    public void attack(Unit target) {
        super.attack(target);
        if(target.isDead()) {
            this.gold += target.getGold();
            this.experience += target.getExperience();
        }
    }
}
