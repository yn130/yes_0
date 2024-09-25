package _04_exception;

import java.util.Scanner;
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
        Scanner sc = new Scanner(System.in);
        int arrSize = 0;

        try {
            do {
                System.out.println("배열 크기 입력");
                arrSize = sc.nextInt();

                int[] arr = new arr[arrSize];
                int sum = 0;

            System.out.println("배열의 요소를 입력하세요:");
            for (int i =0; i < arrSize; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
            }

            double avg = (double) sum / arrSize;
            System.out.println("배열 요소의 평균: " + avg);

            } while (arrSize <= 0 );
        } catch (NullPointerException e) {
            System.out.println("입력값이 잘못됐습니다. " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 잘못되었습니다. " + e.getMessage());
        } catch (ArithmeticException e ) {
            System.out.println("0으로 나눌 수 없습니다. " + e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e ) {
            System.out.println("배열 인덱스가 범위를 벗어났습니다. " + e.getMessage());
        }  catch (Exception e) {
            // 그 외 예외 처리
            System.out.println("알 수 없는 오류가 발생했습니다: " + e.getMessage());
        } finally {
            System.out.println("프로그램을 종료합니다.");
            if (sc != null) {
                sc.close();
            }
        }
    }
}





