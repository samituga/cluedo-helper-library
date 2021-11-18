package io.github.samituga.cluedohelperlibrary.model.cards;

/**
 * Represents the common information that every card has.
 */
public interface BaseCard {
  BaseCard UNKNOWN = new Unknown("Unknown");

  // TODO: 18/11/2021 This specific unknown cards are smelly, there should be a better way of doing this
  Character UNKNOWN_CHARACTER = new Character("Unknown character");
  Weapon UNKNOWN_WEAPON = new Weapon("Unknown weapon");
  Room UNKNOWN_ROOM = new Room("Unknown, room");

  String name();

  /**
   * Represents an unknown card.
   */
  record Unknown(String name) implements BaseCard {
  }
}
