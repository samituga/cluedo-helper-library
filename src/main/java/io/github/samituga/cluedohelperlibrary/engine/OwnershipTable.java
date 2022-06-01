package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.model.game.PlayerCardMapper;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

// TODO: 06/02/2022 name
public class OwnershipTable {

    private final List<PlayerCardMapper> playerCardMapperList;

    public OwnershipTable(final List<PlayerCardMapper> playerCardMapperList) {
        this.playerCardMapperList = new ArrayList<>(playerCardMapperList);
    }

    private List<PlayerCardMapper> byPlayer(final UUID playerUuid) {
        return playerCardMapperList.stream()
            .filter(e -> Objects.equals(e.player().uuid(), playerUuid))
            .collect(Collectors.toList());
    }

    private List<PlayerCardMapper> byCard(final UUID cardUuid) {
        return playerCardMapperList.stream()
            .filter(e -> Objects.equals(e.card().uuid(), cardUuid))
            .collect(Collectors.toList());
    }

    private PlayerCardMapper byPlayerCardCombination(final UUID playerUuid, final UUID cardUuid) {
        return playerCardMapperList.stream()
            .filter(e -> Objects.equals(e.card().uuid(), cardUuid)
                && Objects.equals(e.player().uuid(), playerUuid))
            .findFirst()
            .orElseThrow(RuntimeException::new); // TODO: 06/02/2022 Exception for this
    }
}
