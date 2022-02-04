package io.github.samituga.cluedohelperlibrary.validator;

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
    @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#playersFailures")
    void verifyThrowsExpectedPlayerValidationExceptionForPlayerFailures(
        final GameStartInfo invalidPlayersWithCards,
        final PlayerValidationException.Reason expectedReason) {

        final PlayerValidationException ex = assertThrows(PlayerValidationException.class, () ->
            gameStartInfoValidator.validateGameStart(invalidPlayersWithCards));

        assertThat(ex.getReason(), equalTo(expectedReason));
    }

    @ParameterizedTest
    @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#cardValidationFailures")
    void verifyThrowsExpectedCardValidationExceptionForCardFailures(
        final GameStartInfo duplicatedCards,
        final CardValidationException.Reason expectedReason) {
        final CardValidationException ex = assertThrows(CardValidationException.class, () ->
            gameStartInfoValidator.validateGameStart(duplicatedCards));

        assertThat(ex.getReason(), equalTo(expectedReason));
    }

    @Test
    void verifyThrowsGameStartInfoExceptionWhenNoGameStartInfoProvided() {

        final GameStartInfoNullException ex = assertThrows(GameStartInfoNullException.class, () ->
            gameStartInfoValidator.validateGameStart(null));
    }
}
