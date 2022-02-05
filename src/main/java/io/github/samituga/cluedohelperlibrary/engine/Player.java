package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.List;
import java.util.UUID;

/**
 * Represents a player.
 */
public interface Player {

    /**
     * Player unique identifier.
     *
     * @return the player unique identifier
     */
    UUID uuid();

    /**
     * Name of the player.
     *
     * @return the name of the player
     */
    String name();

    /**
     * The player cards.
     *
     * @return a copy of the player cards
     */
    List<BaseCard> cards();

    /**
     * Play position of this player.
     *
     * @return the order of this player to play
     */
    Integer playOrder();
}
