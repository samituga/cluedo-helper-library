package io.github.samituga.cluedohelperlibrary.model.game;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;
import lombok.Getter;


/**
 * POJO that holds the information necessary to start the game.
 */
@Getter
public class GameStartInfo {

  // TODO: 08/11/2021 WIP
  private final List<Player> players;
  private final List<BaseCard> cards;


  public GameStartInfo(List<Player> players, List<BaseCard> cards) {
    this.players = players;
    this.cards = cards;
  }
}
