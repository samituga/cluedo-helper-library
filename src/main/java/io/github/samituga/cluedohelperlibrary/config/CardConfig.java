package io.github.samituga.cluedohelperlibrary.config;


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
@ConfigurationProperties(prefix = "cluedohelper.cards")
@PropertySource(factory = YamlPropertySourceFactory.class, value = "classpath:model/cards.yml")
public class CardConfig {

  private Map<String, Character> characters;
  private Map<String, Weapon> weapons;
  private Map<String, Room> rooms;

  public Character getCharacter(String character) {
    return get(characters, character);
  }

  public Weapon getWeapon(String weapon) {
    return get(weapons, weapon);
  }

  public Room getRoom(String room) {
    return get(rooms, room);
  }

  private <T> T get(Map<String, T> map, String key) {

    T card = map.get(key);

    if (card == null) {
      throw new IllegalArgumentException();
    }
    return card;
  }

}
