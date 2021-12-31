package io.github.samituga.cluedohelperlibrary.util;

import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.DUPLICATE_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_NUMBER_OF_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_PLAY_ORDER;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.NO_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.PLAYER_CONTAINS_CARDS;
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

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;
import org.junit.jupiter.params.provider.Arguments;

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


  static Stream<Arguments> playersFailures() {

    GameStartInfo duplicatePlayers = new GameStartInfo(
        invalidThreePlayersWithDuplicates(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());

    GameStartInfo noPlayers = new GameStartInfo(
        invalidEmptyListOfPlayers(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());

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

    GameStartInfo threePlayersThreeCards = new GameStartInfo(
        invalidThreePlayersWithCards(),
        validSixCharacters(),
        validSixWeapons(),
        validNineRooms());

    return Stream.of(
        Arguments.of(duplicatePlayers, DUPLICATE_PLAYERS),
        Arguments.of(noPlayers, NO_PLAYERS),
        Arguments.of(invalidPlayOrder, INVALID_PLAY_ORDER),
        Arguments.of(duplicatePlayOrder, INVALID_PLAY_ORDER),
        Arguments.of(twoPlayers, INVALID_NUMBER_OF_PLAYERS),
        Arguments.of(fourPlayers, INVALID_NUMBER_OF_PLAYERS),
        Arguments.of(fivePlayers, INVALID_NUMBER_OF_PLAYERS),
        Arguments.of(sevenPlayers, INVALID_NUMBER_OF_PLAYERS),
        Arguments.of(threePlayersThreeCards, PLAYER_CONTAINS_CARDS));
  }


  static Stream<Arguments> cardValidationFailures() {

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

    GameStartInfo duplicatedCards = new GameStartInfo(
        validSixPlayers(),
        invalidSixCharactersWithMockName(),
        invalidSixWeaponsWithMockName(),
        invalidNineRoomsWithMockName());

    return Stream.of(
        Arguments.of(fourCharacters, CardValidationException.Reason.CHARACTERS_SIZE),
        Arguments.of(fiveCharacters, CardValidationException.Reason.CHARACTERS_SIZE),
        Arguments.of(sevenCharacters, CardValidationException.Reason.CHARACTERS_SIZE),
        Arguments.of(fourWeapons, CardValidationException.Reason.WEAPONS_SIZE),
        Arguments.of(fiveWeapons, CardValidationException.Reason.WEAPONS_SIZE),
        Arguments.of(sevenWeapons, CardValidationException.Reason.WEAPONS_SIZE),
        Arguments.of(sevenRooms, CardValidationException.Reason.ROOMS_SIZE),
        Arguments.of(eightRooms, CardValidationException.Reason.ROOMS_SIZE),
        Arguments.of(tenRooms, CardValidationException.Reason.ROOMS_SIZE),
        Arguments.of(duplicatedCards, CardValidationException.Reason.DUPLICATE_CARDS));
  }
}
