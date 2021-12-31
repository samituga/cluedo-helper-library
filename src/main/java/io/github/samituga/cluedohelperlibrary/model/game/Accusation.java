package io.github.samituga.cluedohelperlibrary.model.game;


import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_CHARACTER_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_ROOM_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ACCUSATION_WEAPON_NOT_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.engine.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.Objects;

/**
 * Represents an accusation made by a
 * {@link Player player}.
 */
public record Accusation(Character character,
                         Weapon weapon,
                         Room room) {

  /**
   * Constructor for the accusation model.
   *
   * @param character the accused character
   * @param weapon the accused weapon
   * @param room the accused room
   * @throws NullPointerException if the {@code character}, {@code weapon} or {@code room} is null
   */
  public Accusation {

    Objects.requireNonNull(character, ACCUSATION_CHARACTER_NOT_NULL_MESSAGE);
    Objects.requireNonNull(weapon, ACCUSATION_WEAPON_NOT_NULL_MESSAGE);
    Objects.requireNonNull(room, ACCUSATION_ROOM_NOT_NULL_MESSAGE);
  }
}
