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
}
