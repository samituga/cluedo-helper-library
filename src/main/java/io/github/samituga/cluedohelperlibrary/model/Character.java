package io.github.samituga.cluedohelperlibrary.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * POJO that represents a Cluedo character.
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(
    callSuper = true
)
@JsonPropertyOrder({
    "name"
})
public class Character extends BaseCard {
}
