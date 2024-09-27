package _04_exception;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.InputMismatchException;

public class Practice01 {
    public static void main(String[] args) {
        // 실습 1
        //        int[] arr = {1, 2, 3, 4};
        //
        //
        //        try {
        //            for ( int i = 0; i <=5 ; i++ ) {
        //                System.out.println(arr[i] );
        //            }
        //        } catch (ArrayIndexOutOfBoundsException e) {
        //            System.out.println("인덱스가 범위를 벗어났습니다. ");
        //        }


        // 실습 2
//        Scanner sc = new Scanner(System.in);
//        int arrSize = 0;
//        try {
//            do {
//                System.out.println("1이상의 정수로 배열 크기를 입력하세요 :");
//                try {
//                    arrSize = sc.nextInt();
//
//                    if (arrSize <= 0) {
//                        System.out.println("배열 크기는 1 이상의 정수를 입력해야 합니다.");
//                    }
//                } catch (InputMismatchException e) {
//                    System.out.println("배열의 크기는 1이상의 정수여야 합니다. 유효한 정수를 입력하세요.");
//                    sc.next();
//                }
//            } while (arrSize <= 0);
//
//            int[] arr = new int[arrSize];
//            int sum = 0;
//
//            System.out.println("배열의 요소를 입력하세요 :");
//            for (int i = 0; i < arrSize; i++) {
//                try {
//                    System.out.print((i + 1) + "번째 요소:");
//                    arr[i] = sc.nextInt();
//                    sum += arr[i];
//                } catch (InputMismatchException e) {
//                    System.out.println("배열의 요소는 1이상의 정수여야 합니다. 유효한 숫자를 입력하세요.");
//                    sc.next();
//                    i--;
//                }
//            }
//
//            double avg = (double) sum / arrSize;
//            System.out.println("배열 요소의 평균: " + avg);
//
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없는 오류가 발생했습니다: " + e.getMessage());
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("배열 인덱스가 범위를 벗어났습니다: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
//        } finally {
//            System.out.println("프로그램을 종료합니다.");
//            if (sc != null) {
//                sc.close();
//            }
//        }


        // 실습 3
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;

        try {
            do {
                System.out.print("배열의 크기를 입력하십시오 : ");
                arrSize = sc.nextInt();
                int[] arr = new int[arrSize];

                System.out.println("배열 요소를 입력하십시오:");
                for (int i = 0; i < arrSize; i++) {
                        arr[i] = sc.nextInt();
                }

                // Integer : 키의 타입 지정 > 배열 요소의 정수를  HashMap 키로 !
                // ArrayList<Integer> : 정수를 담을 수 있는 리스트 > HashMap 키에 해당하는 요소가 몇 번 나왔는지를 저장하는 리스트!
                HashMap<Integer, ArrayList<Integer>> duplicateMap = new HashMap<>();

                for (int i = 0; i < arrSize; i++) {
                    if (duplicateMap.containsKey(arr[i])) {
                        duplicateMap.get(arr[i]).add(arr[i]);
                    } else {
                        ArrayList<Integer> subArray = new ArrayList<>();
                        subArray.add(arr[i]);
                        duplicateMap.put(arr[i], subArray);
                    }
                }

                System.out.println("중복된 숫자 서브 배열:");
                // entrySet() 메서드 : HashMap의 모든 키-값 쌍을 Set 형태로 반환함
                // Map.Entry :  그 키와 값의 쌍을 나타냄
                    // entry.getKey() : 키(숫자)에 접근 할 수 있음
                    // entry.getValue() : 값(리스트)에 접근 할 수 있음
                for (Map.Entry<Integer, ArrayList<Integer>> entry : duplicateMap.entrySet()) {
                    if (entry.getValue().size() > 1) {
                        System.out.println(entry.getValue());
                    }
                }
            } while (arrSize <= 0);

            } catch(Exception e){
                System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
            } finally {
                System.out.println("프로그램을 종료합니다.");
                if (sc != null) {
                    sc.close();
                }
            }
    }
}