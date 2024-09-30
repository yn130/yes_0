package _05_class._practice._02;


public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    public String getSpecies() {return species;}
    public void setSpecies(String species) {this.species = species;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}


    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }

    public void AnimalInfo() {
        System.out.println("종: " + species + ", 이름: " + name + ", 나이: " + age);
    }
}
