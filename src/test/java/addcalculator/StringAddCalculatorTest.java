package addcalculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest {

    @Test
    @DisplayName("공백 또는 null인 경우 0 반환")
    void empty() {
        StringAddCalculator stringAddCalculator = new StringAddCalculator();
        int result = stringAddCalculator.calculate("");
        assertThat(result).isEqualTo(0);
    }
}
