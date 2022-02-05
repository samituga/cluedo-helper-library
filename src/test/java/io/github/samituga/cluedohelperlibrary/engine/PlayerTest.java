package io.github.samituga.cluedohelperlibrary.engine;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;

import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void verifyPlayerCardsListIsImmutable() {

        String name = "p1";
        List<BaseCard> cards =
            new ArrayList<>(List.of(BaseCard.UNKNOWN, BaseCard.UNKNOWN, BaseCard.UNKNOWN));
        Integer playOrder = 1;
        Player player = new PlayerImpl(UUID.randomUUID(), name, cards, playOrder);

        List<BaseCard> result = player.cards();
        result.add(BaseCard.UNKNOWN);

        assertThat(cards.size(), not(result.size()));
    }
}
