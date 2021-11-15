package io.github.samituga.cluedohelperlibrary.model;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;

/**
 * POJO that will hold the info about a player.
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
   */
  public Player(String name, List<BaseCard> cards, Integer playOrder) {
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
