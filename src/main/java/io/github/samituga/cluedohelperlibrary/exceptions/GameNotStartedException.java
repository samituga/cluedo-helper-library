package io.github.samituga.cluedohelperlibrary.exceptions;

import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;

/**
 * Exception is thrown when client attempts to invoke a method from the
 * {@link io.github.samituga.cluedohelperlibrary.engine.Game game} before
 * {@link io.github.samituga.cluedohelperlibrary.engine.Game#start(GameStartInfo) staring}
 * the engine.
 */
public class GameNotStartedException extends CluedoBusinessException {
  private static final String GAME_NOT_STARTED_ERROR_MESSAGE
      = "Game engine not running";

  public GameNotStartedException() {
    super(GAME_NOT_STARTED_ERROR_MESSAGE);
  }

  public GameNotStartedException(String message) {
    super(message);
  }
}
