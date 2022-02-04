package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;
import java.util.UUID;

public class GameStartCardInfoInitializer {

    public static List<Character> validSixCharacters() {
        Character character1 = new Character("character1", UUID.randomUUID());
        Character character2 = new Character("character2", UUID.randomUUID());
        Character character3 = new Character("character3", UUID.randomUUID());
        Character character4 = new Character("character4", UUID.randomUUID());
        Character character5 = new Character("character5", UUID.randomUUID());
        Character character6 = new Character("character6", UUID.randomUUID());

        return List.of(character1, character2, character3, character4, character5, character6);
    }

    public static List<Character> invalidFourCharacters() {
        Character character1 = new Character("character1", UUID.randomUUID());
        Character character2 = new Character("character2", UUID.randomUUID());
        Character character3 = new Character("character3", UUID.randomUUID());
        Character character4 = new Character("character4", UUID.randomUUID());

        return List.of(character1, character2, character3, character4);
    }

    public static List<Character> invalidFiveCharacters() {
        Character character1 = new Character("character1", UUID.randomUUID());
        Character character2 = new Character("character2", UUID.randomUUID());
        Character character3 = new Character("character3", UUID.randomUUID());
        Character character4 = new Character("character4", UUID.randomUUID());
        Character character5 = new Character("character5", UUID.randomUUID());

        return List.of(character1, character2, character3, character4, character5);
    }

    public static List<Character> invalidSevenCharacters() {
        Character character1 = new Character("character1", UUID.randomUUID());
        Character character2 = new Character("character2", UUID.randomUUID());
        Character character3 = new Character("character3", UUID.randomUUID());
        Character character4 = new Character("character4", UUID.randomUUID());
        Character character5 = new Character("character5", UUID.randomUUID());
        Character character6 = new Character("character6", UUID.randomUUID());
        Character character7 = new Character("character7", UUID.randomUUID());

        return List
            .of(character1, character2, character3, character4, character5, character6, character7);
    }

    public static List<Character> invalidSixCharactersWithMockName() {
        Character character1 = new Character("mock", UUID.randomUUID());
        Character character2 = new Character("character2", UUID.randomUUID());
        Character character3 = new Character("character3", UUID.randomUUID());
        Character character4 = new Character("character4", UUID.randomUUID());
        Character character5 = new Character("character5", UUID.randomUUID());
        Character character6 = new Character("character6", UUID.randomUUID());

        return List.of(character1, character2, character3, character4, character5, character6);
    }


    public static List<Weapon> validSixWeapons() {
        Weapon weapon1 = new Weapon("weapon1", UUID.randomUUID());
        Weapon weapon2 = new Weapon("weapon2", UUID.randomUUID());
        Weapon weapon3 = new Weapon("weapon3", UUID.randomUUID());
        Weapon weapon4 = new Weapon("weapon4", UUID.randomUUID());
        Weapon weapon5 = new Weapon("weapon5", UUID.randomUUID());
        Weapon weapon6 = new Weapon("weapon6", UUID.randomUUID());

        return List.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6);
    }

    public static List<Weapon> invalidFourWeapons() {
        Weapon weapon1 = new Weapon("weapon1", UUID.randomUUID());
        Weapon weapon2 = new Weapon("weapon2", UUID.randomUUID());
        Weapon weapon3 = new Weapon("weapon3", UUID.randomUUID());
        Weapon weapon4 = new Weapon("weapon4", UUID.randomUUID());

        return List.of(weapon1, weapon2, weapon3, weapon4);
    }

    public static List<Weapon> invalidFiveWeapons() {
        Weapon weapon1 = new Weapon("weapon1", UUID.randomUUID());
        Weapon weapon2 = new Weapon("weapon2", UUID.randomUUID());
        Weapon weapon3 = new Weapon("weapon3", UUID.randomUUID());
        Weapon weapon4 = new Weapon("weapon4", UUID.randomUUID());
        Weapon weapon5 = new Weapon("weapon5", UUID.randomUUID());

        return List.of(weapon1, weapon2, weapon3, weapon4, weapon5);
    }

    public static List<Weapon> invalidSevenWeapons() {
        Weapon weapon1 = new Weapon("weapon1", UUID.randomUUID());
        Weapon weapon2 = new Weapon("weapon2", UUID.randomUUID());
        Weapon weapon3 = new Weapon("weapon3", UUID.randomUUID());
        Weapon weapon4 = new Weapon("weapon4", UUID.randomUUID());
        Weapon weapon5 = new Weapon("weapon5", UUID.randomUUID());
        Weapon weapon6 = new Weapon("weapon6", UUID.randomUUID());
        Weapon weapon7 = new Weapon("weapon7", UUID.randomUUID());

        return List.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6, weapon7);
    }

    public static List<Weapon> invalidSixWeaponsWithMockName() {
        Weapon weapon1 = new Weapon("mock", UUID.randomUUID());
        Weapon weapon2 = new Weapon("weapon2", UUID.randomUUID());
        Weapon weapon3 = new Weapon("weapon3", UUID.randomUUID());
        Weapon weapon4 = new Weapon("weapon4", UUID.randomUUID());
        Weapon weapon5 = new Weapon("weapon5", UUID.randomUUID());
        Weapon weapon6 = new Weapon("weapon6", UUID.randomUUID());

        return List.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6);
    }


    public static List<Room> validNineRooms() {
        Room room1 = new Room("room1", UUID.randomUUID());
        Room room2 = new Room("room2", UUID.randomUUID());
        Room room3 = new Room("room3", UUID.randomUUID());
        Room room4 = new Room("room4", UUID.randomUUID());
        Room room5 = new Room("room5", UUID.randomUUID());
        Room room6 = new Room("room6", UUID.randomUUID());
        Room room7 = new Room("room7", UUID.randomUUID());
        Room room8 = new Room("room8", UUID.randomUUID());
        Room room9 = new Room("room9", UUID.randomUUID());

        return List.of(room1, room2, room3, room4, room5, room6, room7, room8, room9);
    }

    public static List<Room> invalidSevenRooms() {
        Room room1 = new Room("room1", UUID.randomUUID());
        Room room2 = new Room("room2", UUID.randomUUID());
        Room room3 = new Room("room3", UUID.randomUUID());
        Room room4 = new Room("room4", UUID.randomUUID());
        Room room5 = new Room("room5", UUID.randomUUID());
        Room room6 = new Room("room6", UUID.randomUUID());
        Room room7 = new Room("room7", UUID.randomUUID());

        return List.of(room1, room2, room3, room4, room5, room6, room7);
    }

    public static List<Room> invalidEightRooms() {
        Room room1 = new Room("room1", UUID.randomUUID());
        Room room2 = new Room("room2", UUID.randomUUID());
        Room room3 = new Room("room3", UUID.randomUUID());
        Room room4 = new Room("room4", UUID.randomUUID());
        Room room5 = new Room("room5", UUID.randomUUID());
        Room room6 = new Room("room6", UUID.randomUUID());
        Room room7 = new Room("room7", UUID.randomUUID());
        Room room8 = new Room("room8", UUID.randomUUID());

        return List.of(room1, room2, room3, room4, room5, room6, room7, room8);
    }

    public static List<Room> invalidTenRooms() {
        Room room1 = new Room("room1", UUID.randomUUID());
        Room room2 = new Room("room2", UUID.randomUUID());
        Room room3 = new Room("room3", UUID.randomUUID());
        Room room4 = new Room("room4", UUID.randomUUID());
        Room room5 = new Room("room5", UUID.randomUUID());
        Room room6 = new Room("room6", UUID.randomUUID());
        Room room7 = new Room("room7", UUID.randomUUID());
        Room room8 = new Room("room8", UUID.randomUUID());
        Room room9 = new Room("room9", UUID.randomUUID());
        Room room10 = new Room("room10", UUID.randomUUID());

        return List.of(room1, room2, room3, room4, room5, room6, room7, room8, room9, room10);
    }

    public static List<Room> invalidNineRoomsWithMockName() {
        Room room1 = new Room("mock", UUID.randomUUID());
        Room room2 = new Room("room2", UUID.randomUUID());
        Room room3 = new Room("room3", UUID.randomUUID());
        Room room4 = new Room("room4", UUID.randomUUID());
        Room room5 = new Room("room5", UUID.randomUUID());
        Room room6 = new Room("room6", UUID.randomUUID());
        Room room7 = new Room("room7", UUID.randomUUID());
        Room room8 = new Room("room8", UUID.randomUUID());
        Room room9 = new Room("room9", UUID.randomUUID());

        return List.of(room1, room2, room3, room4, room5, room6, room7, room8, room9);
    }
}
