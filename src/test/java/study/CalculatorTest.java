package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest {
    @ParameterizedTest
    @DisplayName("값이 포함되었는지 확인하는 테스트")
    @CsvSource(value = { "2 + 3 * 4 / 2:10", "4 + 5 / 2 + 7:11.5"}, delimiter = ':')
    void calculate(String expression, String answer) {
        String[] values = expression.split(" ");
        Assertions.assertThat(Calculator.calculate(values)).isEqualTo(Float.parseFloat(answer));
    }
}
