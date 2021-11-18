package io.github.samituga.cluedohelperlibrary.validator;

import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.DUPLICATE_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_CARDS_PER_PLAYER_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_NUMBER_OF_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.INVALID_PLAY_ORDER;
import static io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException.Reason.NO_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.util.GameRules.CARDS_PER_PLAYER_3_PLAYERS;
import static io.github.samituga.cluedohelperlibrary.util.GameRules.CARDS_PER_PLAYER_6_PLAYERS;

import io.github.samituga.cluedohelperlibrary.exceptions.PlayerValidationException;
import io.github.samituga.cluedohelperlibrary.model.Player;
import io.github.samituga.cluedohelperlibrary.util.GameRules;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import lombok.experimental.UtilityClass;

/**
 * Will validate {@link io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo
 * GameStartInfo} player detail.
 */
@UtilityClass
class PlayerInfoValidator {

  public static void validatePlayers(List<Player> players) throws PlayerValidationException {

    if (players == null || players.isEmpty()) {
      throw new PlayerValidationException(NO_PLAYERS);
    }
    validatePlayersNumber(players);
    validateDuplicatePlayers(players);
    validatePlayersPlayOrder(players);
    validatePlayersCardsSize(players);
  }

  private static void validatePlayersNumber(List<Player> players) throws PlayerValidationException {

    int numberOfPlayers = players.size();
    if (!GameRules.POSSIBLE_PLAYERS_NUMBER.contains(numberOfPlayers)) {
      throw new PlayerValidationException(INVALID_NUMBER_OF_PLAYERS);
    }
  }

  private static void validateDuplicatePlayers(List<Player> players)
      throws PlayerValidationException {

    Set<Player> set = new HashSet<>(players);

    if (set.size() < players.size()) {
      throw new PlayerValidationException(DUPLICATE_PLAYERS);
    }
  }

  private static void validatePlayersPlayOrder(List<Player> players)
      throws PlayerValidationException {

    List<Integer> playOrderRange = IntStream
        .range(1, players.size() + 1)
        .boxed()
        .collect(Collectors.toList());

    for (Player player : players) {
      boolean isRemoved = playOrderRange.remove(player.playOrder());
      if (!isRemoved) {
        throw new PlayerValidationException(INVALID_PLAY_ORDER);
      }
    }
  }

  private static void validatePlayersCardsSize(List<Player> players)
      throws PlayerValidationException {

    int cardsSize = 0;

    for (Player player : players) {
      if (cardsSize == 0) {
        cardsSize = player.cards().size();
        continue;
      }
      if (player.cards().size() != cardsSize) {
        throw new PlayerValidationException(INVALID_CARDS_PER_PLAYER_SIZE);
      }
    }

    boolean isThreePlayers = players.size() == 3;

    if (isThreePlayers) {
      if (cardsSize != CARDS_PER_PLAYER_3_PLAYERS) {
        throw new PlayerValidationException(INVALID_CARDS_PER_PLAYER_SIZE);
      }
    } else {
      if (cardsSize != CARDS_PER_PLAYER_6_PLAYERS) {
        throw new PlayerValidationException(INVALID_CARDS_PER_PLAYER_SIZE);
      }
    }
  }

}
