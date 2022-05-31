package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when trying to get a player with the wrong UUID.
 */
public class PlayerNotFoundException extends CluedoBusinessException {

    private static final String PLAYER_NOT_FOUND_ERROR_MESSAGE = "Player not found";

    public PlayerNotFoundException() {
        super(PLAYER_NOT_FOUND_ERROR_MESSAGE);
    }

    public PlayerNotFoundException(final String message) {
        super(message);
    }
}
