package io.github.samituga.cluedohelperlibrary.model.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * POJO that represents the common information that every card has.
 */
@Getter
@AllArgsConstructor
public abstract class BaseCard {
  public static final BaseCard UNKNOWN = new Unknown();
  private final String name;

  private static class Unknown extends BaseCard {
    private Unknown() {
      super("Unknown");
    }
  }
}
