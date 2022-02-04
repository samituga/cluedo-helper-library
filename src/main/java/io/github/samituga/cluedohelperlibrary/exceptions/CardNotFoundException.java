package io.github.samituga.cluedohelperlibrary.exceptions;

/**
 * Exception is thrown when trying to get a card with the wrong UUID.
 */
public class CardNotFoundException extends CluedoBusinessException {

    private static final String CARD_NOT_FOUND_ERROR_MESSAGE = "Card not found";

    public CardNotFoundException() {
        super(CARD_NOT_FOUND_ERROR_MESSAGE);
    }

    public CardNotFoundException(final String message) {
        super(message);
    }

}
