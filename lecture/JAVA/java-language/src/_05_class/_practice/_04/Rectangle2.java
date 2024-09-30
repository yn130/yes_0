package _05_class._practice._04;

public class Rectangle2 extends Shape {
    int width;
    int height;

    public Rectangle2(String type, String color, int width, int height ){
        super(type, color);
        this.width = width;
        this.height = height;
    }

    @Override
    double calculateArea(){
        return width * height;
    }
}
