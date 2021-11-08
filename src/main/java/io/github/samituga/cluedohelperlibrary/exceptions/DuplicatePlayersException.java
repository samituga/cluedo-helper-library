package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when no duplicate players are provided.
 */
public class DuplicatePlayersException extends CluedoBusinessException {
  private static final String DUPLICATE_PLAYERS_ERROR_MESSAGE = "Duplicate players provided";

  public DuplicatePlayersException() {
    super(DUPLICATE_PLAYERS_ERROR_MESSAGE);
  }

  public DuplicatePlayersException(String message) {
    super(message);
  }
}
