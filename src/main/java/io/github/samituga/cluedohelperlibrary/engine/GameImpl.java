package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.model.Solution;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.game.GameInfo;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Implementation to the {@link Game} interface.
 */
class GameImpl implements Game {

  private final GameInfo gameInfo;
  private final Solution solution;

  public GameImpl(final GameStartInfo gameStartInfo) { // TODO: 2022-01-29 Create copy of this object to assure immutability from the outside
    this.gameInfo = new GameInfo(gameStartInfo);
    this.solution =
        new Solution(BaseCard.UNKNOWN_CHARACTER, BaseCard.UNKNOWN_WEAPON, BaseCard.UNKNOWN_ROOM);
  }

  /**
   * Getter for the solution.
   *
   * @return the solution
   */
  @Override
  public Solution solution() {
    return solution;
  }
}
