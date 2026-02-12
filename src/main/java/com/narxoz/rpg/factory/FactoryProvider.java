package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.*;
import com.narxoz.rpg.equipment.*;

public class FactoryProvider {

    public static CharacterFactory getCharacterFactory(String type) {
        if (type.equalsIgnoreCase("warrior")) {
            return new WarriorFactory();
        }
        if (type.equalsIgnoreCase("mage")) {
            return new MageFactory();
        }
        if (type.equalsIgnoreCase("archer")) {
            return new ArcherFactory();
        }
        throw new IllegalArgumentException("Unknown character type: " + type);
    }

    public static EquipmentFactory getEquipmentFactory(String theme) {
        if (theme.equalsIgnoreCase("medieval")) {
            return new MedievalFactory();
        }
        if (theme.equalsIgnoreCase("magic")) {
            return new MagicFactory();
        }
        if (theme.equalsIgnoreCase("ranger")) {
            return new RangerFactory();
        }
        throw new IllegalArgumentException("Unknown equipment theme: " + theme);
    }
}