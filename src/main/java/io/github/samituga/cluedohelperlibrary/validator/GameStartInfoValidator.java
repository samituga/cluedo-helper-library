package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import lombok.experimental.UtilityClass;

/**
 * Validator for the {@link GameStartInfo}.<br>
 * Will verify if the information to start the game is valid.
 */
@UtilityClass
public class GameStartInfoValidator {

  public static boolean validateGameStart(GameStartInfo gameStartInfo)
      throws PlayerValidationException {

    PlayerInfoValidator.validatePlayers(gameStartInfo.getPlayers());
    return true;
  }
}
