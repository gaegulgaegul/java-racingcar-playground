package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PositionTest {

    @Test
    @DisplayName("포지션 이동 테스트")
    void move() {
        Position position = new Position();
        position.move(4);
        assertThat(position).isEqualTo(new Position(1));
    }
}