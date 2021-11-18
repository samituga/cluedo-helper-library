package io.github.samituga.cluedohelperlibrary.model.game;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_ACCUSATION_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_ACCUSER_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_NUMBER_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_SHOWN_CARD_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.Objects;


/**
 * Represents a round of the game.
 */
public record Round(Integer number,
                    Player accuser,
                    Player answerer,
                    Accusation accusation,
                    BaseCard shownCard) {

  /**
   * Constructor for a Cluedo round.
   *
   * @param number     the round number
   * @param accuser    the player that makes the accusation
   * @param answerer   the player that shows a card, or null if no one shows a card
   * @param accusation the suspect cards
   * @param shownCard  the shown card or an {@link BaseCard#UNKNOWN unknown}.
   * @throws NullPointerException if the {@code number}, {@code accuser}, {@code accusation}
   *                              or {@code shownCard} is null
   */
  public Round {

    Objects.requireNonNull(number, ROUND_NUMBER_NULL_MESSAGE);
    Objects.requireNonNull(accuser, ROUND_ACCUSER_NULL_MESSAGE);
    Objects.requireNonNull(accusation, ROUND_ACCUSATION_NULL_MESSAGE);
    Objects.requireNonNull(shownCard, ROUND_SHOWN_CARD_NULL_MESSAGE);
  }
}
