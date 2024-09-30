package _05_class._practice._06;

public class Airplane extends Vehicle implements Flyable {
    public Airplane(String name, int maxSpeed){
        super(name, maxSpeed);
    };

    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }

    @Override
    public void fly() {
//        System.out.println("고도 10,000피트에서 비행 중");
        System.out.println("고도 10,000피트에서 비행 중");
    }
}
