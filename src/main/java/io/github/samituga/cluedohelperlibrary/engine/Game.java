package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.Solution;
import java.util.UUID;

/**
 * Will serve as a engine for the cluedo helper library. <br>
 * This will serve as an interface of the library for every action.
 */
public interface Game {


    /**
     * Getter for the solution.
     *
     * @return the solution
     */
    Solution solution();

  void addCardToPlayer(UUID cardUuid, UUID playerUuid) throws CardNotFoundException;
}
