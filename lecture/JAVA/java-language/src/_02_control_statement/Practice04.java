package _02_control_statement;

import java.util.Scanner;

public class Practice04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 두 개를 입력하세요");

        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.printf("덧셈 결과\t\t: %.1f\n", add(num1, num2));
        System.out.printf("뺄셈 결과\t\t: %.1f\n", subtract(num1, num2));
        System.out.printf("나눗셈 결과\t: %.15f\n", divide(num1, num2));
        System.out.printf("곱셈 결과\t\t: %.1f\n", multiply(num1, num2));
    }

    public static double add( double a, double b) {
        return a + b;
    }

    public static double subtract( double a, double b) {
        return a - b;
    }

    public static double divide( double a, double b) {
        return a / b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

}
