package _05_class._practice._04;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        Circle2 c = new Circle2("Circle", "Red", 5);
        Rectangle2 r = new Rectangle2("Rectangle", "Blue", 10, 4 );

        shapes.add(c);
        shapes.add(r);

        for (Shape s : shapes){
            System.out.println("=== " + s.type + " 도형의 정보 ===" );
            s.getColor();
            System.out.println("도형의 넓이 :  " + s.calculateArea());
            System.out.println();
        }


    }

}
