package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.engine.Player;
import io.github.samituga.cluedohelperlibrary.engine.PlayerImpl;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GameStartPlayerInfoInitializer {

    public static List<Player> validThreePlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);

        return List.of(player1, player2, player3);
    }

    public static List<Player> validSixPlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);
        Player player4 = new PlayerImpl(UUID.randomUUID(), "player4", validEmptyListOfCards(), 4);
        Player player5 = new PlayerImpl(UUID.randomUUID(), "player5", validEmptyListOfCards(), 5);
        Player player6 = new PlayerImpl(UUID.randomUUID(), "player6", validEmptyListOfCards(), 6);

        return List.of(player1, player2, player3, player4, player5, player6);
    }

    public static List<Player> invalidThreePlayersWithDuplicates() {
        Player duplicate1 = new PlayerImpl(UUID.randomUUID(), "duplicate", validEmptyListOfCards(),
            1);
        Player duplicate2 = new PlayerImpl(UUID.randomUUID(), "duplicate", validEmptyListOfCards(),
            2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);

        return List.of(duplicate1, duplicate2, player3);
    }

    public static List<Player> invalidInfoPlayOrderDuplicated() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 2);

        return List.of(player1, player2, player3);
    }

    public static List<Player> invalidThreePlayersWithCards() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", invalidNotEmptyListOfCards(),
            1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", invalidNotEmptyListOfCards(),
            2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", invalidNotEmptyListOfCards(),
            3);

        return List.of(player1, player2, player3);
    }

    public static List<Player> invalidInfoWrongPlayOrder() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 4);

        return List.of(player1, player2, player3);
    }

    public static List<Player> invalidTwoPlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);

        return List.of(player1, player2);
    }

    public static List<Player> invalidFourPlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);
        Player player4 = new PlayerImpl(UUID.randomUUID(), "player4", validEmptyListOfCards(), 4);

        return List.of(player1, player2, player3, player4);
    }

    public static List<Player> invalidFivePlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);
        Player player4 = new PlayerImpl(UUID.randomUUID(), "player4", validEmptyListOfCards(), 4);
        Player player5 = new PlayerImpl(UUID.randomUUID(), "player5", validEmptyListOfCards(), 5);

        return List.of(player1, player2, player3, player4, player5);
    }

    public static List<Player> invalidSevenPlayers() {
        Player player1 = new PlayerImpl(UUID.randomUUID(), "player1", validEmptyListOfCards(), 1);
        Player player2 = new PlayerImpl(UUID.randomUUID(), "player2", validEmptyListOfCards(), 2);
        Player player3 = new PlayerImpl(UUID.randomUUID(), "player3", validEmptyListOfCards(), 3);
        Player player4 = new PlayerImpl(UUID.randomUUID(), "player4", validEmptyListOfCards(), 4);
        Player player5 = new PlayerImpl(UUID.randomUUID(), "player5", validEmptyListOfCards(), 5);
        Player player6 = new PlayerImpl(UUID.randomUUID(), "player6", validEmptyListOfCards(), 6);
        Player player7 = new PlayerImpl(UUID.randomUUID(), "player7", validEmptyListOfCards(), 7);

        return List.of(player1, player2, player3, player4, player5, player6, player7);
    }

    public static List<Player> invalidEmptyListOfPlayers() {
        return new ArrayList<>();
    }

    private static List<BaseCard> validEmptyListOfCards() {
        return new ArrayList<>();
    }

    private static List<BaseCard> invalidNotEmptyListOfCards() {
        return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN);
    }
}
