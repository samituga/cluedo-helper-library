package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.ArrayList;
import java.util.List;

public class GameStartPlayerInfoInitializer {

  public static List<Player> validThreePlayers() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validSixUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> validSixPlayers() {
    Player player1 = new Player("player1", validThreeUnknownCards(), 1);
    Player player2 = new Player("player2", validThreeUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);
    Player player4 = new Player("player4", validThreeUnknownCards(), 4);
    Player player5 = new Player("player5", validThreeUnknownCards(), 5);
    Player player6 = new Player("player6", validThreeUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  public static List<Player> invalidThreePlayersWithDuplicates() {
    Player duplicate1 = new Player("duplicate", validSixUnknownCards(), 1);
    Player duplicate2 = new Player("duplicate", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validSixUnknownCards(), 3);

    return List.of(duplicate1, duplicate2, player3);
  }

  public static List<Player> invalidInfoPlayOrderDuplicated() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validSixUnknownCards(), 2);

    return List.of(player1, player2, player3);
  }

  public static List<Player> invalidThreePlayersCardsPerPlayer() {
    Player player1 = new Player("player1", validThreeUnknownCards(), 1);
    Player player2 = new Player("player2", validThreeUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> invalidThreePlayersDifferentCardsSize() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> invalidSixPlayersCardsPerPlayer() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validSixUnknownCards(), 3);
    Player player4 = new Player("player4", validSixUnknownCards(), 4);
    Player player5 = new Player("player5", validSixUnknownCards(), 5);
    Player player6 = new Player("player6", validSixUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  public static List<Player> invalidInfoWrongPlayOrder() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);
    Player player3 = new Player("player3", validSixUnknownCards(), 4);

    return List.of(player1, player2, player3);
  }

  public static List<Player> invalidTwoPlayers() {
    Player player1 = new Player("player1", validSixUnknownCards(), 1);
    Player player2 = new Player("player2", validSixUnknownCards(), 2);

    return List.of(player1, player2);
  }

  public static List<Player> invalidFourPlayers() {
    Player player1 = new Player("player1", validThreeUnknownCards(), 1);
    Player player2 = new Player("player2", validThreeUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);
    Player player4 = new Player("player4", validThreeUnknownCards(), 4);

    return List.of(player1, player2, player3, player4);
  }

  public static List<Player> invalidFivePlayers() {
    Player player1 = new Player("player1", validThreeUnknownCards(), 1);
    Player player2 = new Player("player2", validThreeUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);
    Player player4 = new Player("player4", validThreeUnknownCards(), 4);
    Player player5 = new Player("player5", validThreeUnknownCards(), 5);

    return List.of(player1, player2, player3, player4, player5);
  }

  public static List<Player> invalidSevenPlayers() {
    Player player1 = new Player("player1", validThreeUnknownCards(), 1);
    Player player2 = new Player("player2", validThreeUnknownCards(), 2);
    Player player3 = new Player("player3", validThreeUnknownCards(), 3);
    Player player4 = new Player("player4", validThreeUnknownCards(), 4);
    Player player5 = new Player("player5", validThreeUnknownCards(), 5);
    Player player6 = new Player("player6", validThreeUnknownCards(), 6);
    Player player7 = new Player("player7", validThreeUnknownCards(), 7);

    return List.of(player1, player2, player3, player4, player5, player6, player7);
  }

  public static List<Player> invalidEmptyListOfPlayers() {
    return new ArrayList<>();
  }


  private static List<BaseCard> validThreeUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }

  private static List<BaseCard> validSixUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN,
        BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }
}
