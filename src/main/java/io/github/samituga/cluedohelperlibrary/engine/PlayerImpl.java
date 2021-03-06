package io.github.samituga.cluedohelperlibrary.engine;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_CARDS_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_NAME_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.PLAYER_PLAY_ORDER_NULL_MESSAGE;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Represents the information of a player.
 */
public record PlayerImpl(UUID uuid,
                         String name,
                         List<BaseCard> cards,
                         Integer playOrder) implements Player {

    /**
     * Player constructor.
     *
     * @param name      The player name
     * @param cards     The player cards
     * @param playOrder The player play order, starts at 1 and increments by 1 for the next player
     * @throws NullPointerException if the {@code name}, {@code cards} or {@code playOrder} is null
     */
    public PlayerImpl {

        Objects.requireNonNull(name, PLAYER_NAME_NULL_MESSAGE);
        Objects.requireNonNull(cards, PLAYER_CARDS_NULL_MESSAGE);
        Objects.requireNonNull(playOrder, PLAYER_PLAY_ORDER_NULL_MESSAGE);

        cards = new ArrayList<>(cards);
    }


    /**
     * The player cards.
     *
     * @return a copy of the player cards
     */
    @Override
    public List<BaseCard> cards() {
        return new ArrayList<>(cards);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlayerImpl player = (PlayerImpl) o;
        return name.equalsIgnoreCase(player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
