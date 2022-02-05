package io.github.samituga.cluedohelperlibrary.model.cards;

import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.CARD_NAME_NULL_MESSAGE;
import static io.github.samituga.cluedohelperlibrary.util.MessageConstants.CARD_UUID_NULL_MESSAGE;

import java.util.Objects;
import java.util.UUID;

/**
 * Represents a Cluedo room.
 */
public record Room(String name, UUID uuid) implements BaseCard {

    public Room {
        Objects.requireNonNull(name, CARD_NAME_NULL_MESSAGE);
        Objects.requireNonNull(uuid, CARD_UUID_NULL_MESSAGE);
    }
}
