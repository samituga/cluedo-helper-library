package io.github.samituga.cluedohelperlibrary.model.cards;

import java.util.UUID;

/**
 * Represents a Cluedo room.
 */
public class Room implements BaseCard {

  private final String name;
  private final UUID uuid;

  public Room(final String name, final UUID uuid) {
    this.name = name;
    this.uuid = uuid;
  }

  /**
   * Creates a copy of the room.
   *
   * @param room to be copied
   */
  public Room(final Room room) {
    this.name = room.name;
    this.uuid = room.uuid;
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
