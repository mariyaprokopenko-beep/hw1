package com.narxoz.rpg.equipment;

public class EnchantedRobes implements Armor {

    private int defense;
    private String armorType;
    private String armorName;
    private int manaBoost;

    public EnchantedRobes() {
        this.defense = 10;
        this.armorType = "Cloth";
        this.armorName = "Enchanted Robes";
        this.manaBoost = 25;
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

    public int getManaBoost() {
        return manaBoost;
    }

    @Override
    public String getArmorInfo() {
        return "Enchanted Robes (Magic) - Infused with magical power, mana boost: " + manaBoost;
    }

    public void displayInfo() {
        System.out.println("Armor: " + getArmorInfo());
        System.out.println("Defense: " + defense);
        System.out.println("Type: " + armorType);
        System.out.println("Mana Boost: +" + manaBoost);
    }
}
