package io.github.samituga.cluedohelperlibrary.model.cards;

import java.util.Objects;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseCard baseCard = (BaseCard) o;
    return name.equalsIgnoreCase(baseCard.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

  private static class Unknown extends BaseCard {
    private Unknown() {
      super("Unknown");
    }
  }
}
