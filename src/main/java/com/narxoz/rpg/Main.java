package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.factory.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG Character Creation System ===\n");
        System.out.println("Creating characters...\n");

        Character warrior = FactoryProvider.getCharacterFactory("warrior").orderCharacter("Thor");
        Character mage = FactoryProvider.getCharacterFactory("mage").orderCharacter("Gandalf");
        Character archer = FactoryProvider.getCharacterFactory("archer").orderCharacter("Legolas");

        warrior.displayStats();
        warrior.useSpecialAbility();
        mage.displayStats();
        mage.useSpecialAbility();
        archer.displayStats();
        archer.useSpecialAbility();

        System.out.println("\n--- Equipping Characters ---\n");

        EquipmentFactory medieval = FactoryProvider.getEquipmentFactory("medieval");
        warrior.equipWeapon(medieval.createWeapon());
        warrior.equipArmor(medieval.createArmor());

        EquipmentFactory magic = FactoryProvider.getEquipmentFactory("magic");
        mage.equipWeapon(magic.createWeapon());
        mage.equipArmor(magic.createArmor());

        EquipmentFactory ranger = FactoryProvider.getEquipmentFactory("ranger");
        archer.equipWeapon(ranger.createWeapon());
        archer.equipArmor(ranger.createArmor());

        warrior.displayEquipment();
        mage.displayEquipment();
        archer.displayEquipment();

        System.out.println("\n=== Demo Complete ===");
    }
}