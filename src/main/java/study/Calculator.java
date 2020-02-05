package study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public static float calculate(String[] values) {
        float result = 0;
        Queue<String> elements = new LinkedList<>(Arrays.asList(values));
        result = Float.parseFloat(elements.poll());
        while (!elements.isEmpty()) {
            String operator = elements.poll();
            float operand = Float.parseFloat(elements.poll());
            result = calculateEach(result, operator, operand);
        }
        return result;
    }

    private static float calculateEach(float result, String operator, float operand) {
        switch (operator) {
            case "+":
                return result + operand;
            case "-":
                return result - operand;
            case "/":
                return result / operand;
            case "*":
                return result * operand;
        }
        throw new IllegalArgumentException("올바르지 않은 계산식입니다!");
    }
}
