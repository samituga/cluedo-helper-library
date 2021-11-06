package io.github.samituga.cluedohelperlibrary.model;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.SOLUTION_CARDS_NOT_NULL_MESSAGE;
import static java.util.Objects.requireNonNull;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import lombok.Data;

/**
 * <p> POJO that represents the solution cards of the game.</p>
 * <p>Who - {@link Character}</p>
 * <p>With - {@link Weapon}</p>
 * <p>Where - {@link Room}</p>
 */
@Data
@JsonPropertyOrder({
    "name"
})
public class Solution {

  @JsonProperty("character")
  private final Character character;

  @JsonProperty("weapon")
  private final Weapon weapon;

  @JsonProperty("room")
  private final Room room;

  /**
   * Solution constructor.
   *
   * @param character who
   * @param weapon    with
   * @param room      where
   */
  public Solution(final Character character, final Weapon weapon, final Room room) {

    requireNonNull(character, SOLUTION_CARDS_NOT_NULL_MESSAGE);
    requireNonNull(weapon, SOLUTION_CARDS_NOT_NULL_MESSAGE);
    requireNonNull(room, SOLUTION_CARDS_NOT_NULL_MESSAGE);

    this.character = character;
    this.weapon = weapon;
    this.room = room;
  }
}
