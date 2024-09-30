package _05_class._practice._02;

public class Dog extends Animal {
    private String hobby;

    public Dog( String name, int age, String hobby) {
        super("강아지", name, age);
        this.hobby = hobby;
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "는 " + getSpecies() + "이기 때문에 '멍멍' 소리를 낸다");
    }

    public void favorite() {
        System.out.println(getName() + "는 " + hobby + "를 가장 좋아한다.");
    }
}