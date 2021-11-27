package io.github.samituga.cluedohelperlibrary.model;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;

/**
 * Represents a player.
 */
public interface Player {

  /**
   * Name of the player.
   *
   * @return the name of the player
   */
  String name();

  /**
   * The player cards.
   *
   * @return the player cards
   */
  List<BaseCard> cards();

  /**
   * Play position of this player.
   *
   * @return the order of this player to play
   */
  Integer playOrder();
}
