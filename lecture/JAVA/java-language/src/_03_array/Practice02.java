

package _03_array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();

        while (true) {
            System.out.println("문자를 입력해 주세요. :");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            arrayList.add(input);
        }
        for (String item : arrayList) {
            System.out.println(item);
        }

        sc.close();
    }
}