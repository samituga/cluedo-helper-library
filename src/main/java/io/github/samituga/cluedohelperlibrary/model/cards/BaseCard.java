package io.github.samituga.cluedohelperlibrary.model.cards;

/**
 * Represents the common information that every card has.
 */
public interface BaseCard {
  BaseCard UNKNOWN = new Unknown("Unknown");

  String name();

  /**
   * Represents an unknown card.
   */
  record Unknown(String name) implements BaseCard {
  }
}
