package com.narxoz.rpg.equipment;

public class WizardStaff implements Weapon {

    private int damage;
    private String weaponType;
    private String weaponName;
    private int manaBoost;

    public WizardStaff() {
        this.damage = 15;
        this.weaponType = "Staff";
        this.weaponName = "Wizard Staff";
        this.manaBoost = 20;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public String getWeaponName() {
        return weaponName;
    }

    @Override
    public String getWeaponType() {
        return weaponType;
    }

    public int getManaBoost() {
        return manaBoost;
    }

    @Override
    public String getWeaponInfo() {
        return "Wizard Staff (Magic) - Channels arcane energy, mana boost: " + manaBoost;
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Mana Boost: +" + manaBoost);
    }
}
