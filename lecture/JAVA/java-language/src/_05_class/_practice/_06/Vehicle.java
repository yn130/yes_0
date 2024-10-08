package _05_class._practice._06;


public abstract class Vehicle {
    private String name;
    private int maxSpeed;

    public Vehicle(String name, int maxSpeed){
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getMaxSpeed() {return maxSpeed;}
    public void setMaxSpeed(int maxSpeed) {this.maxSpeed = maxSpeed;}

    abstract void move();




}
