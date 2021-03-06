package study;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Operator {
    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private String operator;
    private BiFunction<Double, Double, Double> expression;

    Operator(String operator, BiFunction<Double, Double, Double> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public static Operator of(String operator) {
        return Arrays.stream(values())
                .filter(op -> op.operator.equals(operator))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 연산자입니다."));
    }

    public Double calculate(Double operand1, Double operand2) {
        return expression.apply(operand1, operand2);
    }
}
