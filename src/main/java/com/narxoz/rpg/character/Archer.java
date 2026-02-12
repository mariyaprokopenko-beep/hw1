package com.narxoz.rpg.character;

public class Archer extends Character {
    public Archer(String name) {
        super(name);
        this.health = 100;
        this.mana = 60;
        this.strength = 50;
        this.intelligence = 40;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " uses PRECISION SHOT! Guaranteed critical hit!");
    }

    @Override
    public String getCharacterClass() {
        return "Archer";
    }
}