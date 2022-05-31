package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when trying to give a card to a player that already has the maximum number
 * of cards.
 */
public class PlayerMaxCardsException extends CluedoBusinessException {

    private static final String PLAYER_MAX_CARDS_ERROR_MESSAGE
          = "Player already has maximum number of cards";

    public PlayerMaxCardsException() {
        super(PLAYER_MAX_CARDS_ERROR_MESSAGE);
    }

    public PlayerMaxCardsException(String message) {
        super(message);
    }
}
