package io.github.samituga.cluedohelperlibrary.model.game;


import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_CHARACTER_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_ROOM_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_WEAPON_NOT_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents an accusation made by a
 * {@link io.github.samituga.cluedohelperlibrary.model.Player player}.
 */
@Getter
@ToString
public class Accusation {

  private final Character character;
  private final Weapon weapon;
  private final Room room;


  /**
   * Constructor for the accusation model.
   *
   * @param character the accused character
   * @param weapon    the accused weapon
   * @param room      the accused room
   * @throws NullPointerException if the {@code character}, {@code weapon} or {@code room} is null
   */
  public Accusation(Character character, Weapon weapon, Room room) {

    Objects.requireNonNull(character, ACCUSATION_CHARACTER_NOT_NULL_MESSAGE);
    Objects.requireNonNull(weapon, ACCUSATION_WEAPON_NOT_NULL_MESSAGE);
    Objects.requireNonNull(room, ACCUSATION_ROOM_NOT_NULL_MESSAGE);

    this.character = character;
    this.weapon = weapon;
    this.room = room;
  }
}
