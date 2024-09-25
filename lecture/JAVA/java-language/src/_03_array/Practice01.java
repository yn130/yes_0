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

