package _05_class._practice._04;

public class Circle2 extends Shape{
    int radius;

    public Circle2(String type, String color, int radius ){
        super(type, color);
        this.radius = radius;
    }

    @Override
    double calculateArea(){
        return radius * radius * Math.PI;
    }
}
