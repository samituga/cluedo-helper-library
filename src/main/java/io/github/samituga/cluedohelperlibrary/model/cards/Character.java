package io.github.samituga.cluedohelperlibrary.model.cards;

import java.util.UUID;

/**
 * Represents a Cluedo character.
 */
public class Character implements BaseCard {

  private final String name;
  private final UUID uuid;

  public Character(final String name, final UUID uuid) {
    this.name = name;
    this.uuid = uuid;
  }

  /**
   * Creates a copy of the character.
   *
   * @param character to be copied
   */
  public Character(final Character character) {
    name = character.name;
    uuid = character.uuid;
  }

  @Override
  public String name() {
    return name;
  }

  @Override
  public UUID uuid() {
    return uuid;
  }
}
