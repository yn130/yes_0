package _02_control_statement;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("나이를 입력하세요");
        int age = scanner.nextInt();

        if (1 <= age && age <= 7) {
            System.out.println("유아");
        } else if (8 <= age && age <= 13) {
            System.out.println("초등학생");
        } else if (14 <= age && age <= 16) {
            System.out.println("중학생");
        } else if (17 <= age && age <= 19) {
            System.out.println("고등학생");
        } else if (20 <= age) {
            System.out.println("성인");
        }



        System.out.println("이름을 입력하세요");
        String name = scanner.next();

        if (name.equals("홍길동")) {
            System.out.println("남자");
        } else if (name.equals("성춘향")) {
            System.out.println("여자");
        } else {
            System.out.println("모르겠어요");
        }



        System.out.println("공백으로 구분하여 3개의 정수를 입력하세요)");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int sum = num1 + num2 + num3;
        double avg = sum / 3.0;

        int max = num1;
        int min = num1;

        // 최대값
        if (num2 < num3) {
            if (num3 > max) {
                max = num3;
            }
        } else if (num2 > max) {
            max = num2;
        }

        // 최소값
        if (min > num2) min = num2;
        if (min > num3) min = num3;

        String msg = "최대값: " + max +
                "\n최소값: " + min +
                "\n합계: " + sum +
                "\n평균: " + String.format("%.1f", avg);

        System.out.println(msg);

        scanner.close();


    }
}



