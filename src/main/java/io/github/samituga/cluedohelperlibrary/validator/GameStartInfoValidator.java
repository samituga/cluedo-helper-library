package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Validator for the {@link GameStartInfo}.<br>
 * Will verify if the information to start the game is valid.
 */
public interface GameStartInfoValidator {

  /**
   * Validates if the info provided to start the game is valid.
   *
   * @param gameStartInfo The game start information
   * @return true if the information is valid to start the game
   * @throws PlayerValidationException if the players' information is not valid
   * @throws CardValidationException   if the cards' information is not valid
   */
  boolean validateGameStart(GameStartInfo gameStartInfo)
      throws PlayerValidationException, CardValidationException;
}
