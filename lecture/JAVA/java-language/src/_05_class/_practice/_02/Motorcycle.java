package _05_class._practice._02;

public class Motorcycle extends Vehicle {
    private String licenseType;

    public Motorcycle(String brand, String model, int year, String licenseType) {
        super(brand, model, year);
        this.licenseType = licenseType;
    }

    @Override
    public String toString() {
        return "Motorcycle [" + super.toString() + ", licenseType='" + licenseType + "']";
    }
    void fetch() {
        System.out.println("올림통을 합니다?");
    }
}
