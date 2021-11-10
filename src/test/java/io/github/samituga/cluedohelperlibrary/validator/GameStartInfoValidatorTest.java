package io.github.samituga.cluedohelperlibrary.validator;

import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.DUPLICATE_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_CARDS_PER_PLAYER_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_NUMBER_OF_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_PLAY_ORDER;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.NO_PLAYERS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.util.GameStartInfoInitializer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameStartInfoValidatorTest {


  private GameStartInfo VALID_INFO_WITH_THREE_PLAYERS;
  private GameStartInfo VALID_INFO_WITH_SIX_PLAYERS;

  private GameStartInfo INVALID_INFO_WITH_DUPLICATE_PLAYERS;
  private GameStartInfo INVALID_INFO_WITH_NO_PLAYERS;

  private GameStartInfo INVALID_INFO_WITH_DUPLICATE_PLAY_ORDER;
  private GameStartInfo INVALID_INFO_WITH_WRONG_PLAY_ORDER;

  private GameStartInfo INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS;
  private GameStartInfo INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS_HAVE_DIFFERENT_CARDS_SIZE;
  private GameStartInfo INVALID_INFO_WITH_CARDS_PER_PLAYER_SIX_PLAYERS;

  private GameStartInfo INVALID_INFO_WITH_TWO_PLAYERS;
  private GameStartInfo INVALID_INFO_WITH_FOUR_PLAYERS;
  private GameStartInfo INVALID_INFO_WITH_FIVE_PLAYERS;
  private GameStartInfo INVALID_INFO_WITH_SEVEN_PLAYERS;


  @BeforeEach
  void setUp() {
    VALID_INFO_WITH_THREE_PLAYERS =
        GameStartInfoInitializer.validInfoThreePlayers();
    VALID_INFO_WITH_SIX_PLAYERS =
        GameStartInfoInitializer.validInfoSixPlayers();

    INVALID_INFO_WITH_DUPLICATE_PLAYERS =
        GameStartInfoInitializer.duplicatePlayers();
    INVALID_INFO_WITH_NO_PLAYERS =
        GameStartInfoInitializer.noPlayers();

    INVALID_INFO_WITH_DUPLICATE_PLAY_ORDER =
        GameStartInfoInitializer.playersWithDuplicatePlayOrder();
    INVALID_INFO_WITH_WRONG_PLAY_ORDER =
        GameStartInfoInitializer.playersWithWrongPlayOrderDuplicate();

    INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS =
        GameStartInfoInitializer.invalidCardsPerPlayerThreePlayers();
    INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS_HAVE_DIFFERENT_CARDS_SIZE =
        GameStartInfoInitializer.invalidCardsPerPlayerThreePlayersHaveDifferentCardsSize();
    INVALID_INFO_WITH_CARDS_PER_PLAYER_SIX_PLAYERS =
        GameStartInfoInitializer.invalidCardsPerPlayerSixPlayers();

    INVALID_INFO_WITH_TWO_PLAYERS =
        GameStartInfoInitializer.invalidInfoTwoPlayers();
    INVALID_INFO_WITH_FOUR_PLAYERS =
        GameStartInfoInitializer.invalidInfoFourPlayers();
    INVALID_INFO_WITH_FIVE_PLAYERS =
        GameStartInfoInitializer.invalidInfoFivePlayers();
    INVALID_INFO_WITH_SEVEN_PLAYERS =
        GameStartInfoInitializer.invalidInfoSevenPlayers();
  }


  @Test
  void verifyReturnsTrueWhenInfoIsValidWithThreePlayers() throws PlayerValidationException {

    final boolean result = GameStartInfoValidator.validateGameStart(VALID_INFO_WITH_THREE_PLAYERS);

    assertTrue(result);
  }

  @Test
  void verifyReturnsTrueWhenInfoIsValidWithSixPlayers() throws PlayerValidationException {

    final boolean result = GameStartInfoValidator.validateGameStart(VALID_INFO_WITH_SIX_PLAYERS);

    assertTrue(result);
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreDuplicatePlayers() {

    PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAYERS));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreInvalidNumberOfPlayers() {

    PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAYERS));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenProvidedInvalidPlayersSize() {

    PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_TWO_PLAYERS));

    PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_FOUR_PLAYERS));

    PlayerValidationException ex3 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_FIVE_PLAYERS));

    PlayerValidationException ex4 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_SEVEN_PLAYERS));

    assertThat(ex1.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex2.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex3.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex4.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreNoPlayers() {

    PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_NO_PLAYERS));

    assertThat(ex.getReason(), equalTo(NO_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenPlayOrderIsInvalid() {

    PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAY_ORDER));

    PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_WRONG_PLAY_ORDER));

    assertThat(ex1.getReason(), equalTo(INVALID_PLAY_ORDER));
    assertThat(ex2.getReason(), equalTo(INVALID_PLAY_ORDER));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenPlayersHaveWrongCardsSize() {

    PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS));

    PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(
            INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS_HAVE_DIFFERENT_CARDS_SIZE));

    PlayerValidationException ex3 = assertThrows(PlayerValidationException.class, () ->
        GameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_CARDS_PER_PLAYER_SIX_PLAYERS));

    assertThat(ex1.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
    assertThat(ex2.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
    assertThat(ex3.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
  }
}