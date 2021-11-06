package io.github.samituga.cluedohelperlibrary.model.cards;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * POJO that represents a Cluedo room.
 */
@Data
@EqualsAndHashCode(
    callSuper = true
)
@JsonPropertyOrder({
    "name"
})
public class Room extends BaseCard {
}