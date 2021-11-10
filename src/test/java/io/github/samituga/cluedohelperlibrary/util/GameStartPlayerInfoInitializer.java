package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.ArrayList;
import java.util.List;

public class GameStartPlayerInfoInitializer {

  public static List<Player> threeValidPlayers() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> sixValidPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);
    Player player6 = new Player("player6", threeUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  public static List<Player> threePlayersWithDuplicates() {
    Player duplicate1 = new Player("duplicate", sixUnknownCards(), 1);
    Player duplicate2 = new Player("duplicate", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);

    return List.of(duplicate1, duplicate2, player3);
  }

  public static List<Player> invalidInfoPlayOrderDuplicated() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 2);

    return List.of(player1, player2, player3);
  }

  public static List<Player> threePlayersInvalidCardsPerPlayer() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> threePlayersHaveDifferentCardsSize() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  public static List<Player> sixPlayersInvalidCardsPerPlayer() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);
    Player player4 = new Player("player4", sixUnknownCards(), 4);
    Player player5 = new Player("player5", sixUnknownCards(), 5);
    Player player6 = new Player("player6", sixUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  public static List<Player> invalidInfoWrongPlayOrder() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 4);

    return List.of(player1, player2, player3);
  }

  public static List<Player> twoPlayers() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);

    return List.of(player1, player2);
  }

  public static List<Player> fourPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);

    return List.of(player1, player2, player3, player4);
  }

  public static List<Player> fivePlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);

    return List.of(player1, player2, player3, player4, player5);
  }

  public static List<Player> sevenPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);
    Player player6 = new Player("player6", threeUnknownCards(), 6);
    Player player7 = new Player("player7", threeUnknownCards(), 7);

    return List.of(player1, player2, player3, player4, player5, player6, player7);
  }

  public static List<Player> emptyListOfPlayers() {
    return new ArrayList<>();
  }


  private static List<BaseCard> threeUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }

  private static List<BaseCard> sixUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN,
        BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }
}
