package io.github.samituga.cluedohelperlibrary.util;

import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidEightRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFiveCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFiveWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFourCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidFourWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidNineRoomsWithMockName;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSevenCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSevenRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSevenWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSixCharactersWithMockName;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidSixWeaponsWithMockName;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.invalidTenRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validNineRooms;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validSixCharacters;
import static io.github.samituga.cluedohelperlibrary.util.GameStartCardInfoInitializer.validSixWeapons;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidEmptyListOfPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidFivePlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidFourPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoPlayOrderDuplicated;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidInfoWrongPlayOrder;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidSevenPlayers;
import static io.github.samituga.cluedohelperlibrary.util.GameStartPlayerInfoInitializer.invalidThreePlayersWithCards;
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

  static GameStartInfo[] invalidPlayersWithCards() {
    GameStartInfo threePlayersThreeCards = new GameStartInfo(
        invalidThreePlayersWithCards(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {threePlayersThreeCards};
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
    GameStartInfo fourCharacters = new GameStartInfo(
        validSixPlayers(),
        invalidFourCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo fiveCharacters = new GameStartInfo(
        validSixPlayers(),
        invalidFiveCharacters(),
        validSixWeapons(),
        validNineRooms());
    GameStartInfo sevenCharacters = new GameStartInfo(
        validSixPlayers(),
        invalidSevenCharacters(),
        validSixWeapons(),
        validNineRooms());
    return new GameStartInfo[] {fourCharacters, fiveCharacters, sevenCharacters};
  }

  static GameStartInfo[] invalidNumberOfWeapons() {
    GameStartInfo fourWeapons = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        invalidFourWeapons(),
        validNineRooms());
    GameStartInfo fiveWeapons = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        invalidFiveWeapons(),
        validNineRooms());
    GameStartInfo sevenWeapons = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        invalidSevenWeapons(),
        validNineRooms());
    return new GameStartInfo[] {fourWeapons, fiveWeapons, sevenWeapons};
  }

  static GameStartInfo[] invalidNumberOfRooms() {
    GameStartInfo sevenRooms = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        invalidSevenRooms());
    GameStartInfo eightRooms = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        invalidEightRooms());
    GameStartInfo tenRooms = new GameStartInfo(
        validSixPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        invalidTenRooms());
    return new GameStartInfo[] {sevenRooms, eightRooms, tenRooms};
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
