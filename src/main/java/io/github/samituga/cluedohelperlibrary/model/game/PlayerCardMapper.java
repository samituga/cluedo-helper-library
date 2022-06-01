package io.github.samituga.cluedohelperlibrary.model.game;

import io.github.samituga.cluedohelperlibrary.engine.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.Objects;

// TODO: 06/02/2022 Better name
public record PlayerCardMapper(Player player, BaseCard card, int probability) {

    public PlayerCardMapper {
        Objects.requireNonNull(player); // TODO: 06/02/2022 Message
        Objects.requireNonNull(card); // TODO: 06/02/2022 Message
    }
}
