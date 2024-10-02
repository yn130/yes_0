package _08_collection._practice;
import java.util.HashSet;
import java.util.Scanner;

public class Number {

    public static void main(String[] args) {

            HashSet<Integer> numbers = new HashSet<>();
            Scanner scanner = new Scanner(System.in);
            int number;

            System.out.println("정수를 입력하세요. -1을 입력하면 종료됩니다.");

            while (true) {
                System.out.print("정수 입력: ");
                number = scanner.nextInt();

                if (number == -1) {
                    break;
                }
                numbers.add(number);
            }

            scanner.close();

            System.out.println("중복 제거된 정수 목록: " + numbers);
        }

    }





