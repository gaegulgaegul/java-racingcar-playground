package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {

    @Test
    @DisplayName("자동차 여러 대 생성")
    void it_create_cars_that_split_comma() {
        Cars cars = new Cars("pobi,crong,honux");
        assertThat(cars.size()).isEqualTo(3);
    }

    @Test
    @DisplayName("자동차 전진")
    void forward_cars() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.forward(new int[]{9,3,4});
        assertThat(cars.getPositionViews()).isEqualTo(Arrays.asList("pobi : -","crong : ", "honux : -"));
    }

    @Test
    @DisplayName("레이싱 게임의 우승자가 1명")
    void one_of_winner() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.forward(new int[]{9,3,1});
        Winners winners = cars.getWinners();
        assertThat(winners.toString()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("레이싱 게임의 우승자가 2명")
    void two_of_winner() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.forward(new int[]{9,3,4});
        Winners winners = cars.getWinners();
        assertThat(winners.toString()).isEqualTo("pobi, honux");
    }

    @Test
    @DisplayName("레이싱 게임의 우승자가 2명")
    void all_of_winner() {
        Cars cars = new Cars("pobi,crong,honux");
        cars.forward(new int[]{9,4,4});
        Winners winners = cars.getWinners();
        assertThat(winners.toString()).isEqualTo("pobi, crong, honux");
    }
}
