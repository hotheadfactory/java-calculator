package study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    public static double calculate(String[] values) {
        double result = 0;
        Queue<String> elements = new LinkedList<>(Arrays.asList(values));
        result = Double.parseDouble(elements.poll());
        while (!elements.isEmpty()) {
            String operator = elements.poll();
            Double operand = Double.parseDouble(elements.poll());
            result = calculateEach(result, operator, operand);
        }
        return result;
    }

    private static double calculateEach(double result, String operator, double operand) {
        return Operator.of(operator).calculate(result,operand);
    }
}
