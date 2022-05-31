package io.github.samituga.cluedohelperlibrary.exceptions;
/**
 * Exception is thrown when trying to give a card that already has an owner.
 */
public class CardAlreadyHasOwnerException extends CluedoBusinessException {


    private static final String CARD_ALREADY_HAS_OWNER_ERROR_MESSAGE = "The card already has an owner";

    public CardAlreadyHasOwnerException() {
        super(CARD_ALREADY_HAS_OWNER_ERROR_MESSAGE);
    }

    public CardAlreadyHasOwnerException(final String message) {
        super(message);
    }

}
