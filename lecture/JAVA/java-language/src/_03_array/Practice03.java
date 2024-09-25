package _03_array;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> arrayList = new ArrayList<>();


        while (true) {
            System.out.println("문자를 입력해 주세요. : ");
            String userInput = sc.nextLine();

            if ("exit".equalsIgnoreCase(userInput)) {
                break;
            }
            arrayList.add(userInput);
        }

        for ( String List : arrayList ) {
            System.out.println(List + " ");
        }



    }
}
