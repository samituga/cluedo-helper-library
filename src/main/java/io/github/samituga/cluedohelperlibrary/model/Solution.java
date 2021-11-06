package io.github.samituga.cluedohelperlibrary.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.samituga.cluedohelperlibrary.model.cards.Character;
import io.github.samituga.cluedohelperlibrary.model.cards.Room;
import io.github.samituga.cluedohelperlibrary.model.cards.Weapon;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * <p> POJO that represents the solution cards of the game.</p>
 * <p>Who - {@link Character}</p>
 * <p>With - {@link Weapon}</p>
 * <p>Where - {@link Room}</p>
 */
@Data
@AllArgsConstructor
@JsonPropertyOrder({
    "name"
})
public class Solution {

  @NotNull
  @JsonProperty("character")
  private final Character character;

  @NotNull
  @JsonProperty("weapon")
  private final Weapon weapon;

  @NotNull
  @JsonProperty("room")
  private final Room room;
}
