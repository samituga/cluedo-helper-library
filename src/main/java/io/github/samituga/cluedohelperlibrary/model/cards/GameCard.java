package io.github.samituga.cluedohelperlibrary.model.cards;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Represent the card that a player holds or a solution card. <br>
 * This is necessary because player and solution cards will be unknown,
 * so we need a wrapper on the {@link BaseCard}.
 */
@Data
@AllArgsConstructor
public class GameCard {

    // TODO: 18/11/2021 Do we really need this class?

    private BaseCard baseCard;
}
