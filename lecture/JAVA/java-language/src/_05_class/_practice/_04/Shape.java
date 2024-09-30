package _05_class._practice._04;

public abstract class Shape {
    // 필드 선언
    String color;
    String type;


    // 생성자 선언
    public Shape( String type, String color) {
        this.type = type;
        this.color = color;
    }

    abstract double calculateArea();

    public void getColor(){
        System.out.println("도형의 색상: " + color);
    }
}