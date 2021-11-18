package io.github.samituga.cluedohelperlibrary.util;

import lombok.experimental.UtilityClass;

/**
 * Utility class to provide constant messages.
 */
@UtilityClass
public class MessageConstants {
  public static final String SOLUTION_CARDS_NOT_NULL_MESSAGE = "Solution card can't be null";

  public static final String PLAYER_NAME_NOT_NULL_MESSAGE = "Player name can't be null";
  public static final String PLAYER_CARDS_NOT_NULL_MESSAGE = "Player cards can't be null";
  public static final String PLAYER_PLAY_ORDER_NOT_NULL_MESSAGE = "Player play order can't be null";

  public static final String ACCUSATION_CHARACTER_NOT_NULL_MESSAGE =
      "Accusation character can't be null";
  public static final String ACCUSATION_WEAPON_NOT_NULL_MESSAGE = "Accusation weapon can't be null";
  public static final String ACCUSATION_ROOM_NOT_NULL_MESSAGE = "Accusation room can't be null";

  public static final String HISTORY_ROUNDS_NULL_MESSAGE = "History rounds can't be null";
  public static final String HISTORY_ROUNDS_NOT_EMPTY_MESSAGE = "History rounds should be empty";

  public static final String ROUND_NUMBER_NULL_MESSAGE = "Round number can't be null";
  public static final String ROUND_ACCUSER_NULL_MESSAGE = "Round accuser can't be null";
  public static final String ROUND_ACCUSATION_NULL_MESSAGE = "Round accusation can't be null";
  public static final String ROUND_SHOWN_CARD_NULL_MESSAGE =
      "Round shown card can't be null, use UNKNOWN instead";
}
