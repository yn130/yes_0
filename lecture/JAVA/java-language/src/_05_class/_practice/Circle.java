package _05_class._practice;

public class Circle {

    public static final double PI = Math.PI;
    final double radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public void area(){
        System.out.println("원의 반지름 : " + this.radius);
        System.out.println("원의 넓이 : " + this.PI * (this.radius * this.radius));
    }
}
