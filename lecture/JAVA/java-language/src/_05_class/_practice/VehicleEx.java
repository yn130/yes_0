package _05_class._practice;

public class VehicleEx {
    public static void main(String[] args) {
        Bus bus = new Bus("Hyundai", "City Bus", 2022, 30);
        System.out.println("=== Bus 정보 ===");
        System.out.println(bus);
        bus.start();
        bus.fetch();
        bus.stop();

        System.out.println();

        Car car = new Car("Toyota", "Camry", 2023, true);
        System.out.println("=== Car 정보 ===");
        System.out.println(car);
        car.start();
        car.fetch();
        car.stop();

        System.out.println();

        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2021, "A");
        System.out.println("=== Motorcycle 정보 ===");
        System.out.println(motorcycle);
        motorcycle.start();
        motorcycle.fetch();
        motorcycle.stop();
    }
}