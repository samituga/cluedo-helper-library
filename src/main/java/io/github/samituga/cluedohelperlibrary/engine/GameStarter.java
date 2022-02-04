package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.exceptions.GameStartInfoNullException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.validator.GameStartInfoValidator;
import io.github.samituga.cluedohelperlibrary.validator.GameStartInfoValidatorImpl;
import java.util.Objects;

/**
 * Class used to start the {@link Game} object.
 */

public final class GameStarter {

    private static GameStarter instance;
    private final GameStartInfoValidator gameStartInfoValidator;

    private GameStarter(final GameStartInfoValidator gameStartInfoValidator) {
        this.gameStartInfoValidator = gameStartInfoValidator;
    }

    /**
     * If the instance is null it will create a new one with the provided
     * {@code gameStartInfoValidator}, and returns the static instance.
     *
     * @param gameStartInfoValidator the gameStartInfoValidator
     * @return the static {@code instance}
     * @throws NullPointerException if the {@code gameStartInfoValidator} is null
     */
    public static GameStarter instance(final GameStartInfoValidator gameStartInfoValidator) {
        if (instance == null) {
            Objects.requireNonNull(gameStartInfoValidator);
            instance = new GameStarter(gameStartInfoValidator);
        }
        return instance;
    }

    /**
     * If the instance is null it will create a new one with the {@link GameStartInfoValidatorImpl},
     * and returns the static instance.
     *
     * @return the static {@code instance}
     */
    public static GameStarter instance() {
        if (instance == null) {
            instance = new GameStarter(new GameStartInfoValidatorImpl());
        }
        return instance;
    }

    /**
     * Initiates a new {@link Game} instance.
     *
     * @param gameStartInfo All the information relative to the game
     * @return a new {@link GameImpl}
     * @throws CardValidationException    if there is a card validation failure
     * @throws PlayerValidationException  if there is a player validation failure
     * @throws GameStartInfoNullException if {@code gameStartInfo} is null
     */
    public Game start(final GameStartInfo gameStartInfo)
        throws CardValidationException, PlayerValidationException, GameStartInfoNullException {

        gameStartInfoValidator.validateGameStart(gameStartInfo);
        return new GameImpl(gameStartInfo);
    }
}
