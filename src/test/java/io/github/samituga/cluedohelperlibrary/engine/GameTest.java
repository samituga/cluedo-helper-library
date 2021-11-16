package io.github.samituga.cluedohelperlibrary.engine;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameAlreadyInProgressException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.validator.GameStartInfoValidator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameTest {


  private static Game game;
  private static GameStartInfoValidator mockGameStartInfoValidator;

  @BeforeAll
  static void beforeAll() {
    mockGameStartInfoValidator = mock(GameStartInfoValidator.class);
    game = new GameImpl(mockGameStartInfoValidator);
  }


  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#validInfoThreePlayers")
  void verifyDoesNotThrowAnyExceptionWhenInfoIsValid(
      final GameStartInfo validInfoWithThreePlayers)
      throws PlayerValidationException, CardValidationException, GameAlreadyInProgressException,
      GameStartInfoNullException {

    game.start(validInfoWithThreePlayers);

    verify(mockGameStartInfoValidator).validateGameStart(validInfoWithThreePlayers);
  }

  @ParameterizedTest
  @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#validInfoThreePlayers")
  void verifyThrowsGameAlreadyInProgressExceptionWhenThereIsAGameInProgress(
      final GameStartInfo validInfoWithThreePlayers)
      throws PlayerValidationException, CardValidationException, GameAlreadyInProgressException,
      GameStartInfoNullException {

    game.start(validInfoWithThreePlayers);
    verify(mockGameStartInfoValidator).validateGameStart(validInfoWithThreePlayers);
    GameAlreadyInProgressException ex = assertThrows(GameAlreadyInProgressException.class, () ->
        game.start(validInfoWithThreePlayers));
  }

}