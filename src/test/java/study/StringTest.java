package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringTest {
    @Test
    void split() {
        String value = "1,2";
        String[] result = value.split(",");
        Assertions.assertThat(result).contains("1");
        Assertions.assertThat(result).contains("2");
    }

    @Test
    void substring() {
        String value = "(1,2)";
        value = value.substring(1, value.length() - 1);
        Assertions.assertThat(value).isEqualTo("1,2");
    }

}