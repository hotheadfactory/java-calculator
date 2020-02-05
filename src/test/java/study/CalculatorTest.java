package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void calculate() {
        String value = "2 + 3 * 4 / 2";
        String[] values = value.split(" ");
        Assertions.assertThat(Calculator.calculate(values)).isEqualTo(10);
    }
}
