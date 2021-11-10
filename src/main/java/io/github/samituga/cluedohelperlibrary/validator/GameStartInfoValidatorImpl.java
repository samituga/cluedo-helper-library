package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Implementation class for the interface {@link GameStartInfoValidator}.
 */
public class GameStartInfoValidatorImpl implements GameStartInfoValidator {

  @Override
  public boolean validateGameStart(GameStartInfo gameStartInfo)
      throws PlayerValidationException, CardValidationException {

    PlayerInfoValidator.validatePlayers(gameStartInfo.getPlayers());
    CardsInfoValidator.validateCards(
        gameStartInfo.getCharacters(), gameStartInfo.getWeapons(), gameStartInfo.getRooms());
    return true;
  }
}
