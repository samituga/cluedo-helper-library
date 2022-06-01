package io.github.samituga.cluedohelperlibrary.engine;


import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.util.GameRules;
import io.github.samituga.cluedohelperlibrary.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/**
 * Model object that stores the game cards and players information.
 */
public class GameInfo { // TODO: 2022-02-03 tests

    private final List<Player> players;
    private final List<Character> characters;
    private final List<Weapon> weapons;
    private final List<Room> rooms;

    private final int cardsPerPlayer;

    public GameInfo(final List<Player> players,
                    final List<Character> characters,
                    final List<Weapon> weapons,
                    final List<Room> rooms) {

        this.players = new ArrayList<>(players);
        this.characters = new ArrayList<>(characters);
        this.weapons = new ArrayList<>(weapons);
        this.rooms = new ArrayList<>(rooms);

        this.cardsPerPlayer = GameRules.cardsPerPlayer(this.players.size());
    }

    public GameInfo(final GameStartInfo gameStartInfo) {

        this.players = new ArrayList<>(gameStartInfo.players());
        this.characters = new ArrayList<>(gameStartInfo.characters());
        this.weapons = new ArrayList<>(gameStartInfo.weapons());
        this.rooms = new ArrayList<>(gameStartInfo.rooms());

        this.cardsPerPlayer = GameRules.cardsPerPlayer(this.players.size());
    }

    public Player player(final UUID uuid) {
        return players.stream()
              .filter(e -> Objects.equals(e.uuid(), uuid))
              .findFirst()
              .orElse(null);
    }

    public List<Player> players() {
        return new ArrayList<>(players);
    }

    public Character character(final UUID uuid) {
        return getCardWithUuid(characters, uuid);
    }

    public List<Character> characters() {
        return new ArrayList<>(characters);
    }

    public Weapon weapon(final UUID uuid) {
        return getCardWithUuid(weapons, uuid);
    }

    public List<Weapon> weapons() {
        return new ArrayList<>(weapons);
    }

    public Room room(final UUID uuid) {
        return getCardWithUuid(rooms, uuid);
    }

    public List<Room> rooms() {
        return new ArrayList<>(rooms);
    }

    private <T extends BaseCard> T getCardWithUuid(final List<T> cards, final UUID uuid) {
        return Util.getOrElseNull(cards, e -> Objects.equals(e.uuid(), uuid));
    }

    public List<BaseCard> allCards() {
        final List<BaseCard> cards = new ArrayList<>();
        cards.addAll(characters);
        cards.addAll(weapons);
        cards.addAll(rooms);
        return cards;
    }

    public int getCardsPerPlayer() {
        return cardsPerPlayer;
    }
}
