package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;
import java.util.stream.Collectors;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Copier {

    public static Character character(Character character) {
        return new Character(character);
    }

    public static List<Character> characters(List<Character> characters) {
        return characters.stream()
            .map(Copier::character)
            .collect(Collectors.toList());
    }


    public static Weapon weapon(Weapon weapon) {
        return new Weapon(weapon);
    }

    public static List<Weapon> weapons(List<Weapon> weapons) {
        return weapons.stream()
            .map(Copier::weapon)
            .collect(Collectors.toList());
    }

    public static Room room(Room room) {
        return new Room(room);
    }

    public static List<Room> rooms(List<Room> rooms) {
        return rooms.stream()
            .map(Copier::room)
            .collect(Collectors.toList());
    }
}
