package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameAlreadyInProgressException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.validator.GameStartInfoValidator;

/**
 * Implementation to the {@link Game} interface.
 */
public class GameImpl implements Game {

  private final GameStartInfoValidator gameStartInfoValidator;

  private GameStartInfo gameStartInfo;

  public GameImpl(GameStartInfoValidator gameStartInfoValidator) {
    this.gameStartInfoValidator = gameStartInfoValidator;
  }

  /**
   * Method to start the engine.
   *
   * @param gameStartInfo All the information relative to the game
   * @throws CardValidationException        if there is a card validation failure
   * @throws PlayerValidationException      if there is a player validation failure
   * @throws GameAlreadyInProgressException if there is a game in progress
   * @throws GameStartInfoNullException     if {@code gameStartInfo} is null
   */
  @Override
  public void start(GameStartInfo gameStartInfo)
      throws CardValidationException, PlayerValidationException, GameAlreadyInProgressException,
      GameStartInfoNullException {

    if (this.gameStartInfo != null) {
      throw new GameAlreadyInProgressException();
    }

    gameStartInfoValidator.validateGameStart(gameStartInfo);
    this.gameStartInfo = gameStartInfo;
  }
}
