package study;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산식을 입력하세요:");
		String value = scanner.nextLine();
		String[] values = value.split(" ");
		System.out.println(Calculator.calculate(values));
	}
}