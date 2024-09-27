package _05_class._practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice01Ex {

    public static void main(String[] args) {

//        Practice01 p1 = new Practice01();
//        p1.area();
//===================================================================================//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. ");
//
//        int width = sc.nextInt();
//        int height = sc.nextInt();
//
//        Practice01 r1 = new Practice01(width,height);
//        System.out.println(r1.area());

//===================================================================================//

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. ");
//
//        int width = sc.nextInt();
//        int height = sc.nextInt();
//
//        Practice01 r1 = new Practice01();
//
//        System.out.println(r1.area());

//===================================================================================//

        Scanner sc = new Scanner(System.in);
        List<Practice01> rectList = new ArrayList<>();

        while (true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요. ");

            int width = sc.nextInt();
            int height = sc.nextInt();

            if (width == 0 && height == 0) {
                break;
            }

            Practice01 r1 = new Practice01(width);
            r1.setHeight(height);
            rectList.add(r1);
        }

        for (Practice01 rect : rectList) {
            System.out.println("가로길이는 " + rect.getWidth());
            System.out.println("세로길이는 " + rect.getHeight());
            System.out.println("넓이는 " + rect.area());
            System.out.println("------------------------------------");
        }
        System.out.println("Rectangle 인스턴스의 개수는: " + Practice01.getCount());





    }
}
