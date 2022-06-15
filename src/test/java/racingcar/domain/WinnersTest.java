package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnersTest {

    @Test
    @DisplayName("최종 우승자 생성")
    void it_create_winners() {
        Cars cars = new Cars("pobi,honux");
        Winners winners = cars.getWinners();
        assertThat(winners.toString()).isEqualTo("pobi, honux");
    }
}
