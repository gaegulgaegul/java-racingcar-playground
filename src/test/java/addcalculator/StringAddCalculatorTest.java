package addcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddCalculatorTest {

    private StringAddCalculator stringAddCalculator = new StringAddCalculator();

    @Test
    @DisplayName("공백 또는 null인 경우 0 반환")
    void empty() {
        int result = stringAddCalculator.calculate("");
        assertThat(result).isEqualTo(0);

        result = stringAddCalculator.calculate(null);
        assertThat(result).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자 하나를 문자열로 입력하는 경우 해당 숫자 반환")
    void 숫자_하나() {
        int result = stringAddCalculator.calculate("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    @DisplayName("숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환")
    void 숫자_두개_컴마_구분_합계_반환() {
        int result = stringAddCalculator.calculate("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    @DisplayName("구분자를 컴마(,) 이외에 콜론(:)을 사용")
    void 구분자_컴마_콜론_구분_합계() {
        int result = stringAddCalculator.calculate("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("커스텀 구분자 사용")
    void 커스텀_구분자를_지정_합계() {
        int result = stringAddCalculator.calculate("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    @DisplayName("음수 사용 시 예외")
    void 음수_예외() {
        assertThatThrownBy(() -> stringAddCalculator.calculate("-1,2,3"))
                .isInstanceOf(RuntimeException.class);
    }
}
