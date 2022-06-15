package racingcar.utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomUtilsTest {

    @Test
    @DisplayName("랜덤 값 배열 생성")
    void create_random_value_list() {
        int[] numbers = RandomUtils.numbers(3);
        assertThat(numbers.length).isEqualTo(3);
        for (int number : numbers) {
            assertThat(number > 0 && number < 10).isTrue();
        }
    }
}