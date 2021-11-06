package io.github.samituga.cluedohelperlibrary.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 * POJO that represents the common information that every card has.
 */
@Data
@JsonInclude(
    JsonInclude.Include.NON_NULL
)
@JsonIgnoreProperties(
    ignoreUnknown = true
)
public abstract class BaseCard {
  @NotBlank
  @JsonProperty("name")
  protected String name;
}
