//package _03_array;
//
//import java.util.Scanner;
//
//public class Practice01 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("5개의 정수를 입력하세요");
//
//        int[] arr = {scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        System.out.println("sum = " + sum);
//
//        // 평균 구하기
//        double avg = (double) sum / arr.length;
//        System.out.println("평균은= " + (double)avg);
//
//
//    }
//}



package _03_array;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        System.out.println("sum = " + sum);


        double avg = (double) sum / arr.length;
        System.out.println("평균은 = " + avg);
    }
}


//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ArrayExample {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int arraySize = 0;
//
//        try {
//            // 1. 사용자가 입력한 배열 크기를 받음
//            System.out.print("배열의 크기를 입력하세요: ");
//            arraySize = scanner.nextInt();
//
//            // 배열 크기가 0 이하인 경우 예외 처리
//            if (arraySize <= 0) {
//                throw new IllegalArgumentException("배열 크기는 1 이상이어야 합니다.");
//            }
//
//            // 2. 배열 생성
//            int[] array = new int[arraySize];
//            int sum = 0;
//
//            // 3. 배열 요소 입력
//            System.out.println("배열의 요소를 입력하세요:");
//            for (int i = 0; i < arraySize; i++) {
//                System.out.print("array[" + i + "] = ");
//                array[i] = scanner.nextInt(); // 요소 입력받음
//                sum += array[i]; // 요소들의 합 계산
//            }
//
//            // 4. 평균 계산 및 출력
//            double average = (double) sum / arraySize;
//            System.out.println("배열 요소의 평균: " + average);
//
//        } catch (InputMismatchException e) {
//            // 숫자가 아닌 입력을 받을 경우 예외 처리
//            System.out.println("유효하지 않은 입력입니다. 정수를 입력해주세요.");
//        } catch (IllegalArgumentException e) {
//            // 배열 크기가 잘못되었을 경우 예외 처리
//            System.out.println(e.getMessage());
//        } catch (Exception e) {
//            // 그 외 예외 처리
//            System.out.println("예상치 못한 오류가 발생했습니다: " + e.getMessage());
//        } finally {
//            // 자원 해제
//            scanner.close();
//        }
//    }
//}
