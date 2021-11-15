package io.github.samituga.cluedohelperlibrary.util;

import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidEightRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFiveCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFiveWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidNineRoomsWithMockName;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSixCharactersWithMockName;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSixWeaponsWithMockName;
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
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersCardsPerPlayer;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersDifferentCardsSize;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersWithDuplicates;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidTwoPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.validSixPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.validThreePlayers;

import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import lombok.experimental.UtilityClass;

@UtilityClass
public class GameStartInfoProvider {

  static GameStartInfo[] validInfoThreePlayers() {
    GameStartInfo value = new GameStartInfo(
        validThreePlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] validInfoSixPlayers() {
    GameStartInfo value = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidDuplicatePlayers() {
    GameStartInfo value = new GameStartInfo(
        invalidThreePlayersWithDuplicates(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidNoPlayers() {
    GameStartInfo value = new GameStartInfo(
        invalidEmptyListOfPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidPlayersWithInvalidPlayOrder() {
    GameStartInfo invalidPlayOrder = new GameStartInfo(
        invalidInfoPlayOrderDuplicated(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo duplicatePlayOrder = new GameStartInfo(
        invalidInfoWrongPlayOrder(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {
        invalidPlayOrder,
        duplicatePlayOrder};
  }

  static GameStartInfo[] invalidCardsPerPlayerThreePlayers() {
    GameStartInfo threePlayersThreeCards = new GameStartInfo(
        invalidThreePlayersCardsPerPlayer(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo threePlayersDifferentCardsSize = new GameStartInfo(
        invalidThreePlayersDifferentCardsSize(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo sixPlayersSixCards = new GameStartInfo(
        invalidSixPlayersCardsPerPlayer(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {
        threePlayersThreeCards,
        threePlayersDifferentCardsSize,
        sixPlayersSixCards};
  }


  static GameStartInfo[] invalidNumberOfPlayers() {
    GameStartInfo twoPlayers = new GameStartInfo(
        invalidTwoPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo fourPlayers = new GameStartInfo(
        invalidFourPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo fivePlayers = new GameStartInfo(
        invalidFivePlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo sevenPlayers = new GameStartInfo(
        invalidSevenPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {
        twoPlayers,
        fourPlayers,
        fivePlayers,
        sevenPlayers};
  }

  static GameStartInfo[] invalidNumberOfCharacters() {
    GameStartInfo value = new GameStartInfo(
        validSixPlayers(),
        invalidFiveCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidNumberOfWeapons() {
    GameStartInfo value = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        invalidFiveWeapons(),
        validNineRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidNumberOfRooms() {
    GameStartInfo value = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        invalidEightRooms());
    return new GameStartInfo[] {value};
  }

  static GameStartInfo[] invalidDuplicateCards() {
    GameStartInfo value = new GameStartInfo(
        validSixPlayers(),
        invalidSixCharactersWithMockName(),
        invalidSixWeaponsWithMockName(),
        invalidNineRoomsWithMockName());
    return new GameStartInfo[] {value};
  }
}
