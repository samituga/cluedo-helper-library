package io.github.samituga.cluedohelperlibrary.engine;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.instanceOf;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameAlreadyInProgressException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameNotStartedException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.Solution;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.validator.GameStartInfoValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameTest {

    private GameStarter gameStarter;
    private GameStartInfoValidator mockGameStartInfoValidator;

    @BeforeEach
    void setUp() {
        mockGameStartInfoValidator = mock(GameStartInfoValidator.class);
        gameStarter = GameStarter.instance(mockGameStartInfoValidator);
    }

    @ParameterizedTest
    @MethodSource("io.github.samituga.cluedohelperlibrary.util.GameStartInfoProvider#validInfoThreePlayers")
    void verifyDoesNotThrowAnyExceptionWhenInfoIsValid(
        final GameStartInfo validInfoWithThreePlayers)
        throws PlayerValidationException, CardValidationException, GameAlreadyInProgressException,
        GameStartInfoNullException, GameNotStartedException {

        Game game = gameStarter.start(validInfoWithThreePlayers);

        verify(mockGameStartInfoValidator).validateGameStart(validInfoWithThreePlayers);
        assertThat(game.solution(), instanceOf(Solution.class));
    }

}