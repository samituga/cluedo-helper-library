package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardAlreadyHasOwnerException;
import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerMaxCardsException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerNotFoundException;
import java.util.UUID;

/**
 * Handler for the game actions.
 */
public interface GameActionHandler {


    /**
     * Adds a card to a player.
     *
     * @param cardUuid   the card identifier.
     * @param playerUuid the player identifier.
     * @throws CardNotFoundException        when there is no card for the cardUuid
     * @throws CardAlreadyHasOwnerException when the card is already owned by a player
     * @throws PlayerNotFoundException      when there is no player for the playerUuid
     * @throws PlayerMaxCardsException      when the player already has the maximum number of cards allowed
     */
    void addCardToPlayer(UUID cardUuid, UUID playerUuid)
          throws CardNotFoundException, CardAlreadyHasOwnerException,
          PlayerNotFoundException, PlayerMaxCardsException;
}
