package io.github.samituga.cluedohelperlibrary.util;

import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validNineRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validSixCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validSixWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidEmptyListOfPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidFivePlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidFourPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoPlayOrderDuplicated;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoWrongPlayOrder;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidSevenPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidSixPlayersCardsPerPlayer;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.validSixPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersDifferentCardsSize;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersCardsPerPlayer;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersWithDuplicates;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.validThreePlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidTwoPlayers;

import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameStartInfoInitializer {


  public static GameStartInfo validInfoThreePlayers() {
    return new GameStartInfo(validThreePlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo validInfoSixPlayers() {
    return new GameStartInfo(validSixPlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidDuplicatePlayers() {
    return new GameStartInfo(invalidThreePlayersWithDuplicates(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidNoPlayers() {
    return new GameStartInfo(invalidEmptyListOfPlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidPlayersWithDuplicatePlayOrder() {
    return new GameStartInfo(invalidInfoPlayOrderDuplicated(), validSixCharacters(),
        validSixWeapons(), validNineRooms());
  }

  public static GameStartInfo invalidPlayersWithWrongPlayOrderDuplicate() {
    return new GameStartInfo(invalidInfoWrongPlayOrder(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayers() {
    return new GameStartInfo(invalidThreePlayersCardsPerPlayer(), validSixCharacters(),
        validSixWeapons(), validNineRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerThreePlayersHaveDifferentCardsSize() {
    return new GameStartInfo(invalidThreePlayersDifferentCardsSize(), validSixCharacters(),
        validSixWeapons(), validNineRooms());
  }

  public static GameStartInfo invalidCardsPerPlayerSixPlayers() {
    return new GameStartInfo(invalidSixPlayersCardsPerPlayer(), validSixCharacters(),
        validSixWeapons(), validNineRooms());
  }


  public static GameStartInfo invalidInfoTwoPlayers() {
    return new GameStartInfo(invalidTwoPlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidInfoFourPlayers() {
    return new GameStartInfo(invalidFourPlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidInfoFivePlayers() {
    return new GameStartInfo(invalidFivePlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

  public static GameStartInfo invalidInfoSevenPlayers() {
    return new GameStartInfo(invalidSevenPlayers(), validSixCharacters(), validSixWeapons(),
        validNineRooms());
  }

}
