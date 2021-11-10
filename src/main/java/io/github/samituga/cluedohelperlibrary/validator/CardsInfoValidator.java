package io.github.samituga.cluedohelperlibrary.validator;

import io.github.samituga.cluedohelperlibrary.exceptions.CardValidationException;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import java.util.List;
import lombok.experimental.UtilityClass;

@UtilityClass
class CardsInfoValidator {

  public static void validateCards(List<Character> characters,
                                   List<Weapon> weapons,
                                   List<Room> rooms) throws CardValidationException {


  }

  private static void validateCardsSize(List<Character> characters,
                                        List<Weapon> weapons,
                                        List<Room> rooms) throws CardValidationException {

    int charactersSize = characters.size();
    int weaponsSize = weapons.size();
    int roomsSize = rooms.size();


  }

}
