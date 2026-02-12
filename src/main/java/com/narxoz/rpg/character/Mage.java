package com.narxoz.rpg.character;

public class Mage extends Character {

    public Mage(String name) {
        super(name);
        this.health = 70;
        this.mana = 150;
        this.strength = 20;
        this.intelligence = 90;
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts ARCANE BLAST! Deals massive magical damage!");
    }

    @Override
    public String getCharacterClass() {
        return "Mage";
    }
}