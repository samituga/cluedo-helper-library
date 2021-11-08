package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.DuplicatePlayersException;
import io.github.samituga.cluedohelperlibrary.exceptions.InvalidNumberOfPlayersException;
import io.github.samituga.cluedohelperlibrary.exceptions.NoPlayersException;
import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo;
import io.github.samituga.cluedohelperlibrary.util.GameRules;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Validator for the {@link GameStartInfo}.<br>
 * Will verify if the information to start the game is valid.
 */
public class GameStartInfoValidator {

  public static boolean validateGameStart(GameStartInfo gameStartInfo) {

    return true;
  }

  // TODO: 08/11/2021 Maybe there are too many exceptions might need to do this in a better way
  private static void validatePlayers(List<Player> players)
      throws NoPlayersException, InvalidNumberOfPlayersException, DuplicatePlayersException {
    if (players == null || players.isEmpty()) {
      throw new NoPlayersException();
    }
    validatePlayersNumber(players);
    validateDuplicatePlayers(players);

  }

  private static void validatePlayersNumber(List<Player> players)
      throws InvalidNumberOfPlayersException {

    int numberOfPlayers = players.size();
    if (!GameRules.POSSIBLE_PLAYERS_NUMBER.contains(numberOfPlayers)) {
      throw new InvalidNumberOfPlayersException(GameRules.POSSIBLE_PLAYERS_NUMBER);
    }
  }

  private static void validateDuplicatePlayers(List<Player> players)
      throws DuplicatePlayersException {
    Set<Player> set = new HashSet<>(players); // TODO: 08/11/2021 Implement equals in Player

    if (set.size() < players.size()) {
      throw new DuplicatePlayersException();
    }
  }
}
