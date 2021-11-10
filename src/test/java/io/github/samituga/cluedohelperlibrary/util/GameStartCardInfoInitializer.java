package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;

public class GameStartCardInfoInitializer {

  public static List<Character> validSixCharacters() {
    Character character1 = new Character("character1");
    Character character2 = new Character("character2");
    Character character3 = new Character("character3");
    Character character4 = new Character("character4");
    Character character5 = new Character("character5");
    Character character6 = new Character("character6");

    return List.of(character1, character2, character3, character4, character5, character6);
  }

  public static List<Weapon> validSixWeapons() {
    Weapon weapon1 = new Weapon("weapon1");
    Weapon weapon2 = new Weapon("weapon2");
    Weapon weapon3 = new Weapon("weapon3");
    Weapon weapon4 = new Weapon("weapon4");
    Weapon weapon5 = new Weapon("weapon5");
    Weapon weapon6 = new Weapon("weapon6");

    return List.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6);
  }

  public static List<Room> validNineRooms() {
    Room room1 = new Room("room1");
    Room room2 = new Room("room2");
    Room room3 = new Room("room3");
    Room room4 = new Room("room4");
    Room room5 = new Room("room5");
    Room room6 = new Room("room6");
    Room room7 = new Room("room7");
    Room room8 = new Room("room8");
    Room room9 = new Room("room9");

    return List.of(room1, room2, room3, room4, room5, room6, room7, room8, room9);
  }
}
