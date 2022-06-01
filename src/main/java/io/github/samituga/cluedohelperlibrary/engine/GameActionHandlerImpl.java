package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardAlreadyHasOwnerException;
import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerMaxCardsException;
import io.github.samituga.cluedohelperlibrary.exceptions.PlayerNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.util.Util;
import java.util.Objects;
import java.util.UUID;

/**
 * Implementation to the {@link GameActionHandler} interface.
 */
public class GameActionHandlerImpl implements GameActionHandler {


    private final GameInfo gameInfo;

    public GameActionHandlerImpl(final GameInfo gameInfo) {
        this.gameInfo = gameInfo;
    }

    // TODO: 2022-05-31 Tests
    @Override
    public void addCardToPlayer(final UUID cardUuid, final UUID playerUuid)
          throws CardNotFoundException, CardAlreadyHasOwnerException, PlayerNotFoundException, PlayerMaxCardsException {

        final BaseCard card = Util.getOrElseNull(gameInfo.allCards(),
              e -> Objects.equals(e.uuid(), cardUuid));
        if (card == null) {
            throw new CardNotFoundException();
        }

        final Player player = gameInfo.player(playerUuid);
        if (player == null) {
            throw new PlayerNotFoundException();
        }

        for (Player p : gameInfo.players()) {
            BaseCard c = Util.getOrElseNull(p.cards(), e -> e.uuid().equals(cardUuid));
            if (c != null) {
                throw new CardAlreadyHasOwnerException();
            }
        }

        if (player.cards().size() > gameInfo.getCardsPerPlayer()) {
            throw new PlayerMaxCardsException();
        }

        // TODO: 2022-05-31 Check if the player has 0% chance of owning this car
        // TODO: 2022-05-31 Check if it is the solution card

        player.cards().add(card);
    }
}
