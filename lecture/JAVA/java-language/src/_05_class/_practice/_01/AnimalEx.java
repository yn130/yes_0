package _05_class._practice._01;

public class AnimalEx {
    public static void main(String[] args) {

        Cat myCat = new Cat(11, "츄르");
        myCat.AnimalInfo();;
        myCat.makeSound();
        myCat.likeFood();

        System.out.println( " ================== " );

        Dog myDog = new Dog( "초롱이", 5, "산책");
        myDog.AnimalInfo();
        myDog.makeSound();
        myDog.favorite();
    }
}

