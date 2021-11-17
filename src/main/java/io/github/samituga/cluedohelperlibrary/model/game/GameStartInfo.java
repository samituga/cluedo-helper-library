package io.github.samituga.cluedohelperlibrary.model.game;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;
import lombok.Getter;
import lombok.ToString;


/**
 * Represents the information necessary to start the game.
 */
@Getter
@ToString
public class GameStartInfo {

  private final List<Player> players;
  private final List<Character> characters;
  private final List<Weapon> weapons;
  private final List<Room> rooms;


  /**
   * Constructor with the necessary information to start the engine.
   *
   * @param players    the {@link Player players}
   * @param characters the {@link Character characters}
   * @param weapons    the {@link Weapon weapons}
   * @param rooms      the {@link Room rooms}
   */
  public GameStartInfo(List<Player> players,
                       List<Character> characters,
                       List<Weapon> weapons,
                       List<Room> rooms) {
    this.players = players;
    this.characters = characters;
    this.weapons = weapons;
    this.rooms = rooms;
  }
}
