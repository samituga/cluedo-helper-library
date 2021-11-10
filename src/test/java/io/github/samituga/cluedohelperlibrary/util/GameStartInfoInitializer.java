package io.github.samituga.cluedohelperlibrary.util;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameStartInfoInitializer {


  public static GameStartInfo validInfoThreePlayers() {
    return new GameStartInfo(threeValidPlayers(), validFullGameCards());
  }

  public static GameStartInfo validInfoSixPlayers() {
    return new GameStartInfo(sixValidPlayers(), validFullGameCards());
  }

  public static GameStartInfo duplicatePlayers() {
    return new GameStartInfo(threePlayersWithDuplicates(), validFullGameCards());
  }

  public static GameStartInfo noPlayers() {
    return new GameStartInfo(emptyListOfPlayers(), validFullGameCards());
  }

  public static GameStartInfo playersWithDuplicatePlayOrder() {
    return new GameStartInfo(invalidInfoPlayOrderDuplicated(), validFullGameCards());
  }

  public static GameStartInfo playersWithWrongPlayOrderDuplicate() {
    return new GameStartInfo(invalidInfoWrongPlayOrder(), validFullGameCards());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayers() {
    return new GameStartInfo(threePlayersInvalidCardsPerPlayer(), validFullGameCards());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayersHaveDifferentCardsSize() {
    return new GameStartInfo(threePlayersHaveDifferentCardsSize(), validFullGameCards());
  }

  public static GameStartInfo invalidCardsPerPlayerSixPlayers() {
    return new GameStartInfo(sixPlayersInvalidCardsPerPlayer(), validFullGameCards());
  }


  public static GameStartInfo invalidInfoTwoPlayers() {
    return new GameStartInfo(twoPlayers(), validFullGameCards());
  }

  public static GameStartInfo invalidInfoFourPlayers() {
    return new GameStartInfo(fourPlayers(), validFullGameCards());
  }

  public static GameStartInfo invalidInfoFivePlayers() {
    return new GameStartInfo(fivePlayers(), validFullGameCards());
  }

  public static GameStartInfo invalidInfoSevenPlayers() {
    return new GameStartInfo(sevenPlayers(), validFullGameCards());
  }

  private static List<Player> emptyListOfPlayers() {
    return new ArrayList<>();
  }

  private static List<Player> threeValidPlayers() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  private static List<Player> sixValidPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);
    Player player6 = new Player("player6", threeUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  private static List<Player> threePlayersWithDuplicates() {
    Player duplicate1 = new Player("duplicate", sixUnknownCards(), 1);
    Player duplicate2 = new Player("duplicate", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);

    return List.of(duplicate1, duplicate2, player3);
  }

  private static List<Player> invalidInfoPlayOrderDuplicated() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 2);

    return List.of(player1, player2, player3);
  }

  private static List<Player> threePlayersInvalidCardsPerPlayer() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  private static List<Player> threePlayersHaveDifferentCardsSize() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);

    return List.of(player1, player2, player3);
  }

  private static List<Player> sixPlayersInvalidCardsPerPlayer() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 3);
    Player player4 = new Player("player4", sixUnknownCards(), 4);
    Player player5 = new Player("player5", sixUnknownCards(), 5);
    Player player6 = new Player("player6", sixUnknownCards(), 6);

    return List.of(player1, player2, player3, player4, player5, player6);
  }

  private static List<Player> invalidInfoWrongPlayOrder() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);
    Player player3 = new Player("player3", sixUnknownCards(), 4);

    return List.of(player1, player2, player3);
  }

  private static List<Player> twoPlayers() {
    Player player1 = new Player("player1", sixUnknownCards(), 1);
    Player player2 = new Player("player2", sixUnknownCards(), 2);

    return List.of(player1, player2);
  }

  private static List<Player> fourPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);

    return List.of(player1, player2, player3, player4);
  }

  private static List<Player> fivePlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);

    return List.of(player1, player2, player3, player4, player5);
  }

  private static List<Player> sevenPlayers() {
    Player player1 = new Player("player1", threeUnknownCards(), 1);
    Player player2 = new Player("player2", threeUnknownCards(), 2);
    Player player3 = new Player("player3", threeUnknownCards(), 3);
    Player player4 = new Player("player4", threeUnknownCards(), 4);
    Player player5 = new Player("player5", threeUnknownCards(), 5);
    Player player6 = new Player("player6", threeUnknownCards(), 6);
    Player player7 = new Player("player7", threeUnknownCards(), 7);

    return List.of(player1, player2, player3, player4, player5, player6, player7);
  }

  private static List<BaseCard> threeUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }

  private static List<BaseCard> sixUnknownCards() {
    return List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN,
        BaseCard.UNKNOWN, BaseCard.UNKNOWN);
  }

  private static List<BaseCard> validFullGameCards() {

    List<Character> characters = sixValidCharacters();
    List<Weapon> weapons = sixValidWeapons();
    List<Room> rooms = nineValidRooms();

    return Stream
        .of(characters, weapons, rooms)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
  }

  private static List<Character> sixValidCharacters() {
    Character character1 = new Character("character1");
    Character character2 = new Character("character2");
    Character character3 = new Character("character3");
    Character character4 = new Character("character4");
    Character character5 = new Character("character5");
    Character character6 = new Character("character6");

    return List.of(character1, character2, character3, character4, character5, character6);
  }

  private static List<Weapon> sixValidWeapons() {
    Weapon weapon1 = new Weapon("weapon1");
    Weapon weapon2 = new Weapon("weapon2");
    Weapon weapon3 = new Weapon("weapon3");
    Weapon weapon4 = new Weapon("weapon4");
    Weapon weapon5 = new Weapon("weapon5");
    Weapon weapon6 = new Weapon("weapon6");

    return List.of(weapon1, weapon2, weapon3, weapon4, weapon5, weapon6);
  }

  private static List<Room> nineValidRooms() {
    Room room1 = new Room("room1");
    Room room2 = new Room("room2");
    Room room3 = new Room("room3");
    Room room4 = new Room("room4");
    Room room5 = new Room("room5");
    Room room6 = new Room("room6");
    Room room7 = new Room("room7");
    Room room8 = new Room("room8");
    Room room9 = new Room("room9");

    return List.of(room1, room2, room3, room4, room5, room6, room7, room8, room9);
  }

}
