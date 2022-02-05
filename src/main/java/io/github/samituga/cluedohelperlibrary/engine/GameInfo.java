package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Model object that stores the game information.
 */
public class GameInfo { // TODO: 2022-02-03 tests

    private final List<Player> players;
    private final List<Character> characters;
    private final List<Weapon> weapons;
    private final List<Room> rooms;

    public GameInfo(final List<Player> players,
                    final List<Character> characters,
                    final List<Weapon> weapons,
                    final List<Room> rooms) {

        this.players = new ArrayList<>(players);
        this.characters = new ArrayList<>(characters);
        this.weapons = new ArrayList<>(weapons);
        this.rooms = new ArrayList<>(rooms);
    }

    public GameInfo(final GameStartInfo gameStartInfo) {

        this.players = new ArrayList<>(gameStartInfo.players());
        this.characters = new ArrayList<>(gameStartInfo.characters());
        this.weapons = new ArrayList<>(gameStartInfo.weapons());
        this.rooms = new ArrayList<>(gameStartInfo.rooms());
    }

    public Player player(final UUID uuid) throws CardNotFoundException {
        return players.stream()
            .filter(e -> Objects.equals(e.uuid(), uuid))
            .findFirst()
            .orElseThrow(CardNotFoundException::new);
    }

    public List<Player> players() {
        return new ArrayList<>(players);
    }

    public Character character(final UUID uuid) throws CardNotFoundException {
        return getCardWithUuid(characters, uuid);
    }

    public List<Character> characters() {
        return new ArrayList<>(characters);
    }

    public Weapon weapon(final UUID uuid) throws CardNotFoundException {
        return getCardWithUuid(weapons, uuid);
    }

    public List<Weapon> weapons() {
        return new ArrayList<>(weapons);
    }

    public Room room(final UUID uuid) throws CardNotFoundException {
        return getCardWithUuid(rooms, uuid);
    }

    public List<Room> rooms() {
        return new ArrayList<>(rooms);
    }

    private <T extends BaseCard> T getCardWithUuid(final List<T> cards, final UUID uuid)
        throws CardNotFoundException {
        return cards.stream()
            .filter(e -> Objects.equals(e.uuid(), uuid))
            .findFirst()
            .orElseThrow(CardNotFoundException::new);
    }
}
