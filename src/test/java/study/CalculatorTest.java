package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTest {
    @ParameterizedTest
    @DisplayName("계산기가 잘 작동하는지 확인하는 테스트")
    @CsvSource(value = {"2 + 3 * 4 / 2:10", "4 + 5 / 2 + 7:11.5", "1 + 2 / 3 * 4:4", "1:1"}, delimiter = ':')
    void calculate(String expression, double answer) {
        String[] values = expression.split(" ");
        Assertions.assertThat(Calculator.calculate(values)).isEqualTo(answer);
    }
}
