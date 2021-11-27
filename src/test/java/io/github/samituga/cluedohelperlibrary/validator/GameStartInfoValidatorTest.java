package io.github.samituga.cluedohelperlibrary.validator;

import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.CHARACTERS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.DUPLICATE_CARDS;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.ROOMS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.WEAPONS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.DUPLICATE_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.PLAYER_CONTAINS_CARDS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_NUMBER_OF_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_PLAY_ORDER;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.NO_PLAYERS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameStartInfoValidatorTest {

  private static GameStartInfoValidator gameStartInfoValidator;

  @BeforeAll
  static void beforeAll() {
    gameStartInfoValidator = new GameStartInfoValidatorImpl();
  }


  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#validInfoThreePlayers")
  void verifyReturnsTrueWhenInfoIsValidWithThreePlayers(
      final GameStartInfo validInfoWithThreePlayers)
      throws PlayerValidationException, CardValidationException, GameStartInfoNullException {

    final boolean result = gameStartInfoValidator.validateGameStart(validInfoWithThreePlayers);

    assertTrue(result);
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#validInfoSixPlayers")
  void verifyReturnsTrueWhenInfoIsValidWithSixPlayers(
      final GameStartInfo validInfoWithSixPlayers)
      throws PlayerValidationException, CardValidationException, GameStartInfoNullException {

    final boolean result = gameStartInfoValidator.validateGameStart(validInfoWithSixPlayers);

    assertTrue(result);
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidDuplicatePlayers")
  void verifyThrowsPlayerValidationExceptionWhenThereAreDuplicatePlayers(
      final GameStartInfo invalidInfoWithDuplicatePlayers) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidInfoWithDuplicatePlayers));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidDuplicatePlayers")
  void verifyThrowsPlayerValidationExceptionWhenThereAreInvalidNumberOfPlayers(
      final GameStartInfo invalidInfoWithDuplicatePlayers) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidInfoWithDuplicatePlayers));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidNumberOfPlayers")
  void verifyThrowsPlayerValidationExceptionWhenProvidedInvalidPlayersSize(
      final GameStartInfo invalidNumberOfPlayers) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidNumberOfPlayers));

    assertThat(ex.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidNoPlayers")
  void verifyThrowsPlayerValidationExceptionWhenThereAreNoPlayers(
      final GameStartInfo invalidInfoWithNoPlayers) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidInfoWithNoPlayers));

    assertThat(ex.getReason(), equalTo(NO_PLAYERS));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidPlayersWithInvalidPlayOrder")
  void verifyThrowsPlayerValidationExceptionWhenPlayOrderIsInvalid(
      final GameStartInfo invalidPlayOrder) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidPlayOrder));

    assertThat(ex.getReason(), equalTo(INVALID_PLAY_ORDER));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidPlayersWithCards")
  void verifyThrowsPlayerValidationExceptionWhenPlayersHaveWrongCardsSize(
      final GameStartInfo invalidPlayersWithCards) {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(invalidPlayersWithCards));

    assertThat(ex.getReason(), equalTo(PLAYER_CONTAINS_CARDS));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidNumberOfCharacters")
  void verifyThrowsCardValidationExceptionWhenWrongSizeOfCharacters(
      final GameStartInfo wrongCharactersSize) {

    final CardValidationException ex = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(wrongCharactersSize));

    assertThat(ex.getReason(), equalTo(CHARACTERS_SIZE));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidNumberOfWeapons")
  void verifyThrowsCardValidationExceptionWhenWrongSizeOfWeapons(
      final GameStartInfo wrongWeaponsSize) {

    final CardValidationException ex = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(wrongWeaponsSize));

    assertThat(ex.getReason(), equalTo(WEAPONS_SIZE));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidNumberOfRooms")
  void verifyThrowsCardValidationExceptionWhenWrongSizeOfRooms(
      final GameStartInfo wrongCharactersRooms) {

    final CardValidationException ex = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(wrongCharactersRooms));

    assertThat(ex.getReason(), equalTo(ROOMS_SIZE));
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#invalidDuplicateCards")
  void verifyThrowsCardValidationExceptionWhenThereAreDuplicateCards(
      final GameStartInfo duplicatedCards) {
    final CardValidationException ex = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(duplicatedCards));

    assertThat(ex.getReason(), equalTo(DUPLICATE_CARDS));
  }

  @Test
  void verifyThrowsGameStartInfoExceptionWhenNoGameStartInfoProvided() {

    final GameStartInfoNullException ex = assertThrows(GameStartInfoNullException.class, () ->
        gameStartInfoValidator.validateGameStart(null));
  }
}
