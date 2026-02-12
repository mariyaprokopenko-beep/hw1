package com.narxoz.rpg.equipment;

public class Longbow implements Weapon {
    private int damage;
    private String weaponType;
    private String weaponName;
    private String range;

    public Longbow() {
        this.damage = 30;
        this.weaponType = "Bow";
        this.weaponName = "Longbow";
        this.range = "long";
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

    public String getRange() {
        return range;
    }

    @Override
    public String getWeaponInfo() {
        return "Longbow (Ranger) - Deadly at long range, range: " + range;
    }

    public void displayInfo() {
        System.out.println("Weapon: " + getWeaponInfo());
        System.out.println("Damage: " + damage);
        System.out.println("Type: " + weaponType);
        System.out.println("Range: " + range);
    }
}