package io.github.samituga.cluedohelperlibrary.model;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_CARDS_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_NAME_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_PLAY_ORDER_NOT_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;
import java.util.Objects;

/**
 * Represents the information of a player.
 */
public record Player(String name,
                     List<BaseCard> cards,
                     Integer playOrder) {

  /**
   * Player constructor.
   *
   * @param name      The player name
   * @param cards     The player cards
   * @param playOrder The player play order
   * @throws NullPointerException if the {@code name}, {@code cards} or {@code playOrder} is null
   */
  public Player {

    Objects.requireNonNull(name, PLAYER_NAME_NOT_NULL_MESSAGE);
    Objects.requireNonNull(cards, PLAYER_CARDS_NOT_NULL_MESSAGE);
    Objects.requireNonNull(playOrder, PLAYER_PLAY_ORDER_NOT_NULL_MESSAGE);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Player player = (Player) o;
    return name.equalsIgnoreCase(player.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
