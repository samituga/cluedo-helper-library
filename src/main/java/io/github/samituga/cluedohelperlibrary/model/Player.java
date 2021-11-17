package io.github.samituga.cluedohelperlibrary.model;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_CARDS_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_NAME_NOT_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_PLAY_ORDER_NOT_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents the information of a player.
 */
@Getter
@ToString
public class Player {

  private final String name;
  private final List<BaseCard> cards;
  private final Integer playOrder;

  /**
   * Player constructor.
   *
   * @param name      The player name
   * @param cards     The player cards
   * @param playOrder The player play order
   * @throws NullPointerException if the {@code name}, {@code cards} or {@code playOrder} is null
   */
  public Player(String name, List<BaseCard> cards, Integer playOrder) {

    Objects.requireNonNull(name, PLAYER_NAME_NOT_NULL_MESSAGE);
    Objects.requireNonNull(cards, PLAYER_CARDS_NOT_NULL_MESSAGE);
    Objects.requireNonNull(playOrder, PLAYER_PLAY_ORDER_NOT_NULL_MESSAGE);

    this.name = name;
    this.cards = cards;
    this.playOrder = playOrder;
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
