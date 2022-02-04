package io.github.samituga.cluedohelperlibrary.util;

import java.util.Arrays;
import java.util.List;
import lombok.experimental.UtilityClass;

/**
 * Utility class that will provide some of the rules to be followed by this program.
 */
@UtilityClass
public class GameRules {

    public static final List<Integer> POSSIBLE_PLAYERS_NUMBER = Arrays.asList(3, 6);

    public static final int TOTAL_NUMBER_OF_CARDS = 21;
    public static final int TOTAL_NUMBER_OF_SOLUTION_CARDS = 3;
    public static final int TOTAL_NUMBER_OF_CHARACTER_CARDS = 6;
    public static final int TOTAL_NUMBER_OF_WEAPON_CARDS = 6;
    public static final int TOTAL_NUMBER_OF_ROOM_CARDS = 9;


    public static final int CARDS_PER_PLAYER_3_PLAYERS = 6;
    public static final int CARDS_PER_PLAYER_6_PLAYERS = 3;
}
