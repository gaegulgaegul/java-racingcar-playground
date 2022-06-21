package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @Test
    @DisplayName("이름은 5자 초과일 수 없다.")
    void create_name() {
        Name name = new Name("pobi");
        assertThat(name).isEqualTo(new Name("pobi"));
    }

    @Test
    @DisplayName("이름은 5자 초과일 수 없다.")
    void length_of_car_name_less_then() {
        assertThatThrownBy(() -> new Name("tooLongName"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}