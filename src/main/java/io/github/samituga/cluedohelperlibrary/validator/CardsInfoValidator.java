package io.github.samituga.cluedohelperlibrary.validator;

import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.CHARACTERS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.DUPLICATE_CARDS;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.ROOMS_SIZE;
import static io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException.Reason.WEAPONS_SIZE;
import static io.github.samituga.cluedohelperlibrary.util.GameRules.TOTAL_NUMBER_OF_CHARACTER_CARDS;
import static io.github.samituga.cluedohelperlibrary.util.GameRules.TOTAL_NUMBER_OF_ROOM_CARDS;
import static io.github.samituga.cluedohelperlibrary.util.GameRules.TOTAL_NUMBER_OF_WEAPON_CARDS;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.model.cards.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.experimental.UtilityClass;

/**
 * Will validate {@link io.github.samituga.cluedohelperlibrary.model.game.GameStartInfo
 * GameStartInfo} card detail.
 */
@UtilityClass
class CardsInfoValidator {

  public static void validateCards(List<Character> characters,
      List<Weapon> weapons,
      List<Room> rooms) throws CardValidationException {

    validateCardsSize(characters, weapons, rooms);
    validateCardsDuplicates(characters, weapons, rooms);
  }

  private static void validateCardsSize(List<Character> characters,
      List<Weapon> weapons,
      List<Room> rooms) throws CardValidationException {

    int charactersSize = characters.size();
    int weaponsSize = weapons.size();
    int roomsSize = rooms.size();

    if (charactersSize != TOTAL_NUMBER_OF_CHARACTER_CARDS) {
      throw new CardValidationException(CHARACTERS_SIZE);
    }

    if (weaponsSize != TOTAL_NUMBER_OF_WEAPON_CARDS) {
      throw new CardValidationException(WEAPONS_SIZE);
    }

    if (roomsSize != TOTAL_NUMBER_OF_ROOM_CARDS) {
      throw new CardValidationException(ROOMS_SIZE);
    }
  }

  private static void validateCardsDuplicates(List<Character> characters,
      List<Weapon> weapons,
      List<Room> rooms) throws CardValidationException {

    List<BaseCard> allCards = Stream
        .of(characters, weapons, rooms)
        .flatMap(Collection::stream)
        .collect(Collectors.toList());

    Set<BaseCard> set = findDuplicates(allCards);

    if (!set.isEmpty()) {
      throw new CardValidationException(DUPLICATE_CARDS);
    }
  }

  private Set<BaseCard> findDuplicates(Collection<BaseCard> collection) {
    Set<String> uniques = new HashSet<>();
    return collection.stream()
        .filter(e -> !uniques.add(e.name()))
        .collect(Collectors.toSet());
  }

}
