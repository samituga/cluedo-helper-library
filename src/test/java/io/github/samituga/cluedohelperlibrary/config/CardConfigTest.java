package io.github.samituga.cluedohelperlibrary.config;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

import io.github.samituga.cluedohelperlibrary.model.Character;
import io.github.samituga.cluedohelperlibrary.model.Room;
import io.github.samituga.cluedohelperlibrary.model.Weapon;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CardConfigTest {

  private CardConfig config;

  @BeforeEach
  void setUp() {
    config = new CardConfig();
  }

  @Test
  void verifyReturnsCharacterWhenCharacterExists() {

    final String characterKey = "Mocked";
    final Character expectedCharacter = new Character();
    expectedCharacter.setName("Mocked name");

    final Map<String, Character> map = new HashMap<>();
    map.put(characterKey, expectedCharacter);
    config.setCharacters(map);

    final Character actualCharacter = config.getCharacter(characterKey);

    assertThat(expectedCharacter, equalTo(actualCharacter));
  }

  @Test
  void verifyThrowsIllegalArgumentExceptionWhenCharacterDoesNotExist() {

    final String characterKey = "Mocked";
    final Character expectedCharacter = new Character();
    expectedCharacter.setName("Mocked name");

    final Map<String, Character> map = new HashMap<>();
    map.put(characterKey, expectedCharacter);
    config.setCharacters(map);

    assertThrows(IllegalArgumentException.class, () -> config.getCharacter("WrongKey"));
  }

  @Test
  void verifyReturnsWeaponWhenWeaponExists() {

    final String weaponKey = "Mocked";
    final Weapon expectedWeapon = new Weapon();
    expectedWeapon.setName("Mocked name");

    final Map<String, Weapon> map = new HashMap<>();
    map.put(weaponKey, expectedWeapon);
    config.setWeapons(map);

    final Weapon actualWeapon = config.getWeapon(weaponKey);

    assertThat(expectedWeapon, equalTo(actualWeapon));
  }

  @Test
  void verifyThrowsIllegalArgumentExceptionWhenWeaponDoesNotExist() {

    final String weaponKey = "Mocked";
    final Weapon expectedWeapon = new Weapon();
    expectedWeapon.setName("Mocked name");

    final Map<String, Weapon> map = new HashMap<>();
    map.put(weaponKey, expectedWeapon);
    config.setWeapons(map);

    assertThrows(IllegalArgumentException.class, () -> config.getWeapon("WrongKey"));
  }

  @Test
  void verifyReturnsRoomWhenRoomExists() {

    final String roomKey = "Mocked";
    final Room expectedRoom = new Room();
    expectedRoom.setName("Mocked name");

    final Map<String, Room> map = new HashMap<>();
    map.put(roomKey, expectedRoom);
    config.setRooms(map);

    final Room actualRoom = config.getRoom(roomKey);

    assertThat(expectedRoom, equalTo(actualRoom));
  }

  @Test
  void verifyThrowsIllegalArgumentExceptionWhenRoomDoesNotExist() {

    final String roomKey = "Mocked";
    final Room expectedRoom = new Room();
    expectedRoom.setName("Mocked name");

    final Map<String, Room> map = new HashMap<>();
    map.put(roomKey, expectedRoom);
    config.setRooms(map);

    assertThrows(IllegalArgumentException.class, () -> config.getRoom("WrongKey"));
  }
}