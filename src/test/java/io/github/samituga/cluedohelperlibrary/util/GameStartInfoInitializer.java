package io.github.samituga.cluedohelperlibrary.util;

import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.nineValidRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.sixValidCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.sixValidWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.emptyListOfPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.fivePlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.fourPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoPlayOrderDuplicated;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoWrongPlayOrder;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.sevenPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.sixPlayersInvalidCardsPerPlayer;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.sixValidPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.threePlayersHaveDifferentCardsSize;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.threePlayersInvalidCardsPerPlayer;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.threePlayersWithDuplicates;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.threeValidPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.twoPlayers;

import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameStartInfoInitializer {


  public static GameStartInfo validInfoThreePlayers() {
    return new GameStartInfo(threeValidPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo validInfoSixPlayers() {
    return new GameStartInfo(sixValidPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo duplicatePlayers() {
    return new GameStartInfo(threePlayersWithDuplicates(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo noPlayers() {
    return new GameStartInfo(emptyListOfPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo playersWithDuplicatePlayOrder() {
    return new GameStartInfo(invalidInfoPlayOrderDuplicated(), sixValidCharacters(),
        sixValidWeapons(), nineValidRooms());
  }

  public static GameStartInfo playersWithWrongPlayOrderDuplicate() {
    return new GameStartInfo(invalidInfoWrongPlayOrder(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayers() {
    return new GameStartInfo(threePlayersInvalidCardsPerPlayer(), sixValidCharacters(),
        sixValidWeapons(), nineValidRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayersHaveDifferentCardsSize() {
    return new GameStartInfo(threePlayersHaveDifferentCardsSize(), sixValidCharacters(),
        sixValidWeapons(), nineValidRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerSixPlayers() {
    return new GameStartInfo(sixPlayersInvalidCardsPerPlayer(), sixValidCharacters(),
        sixValidWeapons(), nineValidRooms());
  }


  public static GameStartInfo invalidInfoTwoPlayers() {
    return new GameStartInfo(twoPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo invalidInfoFourPlayers() {
    return new GameStartInfo(fourPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo invalidInfoFivePlayers() {
    return new GameStartInfo(fivePlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

  public static GameStartInfo invalidInfoSevenPlayers() {
    return new GameStartInfo(sevenPlayers(), sixValidCharacters(), sixValidWeapons(),
        nineValidRooms());
  }

}
