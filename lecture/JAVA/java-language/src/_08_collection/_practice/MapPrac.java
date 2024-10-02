package _08_collection._practice;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class MapPrac {

    public static void main(String[] args) {

        Map<String, Integer> nameAgeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("이름 입력: ");
            String name = scanner.nextLine();

            if (name.equals("종료")) {
                break;
            }

            System.out.print("나이 입력: ");
            int age = Integer.parseInt(scanner.nextLine());

            nameAgeMap.put(name, age);
        }
        scanner.close();

        System.out.println("==== 입력 받은 이름과 나이 목록 ====");
        for (Map.Entry<String, Integer> entry : nameAgeMap.entrySet()) {
            System.out.println("이름: " + entry.getKey() + ", 나이: " + entry.getValue());
        }
    }
}

