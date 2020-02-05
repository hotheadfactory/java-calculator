package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    private Set numbers;
    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }

    @Test
    @DisplayName("Set의 사이즈를 확인하는 테스트")
    void size() {
        int size = numbers.size();
        Assertions.assertThat(size).isEqualTo(3);
    }

    @ParameterizedTest
    @DisplayName("값이 포함되었는지 확인하는 테스트")
    @ValueSource(ints = { 1,2,3 })
    void contains(Integer number) {
        Assertions.assertThat(numbers.contains(number)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("값이 포함되어 있는지 아닌지 확인하는 테스트")
    @CsvSource(value = { "1:true", "2:true", "3:true", "5:false"}, delimiter = ':')
    void containsOrNot(String input, String value) {
        Assertions.assertThat(numbers.contains(Integer.parseInt(input))).isEqualTo(Boolean.parseBoolean(value));
    }
}
