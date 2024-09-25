//
//package _02_control_statement;
//
//public class Practice05 {
//
//    public static void main(String[] args) {
//
//
//
//        System.out.printf("반지름이 5인 원의 넓이: %.14f\n", area(5));
//        System.out.printf("가로 4, 세로 7인 직사각형의 넓이: %.1f\n", area(4, 7));
//        System.out.printf("밑변 6, 높이 3인 삼각형의 넓이: %.1f\n", area(6, 3, 2));
//    }
//
//    public static double area(double radius) {
//        return Math.PI * radius * radius;
//    }
//
//    public static double area(double width, double height) {
//        return width * height;
//    }
//
//    public static double area(double base, double height,  double divide ) {
//            return (base * height) / divide;
//    }
//}



package _02_control_statement;

public class Practice05 {

    public static void main(String[] args) {

        Practice05 ol = new Practice05();


        System.out.printf("반지름이 5인 원의 넓이: %.14f\n", ol.area(5));
        System.out.printf("가로 4, 세로 7인 직사각형의 넓이: %.1f\n", ol.area(4, 7));
        System.out.printf("밑변 6, 높이 3인 삼각형의 넓이: %.1f\n", ol.area(6, 3, 2));
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double width, double height) {
        return width * height;
    }

    public double area(double base, double height,  double divide ) {
        return (base * height) / divide;
    }
}

