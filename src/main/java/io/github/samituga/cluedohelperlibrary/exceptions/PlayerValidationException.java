package io.github.samituga.cluedohelperlibrary.exceptions;

import lombok.Getter;

/**
 * Exception is thrown when the provided players contain something invalid
 * according to the {@link io.github.samituga.cluedohelperlibrary.util.GameRules GameRules}.
 */
@Getter
public class PlayerValidationException extends CluedoBusinessException {

  private final Reason reason;

  public PlayerValidationException(Reason reason) {
    super(reason.errorMessage);
    this.reason = reason;
  }

  public PlayerValidationException(String message, Reason reason) {
    super(message);
    this.reason = reason;
  }

  /**
   * Reason why this exception was thrown.
   */
  public enum Reason {
    DUPLICATE_PLAYERS("Players contain the same name"),
    INVALID_NUMBER_OF_PLAYERS("Invalid number of players provided"),
    NO_PLAYERS("No players provided"),
    INVALID_PLAY_ORDER("Players order play is invalid"),
    INVALID_CARDS_PER_PLAYER_SIZE("Players contain an invalid number of cards");

    private final String errorMessage;

    Reason(String errorMessage) {
      this.errorMessage = errorMessage;
    }
  }
}
