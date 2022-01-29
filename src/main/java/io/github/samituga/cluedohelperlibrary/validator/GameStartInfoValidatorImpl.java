package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Implementation class for the interface {@link GameStartInfoValidator}.
 */
public class GameStartInfoValidatorImpl implements GameStartInfoValidator {

  /**
   * Validates if the info provided to start the game is valid.
   *
   * @param gameStartInfo The game start information
   * @return true if the information is valid to start the game
   * @throws PlayerValidationException  if the players' information is not valid
   * @throws CardValidationException    if the cards' information is not valid
   * @throws GameStartInfoNullException if {@code gameStartInfo} is null
   */
  @Override
  public boolean validateGameStart(GameStartInfo gameStartInfo)
      throws PlayerValidationException, CardValidationException, GameStartInfoNullException {

    if (gameStartInfo == null) {
      throw new GameStartInfoNullException();
    }

    PlayerInfoValidator.validatePlayers(gameStartInfo.players());
    CardsInfoValidator.validateCards(
        gameStartInfo.characters(), gameStartInfo.weapons(), gameStartInfo.rooms());
    return true;
  }
}
