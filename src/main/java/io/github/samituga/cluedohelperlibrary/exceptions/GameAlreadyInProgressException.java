package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when client attempts to start a new game when there is a game in progress.
 */
public class GameAlreadyInProgressException extends CluedoBusinessException {

    private static final String GAME_IN_PROGRESS_ERROR_MESSAGE
        = "There is already a game in progress, can't start a new one";

    public GameAlreadyInProgressException() {
        super(GAME_IN_PROGRESS_ERROR_MESSAGE);
    }

    public GameAlreadyInProgressException(String message) {
        super(message);
    }
}
