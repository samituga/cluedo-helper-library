package io.github.samituga.cluedohelperlibrary.model.cards;

import java.util.UUID;

/**
 * Represents a Cluedo weapon.
 */
public class Weapon implements BaseCard {

  private final String name;
  private final UUID uuid;

  public Weapon(final String name, final UUID uuid) {
    this.name = name;
    this.uuid = uuid;
  }

  /**
   * Creates a copy of the weapon.
   *
   * @param weapon to be copied
   */
  public Weapon(final Weapon weapon) {
    this.name = weapon.name;
    this.uuid = weapon.uuid;
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
