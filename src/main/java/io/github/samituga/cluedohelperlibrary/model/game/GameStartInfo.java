package io.github.samituga.cluedohelperlibrary.model.game;

import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;
import lombok.Getter;


/**
 * POJO that holds the information necessary to start the game.
 */
@Getter
public class GameStartInfo {

  // TODO: 08/11/2021 WIP
  private final List<Player> players;
  private final List<Character> characters;
  private final List<Weapon> weapons;
  private final List<Room> rooms;


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
