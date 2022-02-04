package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when client tries to start a game with a null
 * {@link io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo GameStartInfo}.
 */
public class GameStartInfoNullException extends CluedoBusinessException {

    private static final String GAME_START_INFO_NULL_ERROR_MESSAGE
        = "No information to start the game was provided";

    public GameStartInfoNullException() {
        super(GAME_START_INFO_NULL_ERROR_MESSAGE);
    }

    public GameStartInfoNullException(String message) {
        super(message);
    }

}
