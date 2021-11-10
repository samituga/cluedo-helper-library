package io.github.samituga.cluedohelperlibrary.exceptions;

import lombok.Getter;

/**
 * Exception is thrown when the provided cards contain something invalid
 * according to the {@link io.github.samituga.cluedohelperlibrary.util.GameRules GameRules}.
 */
@Getter
public class CardValidationException extends CluedoBusinessException {

  private final Reason reason;

  public CardValidationException(Reason reason) {
    super(reason.errorMessage);
    this.reason = reason;
  }

  public CardValidationException(String message, Reason reason) {
    super(message);
    this.reason = reason;
  }

  /**
   * Reason why this exception was thrown.
   */
  public enum Reason {
    CHARACTERS_SIZE("Wrong number of characters provided"),
    WEAPONS_SIZE("Wrong number of weapons provided"),
    ROOMS_SIZE("Wrong number of rooms provided");

    private final String errorMessage;

    Reason(String errorMessage) {
      this.errorMessage = errorMessage;
    }
  }
}
