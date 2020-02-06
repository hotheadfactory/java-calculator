package study;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("수식을 입력하세요: ");
        String[] values = scanner.nextLine().split(" ");
        System.out.println("정답은 " + Calculator.calculate(values) + "입니다.");
    }
}
