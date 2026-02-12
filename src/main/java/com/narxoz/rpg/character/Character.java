package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.Armor;

public abstract class Character {
    protected String name;
    protected int health;
    protected int mana;
    protected int strength;
    protected int intelligence;
    protected Weapon equippedWeapon;
    protected Armor equippedArmor;

    public Character(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public int getMana() { return mana; }
    public int getStrength() { return strength; }
    public int getIntelligence() { return intelligence; }
    public Weapon getEquippedWeapon() { return equippedWeapon; }
    public Armor getEquippedArmor() { return equippedArmor; }

    public void equipWeapon(Weapon weapon) {
        this.equippedWeapon = weapon;
        System.out.println(name + " equips " + weapon.getWeaponName());
    }

    public void equipArmor(Armor armor) {
        this.equippedArmor = armor;
        System.out.println(name + " equips " + armor.getArmorName());
    }

    public void displayStats() {
        System.out.println("\n=== " + name + " (" + getCharacterClass() + ") ===");
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    public void displayEquipment() {
        System.out.println("Equipment:");
        if (equippedWeapon != null) {
            System.out.println("  Weapon: " + equippedWeapon.getWeaponInfo());
        } else {
            System.out.println("  Weapon: None");
        }

        if (equippedArmor != null) {
            System.out.println("  Armor: " + equippedArmor.getArmorInfo());
        } else {
            System.out.println("  Armor: None");
        }
    }

    public abstract void useSpecialAbility();
    public abstract String getCharacterClass();
}