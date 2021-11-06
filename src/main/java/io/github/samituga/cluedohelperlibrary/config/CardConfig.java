package io.github.samituga.cluedohelperlibrary.config;


import io.github.samituga.cluedohelperlibrary.model.BaseCard;
import io.github.samituga.cluedohelperlibrary.model.Character;
import io.github.samituga.cluedohelperlibrary.model.Room;
import io.github.samituga.cluedohelperlibrary.model.Weapon;
import java.util.Map;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Configuration class to load the game cards from a resource file.
 */
@Setter
@Configuration
@EnableConfigurationProperties
@PropertySource(
    factory = YamlPropertySourceFactory.class,
    value = "classpath:model/cards.yml"
)
@ConfigurationProperties(
    prefix = "cluedohelper.cards"
)
public class CardConfig {

  private Map<String, Character> characters;
  private Map<String, Weapon> weapons;
  private Map<String, Room> rooms;

  /**
   * Returns the requested {@link Character}
   *
   * @param character key of the {@link Character} to return
   * @return the {@link Character}
   */
  public Character getCharacter(String character) {
    return get(characters, character);
  }

  /**
   * Returns the requested {@link Weapon}
   *
   * @param weapon key of the {@link Weapon} to return
   * @return the {@link Weapon}
   */
  public Weapon getWeapon(String weapon) {
    return get(weapons, weapon);
  }

  /**
   * Returns the requested {@link Room}
   *
   * @param room key of the {@link Room} to return
   * @return the {@link Room}
   */
  public Room getRoom(String room) {
    return get(rooms, room);
  }

  private <T extends BaseCard> T get(Map<String, T> map, String key) {

    T card = map.get(key);

    if (card == null) {
      throw new IllegalArgumentException();
    }
    return card;
  }

}
