package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameAlreadyInProgressException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Will serve as a engine for the cluedo helper library. <br>
 * This will serve as an interface of the library for every action.
 */
public interface Game {

  /**
   * Method to start the engine.
   *
   * @param gameStartInfo All the information relative to the game
   * @throws CardValidationException        if there is a card validation failure
   * @throws PlayerValidationException      if there is a player validation failure
   * @throws GameAlreadyInProgressException if there is a game in progress
   */
  void start(GameStartInfo gameStartInfo)
      throws CardValidationException, PlayerValidationException, GameAlreadyInProgressException;

}