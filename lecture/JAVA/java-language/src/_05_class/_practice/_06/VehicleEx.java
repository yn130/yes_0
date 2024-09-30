package _05_class._practice._06;

public class VehicleEx {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];
        vehicles[0] = new Car("my Car", 200);
        vehicles[1] = new Airplane("my Airplane", 1000);

        for (Vehicle v : vehicles){
            v.move();
            if ( v instanceof Flyable) {
                ((Flyable) v).fly();
            }
        }





    }

}
