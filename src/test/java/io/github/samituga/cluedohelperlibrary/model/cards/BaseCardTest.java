package io.github.samituga.cluedohelperlibrary.model.cards;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.UUID;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class BaseCardTest {


    static Stream<Arguments> playersFailures() {

        return Stream.of(
            Arguments.of(new Character("name", UUID.randomUUID()), Character.class),
            Arguments.of(new Weapon("name", UUID.randomUUID()), Weapon.class),
            Arguments.of(new Room("name", UUID.randomUUID()), Room.class),
            Arguments.of(new BaseCard.Unknown("name", UUID.randomUUID()), BaseCard.Unknown.class));
    }

    @ParameterizedTest
    @MethodSource("playersFailures")
    void verifyReturnsCorrectClass(BaseCard card, Class<? extends BaseCard> clazz) {
        assertThat(card.type(), equalTo(clazz));
    }
}