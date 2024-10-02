package _07_generic._practice;

public class CalculatorEx {
    public static void main(String[] args) {

        Calculator<Integer> calc1 = new Calculator<>(10, 5);
        Calculator<Double> calc2 = new Calculator<>(10.541241, 20.34124124144);


        System.out.println("Integer Sum: " + calc1.add());
        System.out.println("Double Sum: " + calc2.add());
    }

}
