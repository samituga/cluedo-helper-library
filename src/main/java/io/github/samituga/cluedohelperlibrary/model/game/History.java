package io.github.samituga.cluedohelperlibrary.model.game;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.HISTORY_ROUNDS_NOT_EMPTY_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.HISTORY_ROUNDS_NULL_MESSAGE;

import java.util.List;
import java.util.Objects;

/**
 * Represents the history of the game.
 */
public record History(List<Round> rounds) {

    /**
     * Constructor for the history.
     *
     * @param rounds an empty list that will store the {@link Round rounds}.
     * @throws NullPointerException  if the {@code rounds} is null
     * @throws IllegalStateException if the {@code rounds} is not empty
     */
    public History {

        Objects.requireNonNull(rounds, HISTORY_ROUNDS_NULL_MESSAGE);

        if (!rounds.isEmpty()) {
            throw new IllegalStateException(HISTORY_ROUNDS_NOT_EMPTY_MESSAGE);
        }

    }
}
