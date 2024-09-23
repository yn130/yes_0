package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;

        x = 10;
        y = 20;
        a = 5.0f;
        b = 10.5f;

        System.out.println("==== x, y ====");
        System.out.println("x + y =" + (x + y));
        System.out.println("x - y =" + (x - y));
        System.out.println("x * y =" + (x * y));
        System.out.println("x / y =" + (x / y));
        System.out.println("x % y =" + (x % y));



        System.out.println("==== a, b ====");
        System.out.println("a + b =" + (a + b));
        System.out.println("a - b =" + (a - b));
        System.out.println("a * b =" + (a * b));
        System.out.println("a / b =" + (a / b));
        System.out.println("a % b =" + (a % b));


        System.out.println("==== 증감연산자 ====");
        System.out.println("x++ = " + x++ + ' ' + x);
        System.out.println("++x = " + ++x);
        System.out.println("x-- = " + x-- + ' ' + x);
        System.out.println("--x = " + --x);

        System.out.println("==== 산술적인 대입 연산자 ====");
        System.out.println(x);
        System.out.println("x += 5 >> " + (x += 5) );
        System.out.println("x -= 5 >> " + (x -= 5) );
        System.out.println("x *= 5 >> " + (x *= 5) );
        System.out.println("x /= 5 >> " + (x /= 5) );
        System.out.println("x %= 5 >> " + (x %= 5) );



        System.out.println("==== 비교 연산자 ====");
        System.out.println("a > b >>>" + (a > b));
        System.out.println("a >= b >>>" + (a >= b));
        System.out.println("a < b >>>" + (a < b));
        System.out.println("a <= b >>>" + (a <= b));
        System.out.println("a == b >>>" + (a == b));
        System.out.println("a != b >>>" + (a != b));


        System.out.println("==== 논리 연산자 ====");
        boolean j = true;
        boolean k = false;
        boolean l = true;
        System.out.println("j && k >>" + ( j && k));
        System.out.println("j && l >>" + ( j && l));
        System.out.println("j || k >>" + ( j || k));
        System.out.println("j || l >>" + ( j || l));
        System.out.println("!j >>" + ( !j ));



        System.out.println("==== 삼항 연산자 ====");
        System.out.println(x > y ? "x는 y보다 크다" : "x는 y보다 크지 않다");




    }
}
