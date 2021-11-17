package io.github.samituga.cluedohelperlibrary.model;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.SOLUTION_CARDS_NOT_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.Objects;
import lombok.Data;

/**
 * <p> Represents the solution cards of the game.</p>
 * <p>Who - {@link Character}</p>
 * <p>With - {@link Weapon}</p>
 * <p>Where - {@link Room}</p>
 */
@Data
public class Solution {

  private final Character character;

  private final Weapon weapon;

  private final Room room;

  /**
   * Solution constructor.
   *
   * @param character who
   * @param weapon    with
   * @param room      where
   * @throws NullPointerException if the {@code character}, {@code weapon} or {@code room} is null
   */
  public Solution(final Character character, final Weapon weapon, final Room room) {

    Objects.requireNonNull(character, SOLUTION_CARDS_NOT_NULL_MESSAGE);
    Objects.requireNonNull(weapon, SOLUTION_CARDS_NOT_NULL_MESSAGE);
    Objects.requireNonNull(room, SOLUTION_CARDS_NOT_NULL_MESSAGE);

    this.character = character;
    this.weapon = weapon;
    this.room = room;
  }
}
