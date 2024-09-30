package _05_class._practice._01;

public class Cat extends Animal {

    private String food;

    public Cat(int age, String food) {
        super("고양이", "츄츄", age);
        this.food = food;
    }

    @Override
    public void makeSound() {
        System.out.println("고양이는 '야옹' 소리를 낸다");
    }

    public void likeFood() {
        System.out.println(getName() + "는 " + food + "를 가장 좋아한다.");
    }
}