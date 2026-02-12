package com.narxoz.rpg.equipment;

public class PlateArmor implements Armor {

    private int defense;
    private String armorType;
    private String armorName;

    public PlateArmor() {
        this.defense = 30;
        this.armorType = "Heavy";
        this.armorName = "Plate Armor";
    }

    @Override
    public int getDefense() {
        return defense;
    }

    @Override
    public String getArmorName() {
        return armorName;
    }

    @Override
    public String getArmorType() {
        return armorType;
    }

    @Override
    public String getArmorInfo() {
        return "Plate Armor (Medieval) - Offers excellent protection";
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
    }
}