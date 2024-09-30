package _05_class._practice._01;

public class Car extends Vehicle {
    private boolean convertible;

    public Car(String brand, String model, int year, boolean convertible) {
        super(brand, model, year);
        this.convertible = convertible;
    }

    @Override
    public String toString() {
        return "Car [" + super.toString() + ", convertible=" + convertible + "]";
    }

    void fetch() {
        System.out.println("주차했습니다.");
    }
}
