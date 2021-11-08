package io.github.samituga.cluedohelperlibrary.model.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * POJO that represents the common information that every card has.
 */
@Getter
@AllArgsConstructor
public abstract class BaseCard {
  private final String name;
}
