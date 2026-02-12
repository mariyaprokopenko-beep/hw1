package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterFactory {
    public abstract Character createCharacter(String name);

    public Character orderCharacter(String name) {
        Character character = createCharacter(name);
        System.out.println("Creating " + character.getCharacterClass() + "...");
        return character;
    }
}