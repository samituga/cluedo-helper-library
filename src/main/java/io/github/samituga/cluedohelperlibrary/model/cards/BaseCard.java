package io.github.samituga.cluedohelperlibrary.model.cards;

import java.util.UUID;

/**
 * Represents the common information that every card has.
 */
public interface BaseCard extends Cloneable {
    BaseCard UNKNOWN = new Unknown("Unknown", UUID.randomUUID());

    // TODO: 18/11/2021 This specific unknown cards are smelly, there should be a better way of doing this
    Character UNKNOWN_CHARACTER = new Character("Unknown character", UUID.randomUUID());
    Weapon UNKNOWN_WEAPON = new Weapon("Unknown weapon", UUID.randomUUID());
    Room UNKNOWN_ROOM = new Room("Unknown, room", UUID.randomUUID());

    String name();

    UUID uuid();

    /**
     * Represents an unknown card.
     */
    record Unknown(String name, UUID uuid) implements BaseCard {
    }
}
