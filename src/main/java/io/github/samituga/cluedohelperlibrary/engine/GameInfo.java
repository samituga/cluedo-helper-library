package io.github.samituga.cluedohelperlibrary.engine;

import io.github.samituga.cluedohelperlibrary.exceptions.CardNotFoundException;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.util.Copier;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Model object that stores the game information.
 */
public class GameInfo { // TODO: 2022-02-03 tests

    private final List<Character> characters;
    private final List<Weapon> weapons;
    private final List<Room> rooms;

    public GameInfo(final List<Character> characters,
                    final List<Weapon> weapons,
                    final List<Room> rooms) {
        this.characters = Copier.characters(characters);
        this.weapons = Copier.weapons(weapons);
        this.rooms = Copier.rooms(rooms);
    }

    public GameInfo(final GameStartInfo gameStartInfo) {
        this.characters = Copier.characters(gameStartInfo.characters());
        this.weapons = Copier.weapons(gameStartInfo.weapons());
        this.rooms = Copier.rooms(gameStartInfo.rooms());
    }

    public Character character(final String uuid) throws CardNotFoundException {
        return character(UUID.fromString(uuid));
    }

    public Character character(final UUID uuid) throws CardNotFoundException {
        return Copier.character(getCardWithUuid(characters, uuid));
    }

    public List<Character> characters() {
        return Copier.characters(characters);
    }

    public Weapon weapon(final String uuid) throws CardNotFoundException {
        return weapon(UUID.fromString(uuid));
    }

    public Weapon weapon(final UUID uuid) throws CardNotFoundException {
        return Copier.weapon(getCardWithUuid(weapons, uuid));
    }

    public List<Weapon> getWeapons() {
        return Copier.weapons(weapons);
    }

    public Room room(final String uuid) throws CardNotFoundException {
        return room(UUID.fromString(uuid));
    }

    public Room room(final UUID uuid) throws CardNotFoundException {
        return Copier.room(getCardWithUuid(rooms, uuid));
    }

    public List<Room> getRooms() {
        return Copier.rooms(rooms);
    }

    private <T extends BaseCard> T getCardWithUuid(final List<T> cards, final UUID uuid)
        throws CardNotFoundException {
        return cards.stream()
            .filter(e -> Objects.equals(e.uuid(), uuid))
            .findFirst()
            .orElseThrow(CardNotFoundException::new);
    }
}
