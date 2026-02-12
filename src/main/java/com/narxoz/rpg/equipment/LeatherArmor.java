package com.narxoz.rpg.equipment;

public class LeatherArmor implements Armor {
    private int defense;
    private String armorType;
    private String armorName;
    private int agilityBonus;

    public LeatherArmor() {
        this.defense = 20;
        this.armorType = "Light";
        this.armorName = "Leather Armor";
        this.agilityBonus = 15;
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

    public int getAgilityBonus() {
        return agilityBonus;
    }

    @Override
    public String getArmorInfo() {
        return "Leather Armor (Ranger) - Light and flexible, agility bonus: " + agilityBonus;
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Agility Bonus: +" + agilityBonus);
    }
}