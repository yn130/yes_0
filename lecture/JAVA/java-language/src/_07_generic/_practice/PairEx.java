package _07_generic._practice;

public class PairEx {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(2, "Two");
        Pair< String,Integer > pair2 = new Pair<>("One", 1);

        System.out.println("Key: " + pair2.getKey() + ", Value: " + pair2.getValue());
        System.out.println("Key: " + pair1.getKey() + ", Value: " + pair1.getValue());
    }
}