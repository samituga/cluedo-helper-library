package io.github.samituga.cluedohelperlibrary.validator;

import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.CHARACTERS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.DUPLICATE_CARDS;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.ROOMS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.WEAPONS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.DUPLICATE_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_CARDS_PER_PLAYER_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_NUMBER_OF_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_PLAY_ORDER;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.NO_PLAYERS;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.util.GameStartInfoInitializer;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameStartInfoValidatorTest {

  private static GameStartInfoValidator gameStartInfoValidator;

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


  private GameStartInfo INVALID_INFO_WITH_WRONG_CHARACTERS_SIZE;
  private GameStartInfo INVALID_INFO_WITH_WRONG_WEAPONS_SIZE;
  private GameStartInfo INVALID_INFO_WITH_WRONG_ROOMS_SIZE;

  private GameStartInfo INVALID_INFO_WITH_DUPLICATE_CARDS;

  @BeforeAll
  static void beforeAll() {
    gameStartInfoValidator = new GameStartInfoValidatorImpl();
  }

  @BeforeEach
  void setUp() {
    VALID_INFO_WITH_THREE_PLAYERS =
        GameStartInfoInitializer.validInfoThreePlayers();
    VALID_INFO_WITH_SIX_PLAYERS =
        GameStartInfoInitializer.validInfoSixPlayers();

    INVALID_INFO_WITH_DUPLICATE_PLAYERS =
        GameStartInfoInitializer.invalidDuplicatePlayers();
    INVALID_INFO_WITH_NO_PLAYERS =
        GameStartInfoInitializer.invalidNoPlayers();

    INVALID_INFO_WITH_DUPLICATE_PLAY_ORDER =
        GameStartInfoInitializer.invalidPlayersWithDuplicatePlayOrder();
    INVALID_INFO_WITH_WRONG_PLAY_ORDER =
        GameStartInfoInitializer.invalidPlayersWithWrongPlayOrderDuplicate();

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


    INVALID_INFO_WITH_WRONG_CHARACTERS_SIZE =
        GameStartInfoInitializer.invalidNumberOfCharacters();
    INVALID_INFO_WITH_WRONG_WEAPONS_SIZE =
        GameStartInfoInitializer.invalidNumberOfWeapons();
    INVALID_INFO_WITH_WRONG_ROOMS_SIZE =
        GameStartInfoInitializer.invalidNumberOfRooms();

    INVALID_INFO_WITH_DUPLICATE_CARDS =
        GameStartInfoInitializer.invalidDuplicateCards();
  }


  @Test
  void verifyReturnsTrueWhenInfoIsValidWithThreePlayers()
      throws PlayerValidationException, CardValidationException {

    final boolean result = gameStartInfoValidator.validateGameStart(VALID_INFO_WITH_THREE_PLAYERS);

    assertTrue(result);
  }

  @Test
  void verifyReturnsTrueWhenInfoIsValidWithSixPlayers()
      throws PlayerValidationException, CardValidationException {

    final boolean result = gameStartInfoValidator.validateGameStart(VALID_INFO_WITH_SIX_PLAYERS);

    assertTrue(result);
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreDuplicatePlayers() {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAYERS));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreInvalidNumberOfPlayers() {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAYERS));

    assertThat(ex.getReason(), equalTo(DUPLICATE_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenProvidedInvalidPlayersSize() {

    final PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_TWO_PLAYERS));

    final PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_FOUR_PLAYERS));

    final PlayerValidationException ex3 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_FIVE_PLAYERS));

    final PlayerValidationException ex4 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_SEVEN_PLAYERS));

    assertThat(ex1.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex2.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex3.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
    assertThat(ex4.getReason(), equalTo(INVALID_NUMBER_OF_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenThereAreNoPlayers() {

    final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_NO_PLAYERS));

    assertThat(ex.getReason(), equalTo(NO_PLAYERS));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenPlayOrderIsInvalid() {

    final PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_PLAY_ORDER));

    final PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_WRONG_PLAY_ORDER));

    assertThat(ex1.getReason(), equalTo(INVALID_PLAY_ORDER));
    assertThat(ex2.getReason(), equalTo(INVALID_PLAY_ORDER));
  }

  @Test
  void verifyThrowsPlayerValidationExceptionWhenPlayersHaveWrongCardsSize() {

    final PlayerValidationException ex1 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS));

    final PlayerValidationException ex2 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(
            INVALID_INFO_WITH_CARDS_PER_PLAYER_THREE_PLAYERS_HAVE_DIFFERENT_CARDS_SIZE));

    final PlayerValidationException ex3 = assertThrows(PlayerValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_CARDS_PER_PLAYER_SIX_PLAYERS));

    assertThat(ex1.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
    assertThat(ex2.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
    assertThat(ex3.getReason(), equalTo(INVALID_CARDS_PER_PLAYER_SIZE));
  }


  @Test
  void verifyThrowsCardValidationExceptionWhenWrongSizeOfCharacters() {

    final CardValidationException ex1 = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_WRONG_CHARACTERS_SIZE));

    final CardValidationException ex2 = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_WRONG_WEAPONS_SIZE));

    final CardValidationException ex3 = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_WRONG_ROOMS_SIZE));

    assertThat(ex1.getReason(), equalTo(CHARACTERS_SIZE));
    assertThat(ex2.getReason(), equalTo(WEAPONS_SIZE));
    assertThat(ex3.getReason(), equalTo(ROOMS_SIZE));
  }

  @Test
  void verifyThrowsCardValidationExceptionWhenThereAreDuplicateCards() {
    final CardValidationException ex = assertThrows(CardValidationException.class, () ->
        gameStartInfoValidator.validateGameStart(INVALID_INFO_WITH_DUPLICATE_CARDS));

    assertThat(ex.getReason(), equalTo(DUPLICATE_CARDS));
  }
}
