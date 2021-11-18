package io.github.samituga.cluedohelperlibrary.model.game;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.HISTORY_ROUNDS_NOT_EMPTY_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.HISTORY_ROUNDS_NULL_MESSAGE;

import java.util.List;
import java.util.Objects;
import lombok.Getter;

/**
 * Represents the history of the game.
 */
@Getter
public class History {

  private final List<Round> rounds;

  /**
   * Constructor for the history.
   *
   * @param rounds an empty list that will store the {@link Round rounds}.
   * @throws NullPointerException  if the {@code rounds} is null
   * @throws IllegalStateException if the {@code rounds} is not empty
   */
  public History(List<Round> rounds) {

    Objects.requireNonNull(rounds, HISTORY_ROUNDS_NULL_MESSAGE);

    if (!rounds.isEmpty()) {
      throw new IllegalStateException(HISTORY_ROUNDS_NOT_EMPTY_MESSAGE);
    }

    this.rounds = rounds;
  }
}
