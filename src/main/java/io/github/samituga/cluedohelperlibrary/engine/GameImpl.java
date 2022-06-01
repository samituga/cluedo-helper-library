package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardAlreadyHasOwnerException;
import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerMaxCardsException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.Solution;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import java.util.UUID;

/**
 * Implementation to the {@link Game} interface.
 */
class GameImpl implements Game {

    private final GameInfo gameInfo;
    private final Solution solution;
    private final GameActionHandler gameActionHandler;

    public GameImpl(final GameStartInfo gameStartInfo) {
        this.gameInfo = new GameInfo(gameStartInfo);
        this.solution =
            new Solution(BaseCard.UNKNOWN_CHARACTER, BaseCard.UNKNOWN_WEAPON,
                BaseCard.UNKNOWN_ROOM);

        this.gameActionHandler = new GameActionHandlerImpl(gameInfo);
    }

    /**
     * Getter for the solution.
     *
     * @return the solution
     */
    @Override
    public Solution solution() {
        return solution;
    }

    @Override
    public void addCardToPlayer(final UUID cardUuid, final UUID playerUuid)
          throws CardNotFoundException, CardAlreadyHasOwnerException, PlayerNotFoundException, PlayerMaxCardsException {
        gameActionHandler.addCardToPlayer(cardUuid, playerUuid);
    }

}
