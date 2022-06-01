package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardAlreadyHasOwnerException;
import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerMaxCardsException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.Solution;
import java.util.UUID;

/**
 * Will serve as an engine for the cluedo helper library. <br>
 * This will serve as an interface of the library for every action.
 */
public interface Game {


    /**
     * Getter for the solution.
     *
     * @return the solution
     */
    Solution solution();

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
