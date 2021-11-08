package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when no players are provided.
 */
public class NoPlayersException extends CluedoBusinessException {

  private static final String NO_PLAYERS_ERROR_MESSAGE = "No players provided";

  public NoPlayersException() {
    super(NO_PLAYERS_ERROR_MESSAGE);
  }

  public NoPlayersException(String message) {
    super(message);
  }
}
