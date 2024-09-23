package _02_control_statement;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 입력하세요");
        int num = scanner.nextInt();

//        for (int i = num; i > 0; i--) {
//            System.out.print(i + " ");

        for (int i = 1; i <= num ; i++) {
            System.out.print(i + " ");
            scanner.close();
        }
    }
}
