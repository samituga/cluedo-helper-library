package io.github.samituga.cluedohelperlibrary.exceptions;

import java.util.List;
import lombok.Getter;

/**
 * Exception is thrown when there is an attempt to start the game
 * with the wrong number of players.
 */
@Getter
public class InvalidNumberOfPlayersException extends CluedoBusinessException {
  private static final String INVALID_NR_OF_PLAYERS_ERROR_MESSAGE =
      "Invalid number of players provided";
  private final List<Integer> validNrOfPlayers;

  public InvalidNumberOfPlayersException(List<Integer> validNrOfPlayers) {
    super(INVALID_NR_OF_PLAYERS_ERROR_MESSAGE);
    this.validNrOfPlayers = validNrOfPlayers;
  }

  public InvalidNumberOfPlayersException(String message, List<Integer> validNrOfPlayers) {
    super(message);
    this.validNrOfPlayers = validNrOfPlayers;
  }
}
