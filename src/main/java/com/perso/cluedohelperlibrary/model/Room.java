package com.perso.cluedohelperlibrary.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * POJO that represents a Cluedo room.
 */
@JsonPropertyOrder({
    "name"
})
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Room extends BaseCard {
}
