package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import lombok.experimental.UtilityClass;

/**
 * Validator for the {@link GameStartInfo}.<br>
 * Will verify if the information to start the game is valid.
 */
@UtilityClass
public class GameStartInfoValidator {

  /**
   * Validates if the info provided to start the game is valid.
   *
   * @param gameStartInfo The game start information
   * @return true if the information is valid to start the game
   * @throws PlayerValidationException if there the players information is not valid
   * @throws CardValidationException   if there the cards information is not valid
   */
  public static boolean validateGameStart(GameStartInfo gameStartInfo)
      throws PlayerValidationException, CardValidationException {

    PlayerInfoValidator.validatePlayers(gameStartInfo.getPlayers());
    CardsInfoValidator.validateCards(
        gameStartInfo.getCharacters(), gameStartInfo.getWeapons(), gameStartInfo.getRooms());
    return true;
  }
}
