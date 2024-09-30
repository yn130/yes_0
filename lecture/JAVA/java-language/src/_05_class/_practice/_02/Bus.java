package _05_class._practice._02;

public class Bus extends Vehicle {
    private int passengerCapacity;

    // Bus 생성자
    public Bus(String brand, String model, int year, int passengerCapacity) {
        super(brand, model, year);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return "Bus [" + super.toString() + ", passengerCapacity=" + passengerCapacity + "]";
    }
    void fetch() {
        System.out.println("승객을 운송합니다");
    }
}