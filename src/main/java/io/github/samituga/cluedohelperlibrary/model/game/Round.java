package io.github.samituga.cluedohelperlibrary.model.game;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_ACCUSATION_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_ACCUSER_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_NUMBER_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.ROUND_SHOWN_CARD_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.Objects;
import lombok.Getter;
import lombok.ToString;


/**
 * Represents a round of the game.
 */
@Getter
@ToString
public class Round {

  private final Integer number;
  private final Player accuser;
  private final Player answerer;
  private final Accusation accusation;
  private final BaseCard shownCard;

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
  public Round(Integer number,
               Player accuser,
               Player answerer,
               Accusation accusation,
               BaseCard shownCard) {

    Objects.requireNonNull(number, ROUND_NUMBER_NULL_MESSAGE);
    Objects.requireNonNull(accuser, ROUND_ACCUSER_NULL_MESSAGE);
    Objects.requireNonNull(accusation, ROUND_ACCUSATION_NULL_MESSAGE);
    Objects.requireNonNull(shownCard, ROUND_SHOWN_CARD_NULL_MESSAGE);

    this.number = number;
    this.accuser = accuser;
    this.answerer = answerer;
    this.accusation = accusation;
    this.shownCard = shownCard;
  }
}
