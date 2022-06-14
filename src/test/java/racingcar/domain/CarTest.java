package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @Test
    @DisplayName("자동차 이름을 입력하여 객체를 생성한다.")
    void create_car() {
        Car car = new Car("pobi");
        assertThat(car.getName()).isEqualTo("pobi");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    @DisplayName("random 값이 4이상인 경우 전진한다.")
    void when_random_greater_then_four_then_forward() {
        Car car = new Car("pobi");
        car.forward(5);
        assertThat(car.toString()).isEqualTo("pobi : -");
    }

    @Test
    @DisplayName("자동차 이름은 5자 초과일 수 없다.")
    void length_of_car_name_less_then() {
        assertThatThrownBy(() -> new Car("tooLongName"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
